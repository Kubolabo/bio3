package ryo.bio2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //タイトルバーを非表示にする（必ずsetContentViewの前にすること）
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        // レイアウトをセットする
        setContentView(R.layout.activity_main);
    }

    // ボタンがタッチされた時の処理
    public void onClick(View v) {
        switch (v.getId()) {
            // タッチされたボタンが二択選択
            case R.id.Select:
                // 遷移先のActivityを指定
                // Intent intent = new　Intent(このクラスから, このクラスへ)
                Intent intent = new Intent(MainActivity.this, Nitaku_Select.class);
                // 遷移開始
                startActivity(intent);
                break;
            // タッチされたボタンがランダムの場合
            case R.id.All:
                Intent intent2 = new Intent(MainActivity.this, NitakuMondai.class);
                intent2.putExtra("Menu", 2);
                startActivity(intent2);

                break;
            // タッチされたボタンが復習
            case R.id.Again:
                Intent intent4 = new Intent(MainActivity.this, NitakuMondai.class);
                intent4.putExtra("Menu", 4);
                startActivity(intent4);
                // Toast.makeText(this, "作成中！", Toast.LENGTH_SHORT).show();

                break;
            // タッチされたボタンがお気に入り
            case R.id.Favo:
                Intent intent3 = new Intent(MainActivity.this, NitakuMondai.class);
                intent3.putExtra("Menu", 3);
                startActivity(intent3);
                // Toast.makeText(this, "作成中！", Toast.LENGTH_SHORT).show();
                break;
            // タッチされたボタンが四択
          //  case R.id.Yontaku:
            //    Intent intent5 = new Intent(MainActivity.this, YontakuMondai.class);
              //  intent5.putExtra("Menu", 2);
                //startActivity(intent5);
                // Toast.makeText(this, "作成中！", Toast.LENGTH_SHORT).show();
               // break;
            //二択選択→選択画面へ　ランダム→Menu2 復習→Menu4 お気に入り→Menu3 四択→四択クラスへ
        }

    }
}
