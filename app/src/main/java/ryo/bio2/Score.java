package ryo.bio2;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

import net.nend.android.NendAdInterstitial;


public class Score extends Activity {
    int Score;
    int Play;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        NendAdInterstitial.loadAd(getApplicationContext(), "aef265e8b18e69d436c8b6bbb0093d85b8fa40e6", 775526);



        //タイトルバーを非表示にする（必ずsetContentViewの前にすること）
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        // レイアウトをセットする
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.score);

        Intent intent = getIntent();

        Score = intent.getIntExtra("Score", Score);
        Play = intent.getIntExtra("Play", Play);
        NendAdInterstitial.showAd(this);
        if (Play==0) {
            ((TextView) findViewById(R.id.textView3)).setText("該当する問題がありませんでした");

        }
        else {
        ((TextView) findViewById(R.id.textView3)).setText(Score + "/" + Play);

        }
    }
    public void onClick(View v) {
        switch (v.getId()) {
            // タッチされたボタンがノーマルの場合
            case R.id.Select:
                // 遷移先のActivityを指定
                // Intent intent = new　Intent(このクラスから, このクラスへ)
                Intent intent = new Intent(Score.this, Nitaku_Select.class);
                // 遷移開始
                startActivity(intent);
                break;
            // タッチされたボタンがランダムの場合
            case R.id.All:
                Intent intent2 = new Intent(Score.this, NitakuMondai.class);
                intent2.putExtra("Menu", 2);
                startActivity(intent2);

                break;
            // タッチされたボタンが復習
            case R.id.Again:
                Intent intent4 = new Intent(Score.this, NitakuMondai.class);
                intent4.putExtra("Menu", 4);
                startActivity(intent4);
                // Toast.makeText(this, "作成中！", Toast.LENGTH_SHORT).show();

                break;
            // タッチされたボタンがお気に入り
            case R.id.Favo:
                Intent intent3 = new Intent(Score.this, NitakuMondai.class);
                intent3.putExtra("Menu", 3);
                startActivity(intent3);
                // Toast.makeText(this, "作成中！", Toast.LENGTH_SHORT).show();
                break;
            // タッチされたボタンが四択
          //  case R.id.Yontaku:
            //    Intent intent5 = new Intent(Score.this, YontakuMondai.class);
              //  intent5.putExtra("Menu", 2);
                //startActivity(intent5);
                // Toast.makeText(this, "作成中！", Toast.LENGTH_SHORT).show();
              //  break;


        }
    }
}

