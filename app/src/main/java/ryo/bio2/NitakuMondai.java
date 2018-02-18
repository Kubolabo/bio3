package ryo.bio2;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class NitakuMondai extends Activity {


    String Seikai;
    String Setumei;
    int Chapter;
    int Chap;
    int Favo;
    int Done;
    // SoundPool(効果音再生)
    private SoundPool mSoundPool;
    private int[] mSoundId = new int[2]; // 使う効果音の数だけ配列作成
    int QuestionNo = 1;
    int Menu;
    int play = 0;
    int Score = 0;
    int Clr;
    int ryou = 200;//問題数
    String sql;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //タイトルバーを非表示にする（必ずsetContentViewの前にすること）
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        // レイアウトをセットする
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_nitaku_mondai);

        Intent intent = getIntent();

        Chapter = intent.getIntExtra("Chapter", Chapter);
        Menu = intent.getIntExtra("Menu", Menu);


    }

    @Override
    protected void onResume() {
        super.onResume();

// 効果音を使えるように読み込み
        mSoundPool = new SoundPool(3, AudioManager.STREAM_MUSIC, 0);
        mSoundId[0] = mSoundPool.load(getApplicationContext(), R.raw.se_maoudamashii_onepoint15, 1);
        mSoundId[1] = mSoundPool.load(getApplicationContext(), R.raw.se_maoudamashii_onepoint33, 1);


        switch (Menu) {
            case 1://単元選択
                setQuestion();


                break;
            case 2://ランダム
                setQuestion2();
                break;
            case 3://お気に入り
                setQuestion3();
                break;
            case 4://やり直し
                setQuestion4();
                break;  // 問題文セット処理呼び出し


        }
    }

    // 問題文セット処理
    public void setQuestion() {

        // 作成したDatabaseHelperクラスに読み取り専用でアクセス
        DBHelper dbHelper = new DBHelper(this);
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        sql = "SELECT Question, Ans0, Ans1, Ans2,Comment, Chap, Clear,Done,Fav FROM MyTable WHERE _id=" + QuestionNo;
        Cursor c = db.rawQuery(sql, null);
        c.moveToFirst();
        String Mondai = c.getString(c.getColumnIndex("Question")); // 問題文となる
        String Choice1 = c.getString(c.getColumnIndex("Ans1")); // 二択の選択肢1
        String Choice2 = c.getString(c.getColumnIndex("Ans2")); // 二択の選択肢2
        Favo = c.getInt(c.getColumnIndex("Fav")); //お気に入り
        Done = c.getInt(c.getColumnIndex("Done"));
        Chap = c.getInt(c.getColumnIndex("Chap"));//章
        Setumei = c.getString(c.getColumnIndex("Comment")); // 解説
        Clr = c.getInt(c.getColumnIndex("Clear"));
        Seikai = c.getString(c.getColumnIndex("Ans0")); // 答え

        // データベースのクローズ処理
        c.close();
        db.close();

        if (Chapter == Chap) {
            play++;
            ((TextView) findViewById(R.id.textNo)).setText("第" + play + "問");
            ((TextView) findViewById(R.id.textQuestion)).setText("問題：\n" + (Mondai));
            ((Button) findViewById(R.id.button1)).setText(Choice1);
            ((Button) findViewById(R.id.button2)).setText(Choice2);
            ((Button) findViewById(R.id.button1)).setEnabled(true);
            ((Button) findViewById(R.id.button2)).setEnabled(true);


        } else if (Chapter < Chap) {//章の終わりにスコアに進む

            Intent intent = new Intent(NitakuMondai.this, Score.class);
            intent.putExtra("Score", Score);
            intent.putExtra("Play", play);
            startActivity(intent);

        } else {
            QuestionNo++;
            setQuestion();
        }
    }

    public void setQuestion2() {

        // 作成したDatabaseHelperクラスに読み取り専用でアクセス
        DBHelper dbHelper = new DBHelper(this);
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        Random rnd = new Random();
        int ran = rnd.nextInt(ryou) + 1;
        QuestionNo = ran;
        play++;



            sql = "SELECT Question, Ans0, Ans1, Ans2,Comment, Chap, Clear,Done,Fav FROM MyTable WHERE _id=" + QuestionNo;
            Cursor c = db.rawQuery(sql, null);
            c.moveToFirst();
            String Mondai = c.getString(c.getColumnIndex("Question")); // 問題文となる
            String Choice1 = c.getString(c.getColumnIndex("Ans1")); // 四択の選択肢1
            String Choice2 = c.getString(c.getColumnIndex("Ans2")); // 四択の選択肢2
            Favo = c.getInt(c.getColumnIndex("Fav")); //お気に入り
            Done = c.getInt(c.getColumnIndex("Done"));
            Chap = c.getInt(c.getColumnIndex("Chap"));//章
            Setumei = c.getString(c.getColumnIndex("Comment")); // 解説
            Clr = c.getInt(c.getColumnIndex("Clear"));
            Seikai = c.getString(c.getColumnIndex("Ans0")); // 答え

            // データベースのクローズ処理
            c.close();
            db.close();
        if(play<= 20) {

            ((TextView) findViewById(R.id.textNo)).setText("第" + play + "問");
            ((TextView) findViewById(R.id.textQuestion)).setText("問題：\n" + (Mondai));
            ((Button) findViewById(R.id.button1)).setText(Choice1);
            ((Button) findViewById(R.id.button2)).setText(Choice2);
            ((Button) findViewById(R.id.button1)).setEnabled(true);
            ((Button) findViewById(R.id.button2)).setEnabled(true);

        }
        else if (play >= 21) {


            Intent intent2 = new Intent(NitakuMondai.this, Score.class);
            intent2.putExtra("Score", Score);
            intent2.putExtra("Play", play - 1);
            startActivity(intent2);
        }else{

            setQuestion2();
        }

    }

    public void setQuestion3() {

        // 作成したDatabaseHelperクラスに読み取り専用でアクセス
        DBHelper dbHelper = new DBHelper(this);
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        sql = "SELECT Question, Ans0, Ans1, Ans2,Comment, Chap, Clear,Done,Fav FROM MyTable WHERE _id=" + QuestionNo;
        Cursor c = db.rawQuery(sql, null);
        c.moveToFirst();
        String Mondai = c.getString(c.getColumnIndex("Question")); // 問題文となる
        String Choice1 = c.getString(c.getColumnIndex("Ans1")); // 四択の選択肢1
        String Choice2 = c.getString(c.getColumnIndex("Ans2")); // 四択の選択肢2
        Favo = c.getInt(c.getColumnIndex("Fav")); //お気に入り
        Done = c.getInt(c.getColumnIndex("Done"));
        Chap = c.getInt(c.getColumnIndex("Chap"));//章
        Setumei = c.getString(c.getColumnIndex("Comment")); // 解説
        Clr = c.getInt(c.getColumnIndex("Clear"));
        Seikai = c.getString(c.getColumnIndex("Ans0")); // 答え

        // データベースのクローズ処理
        c.close();
        db.close();

        if (Favo == 1) {
            play++;
            ((TextView) findViewById(R.id.textNo)).setText("第" + play + "問");
            ((TextView) findViewById(R.id.textQuestion)).setText("問題：\n" + (Mondai));
            ((Button) findViewById(R.id.button1)).setText(Choice1);
            ((Button) findViewById(R.id.button2)).setText(Choice2);
            ((Button) findViewById(R.id.button1)).setEnabled(true);
            ((Button) findViewById(R.id.button2)).setEnabled(true);

        } else if (Favo == 0 & QuestionNo > ryou) {


            Intent intent2 = new Intent(NitakuMondai.this, Score.class);
            intent2.putExtra("Score", Score);
            intent2.putExtra("Play", play);
            startActivity(intent2);
        } else {
            QuestionNo++;
            setQuestion3();
        }
    }

    public void setQuestion4() {

        // 作成したDatabaseHelperクラスに読み取り専用でアクセス
        DBHelper dbHelper = new DBHelper(this);
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        sql = "SELECT Question, Ans0, Ans1, Ans2,Comment, Chap, Clear,Done,Fav FROM MyTable WHERE _id=" + QuestionNo;
        Cursor c = db.rawQuery(sql, null);
        c.moveToFirst();
        String Mondai = c.getString(c.getColumnIndex("Question")); // 問題文となる
        String Choice1 = c.getString(c.getColumnIndex("Ans1")); // 四択の選択肢1
        String Choice2 = c.getString(c.getColumnIndex("Ans2")); // 四択の選択肢2
        Favo = c.getInt(c.getColumnIndex("Fav")); //お気に入り
        Done = c.getInt(c.getColumnIndex("Done"));
        Chap = c.getInt(c.getColumnIndex("Chap"));//章
        Setumei = c.getString(c.getColumnIndex("Comment")); // 解説
        Clr = c.getInt(c.getColumnIndex("Clear"));
        Seikai = c.getString(c.getColumnIndex("Ans0")); // 答え

        // データベースのクローズ処理
        c.close();
        db.close();

        if(Done == 1 & Clr == 0) {
            play++;
            ((TextView) findViewById(R.id.textNo)).setText("第" + play + "問");
            ((TextView) findViewById(R.id.textQuestion)).setText("問題：\n" + (Mondai));
            ((Button) findViewById(R.id.button1)).setText(Choice1);
            ((Button) findViewById(R.id.button2)).setText(Choice2);
            ((Button) findViewById(R.id.button1)).setEnabled(true);
            ((Button) findViewById(R.id.button2)).setEnabled(true);

        }
        else if ( QuestionNo > ryou) {


            Intent intent2 = new Intent(NitakuMondai.this, Score.class);
            intent2.putExtra("Score", Score);
            intent2.putExtra("Play", play );
            startActivity(intent2);
        }else{
            QuestionNo ++;
            setQuestion4();
        }
    }



    public void onClick(View v) {
        TextView tvKaisetu=  (TextView) findViewById(R.id.textKaisetu);
        // 押されたボタンのテキストと正解を比較
        if (((Button) v).getText().equals(Seikai)) {
            // 正解の処理
            ((Button) findViewById(R.id.button1)).setEnabled(false);
            ((Button) findViewById(R.id.button2)).setEnabled(false);
            // ボタン選択不可にする
            mSoundPool.play(mSoundId[0], 1.0f, 1.0f, 0, 0, 1.0f); // 正解音を再生
            Toast toast = Toast.makeText(getApplicationContext(), "正解!!", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL, 0, 0);
            toast.show();
            tvKaisetu.setText("○");


            Score ++ ;

            // データベースを更新処理
            ContentValues values = new ContentValues();
            // Clear 0 → 1
            values.put("Clear", 1);
            // カラム選択
            String whereClause = "_id = ?";
            DBHelper dbHelper = new DBHelper(this);
            SQLiteDatabase db = dbHelper.getWritableDatabase();
            String Qno=String.valueOf(QuestionNo);
            //データベース更新

            db.update("MyTable", values, whereClause,new String[]{Qno});
            //データベース更新

            db.close();


            tvKaisetu.setText("解説：\n" + (Setumei));

        }
        else if( v.getId()==(R.id.button3)) { //お気に入りが押されたとき

            DBHelper dbHelper = new DBHelper(this);
            SQLiteDatabase db = dbHelper.getWritableDatabase();

            ContentValues values = new ContentValues();
            switch (Favo){
                case 0:
                    values.put("Fav", 1);
                    Toast.makeText(this, "お気に入りに追加されました！", Toast.LENGTH_SHORT).show();
                    break;
                case 1:
                    values.put("Fav", 0);
                    Toast.makeText(this, "お気に入りから削除されました！", Toast.LENGTH_SHORT).show();
                    break;
            }

            // カラム選択
            String whereClause = "_id = ?";
            String Qno=String.valueOf(QuestionNo);
            // データベースと接続

            //データベース更新

            db.update("MyTable", values, whereClause,new String[]{Qno});

            db.close();


        }
        else if( v.getId()==(R.id.button4)) { //次へが押されたとき
            tvKaisetu.setText("     ");
            switch (Menu) {
                case 1:
                    QuestionNo++;
                    setQuestion();
                    break;
                case 2:
                    setQuestion2();
                    break;
                case 3:
                    QuestionNo++;
                    setQuestion3();
                    break;
                case 4:
                    QuestionNo++;
                    setQuestion4();
                    break;

            }

        }


        else{
            // 不正解の処理
            ((Button) findViewById(R.id.button1)).setEnabled(false);
            ((Button) findViewById(R.id.button2)).setEnabled(false);
            mSoundPool.play(mSoundId[1], 1.0f, 1.0f, 0, 0, 1.0f); // 不正解音を再生

            Toast toast = Toast.makeText(getApplicationContext(), "不正解!", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL, 0, 0);
            toast.show();
            tvKaisetu.setText("解説： \n" + (Setumei));
            // データベースを更新処理
            ContentValues values = new ContentValues();
            // Clear 0 → 1
            values.put("Clear", 0);
            // カラム選択
            String whereClause = "_id = ?";
            DBHelper dbHelper = new DBHelper(this);
            SQLiteDatabase db = dbHelper.getWritableDatabase();
            String Qno=String.valueOf(QuestionNo);
            //データベース更新
            db.update("MyTable", values, whereClause,new String[]{Qno});
            //データベース更新
            db.close();

        }

        //解説表示



        ContentValues values = new ContentValues();
        // Clear 0 → 1
        values.put("Done", 1);
        // カラム選択
        String whereClause = "_id = ?";
        // データベースと接続
        DBHelper dbHelper = new DBHelper(this);
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        String Qno=String.valueOf(QuestionNo);
        //データベース更新
        db.update("MyTable", values, whereClause,new String[]{Qno});
        db.close();


    }



    // onPauseが呼ばれたら効果音に関する物は全て解放する
    @Override
    protected void onPause() {
        super.onPause();
        // SoundPool 解放
        mSoundPool.unload(mSoundId[0]);
        mSoundPool.unload(mSoundId[1]);

        mSoundPool.release();
    }


    public synchronized void sleep(long msec)
    {
        try
        {
            wait(msec);
        }catch(InterruptedException e){}
    }
}




