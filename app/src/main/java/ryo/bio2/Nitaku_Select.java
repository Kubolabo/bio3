package ryo.bio2;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class Nitaku_Select extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //タイトルバーを非表示にする（必ずsetContentViewの前にすること）
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        // レイアウトをセットする
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        setContentView(R.layout.activity_nitaku__select);

    }

    // ボタンがタッチされた時の処理
    public void onClick(View v) {
        Intent intent = new Intent(Nitaku_Select.this, NitakuMondai.class);
        switch (v.getId()) {
            // タッチされたボタンがノーマルの場合
            case R.id.t1:
                // 遷移先のActivityを指定
                // Intent intent = new　Intent(このクラスから, このクラスへ)

                intent.putExtra("Chapter",1);
                intent.putExtra("Menu",1);
                startActivity(intent);
                break;

            case R.id.t2:
                intent.putExtra("Chapter",2);
                intent.putExtra("Menu",1);
                startActivity(intent);
                break;

            case R.id.t3:
                intent.putExtra("Chapter",3);
                intent.putExtra("Menu",1);
                startActivity(intent);
                break;
            case R.id.t4:
                intent.putExtra("Chapter",4);
                intent.putExtra("Menu",1);
                startActivity(intent);
                break;
            case R.id.t5:
                intent.putExtra("Chapter",5);
                intent.putExtra("Menu",1);
                startActivity(intent);
                break;

            case R.id.t6:
                intent.putExtra("Chapter",6);
                intent.putExtra("Menu",1);
                startActivity(intent);
                break;
            case R.id.t7:
                intent.putExtra("Chapter",7);
                intent.putExtra("Menu",1);
                startActivity(intent);
                break;
            case R.id.t8:
                intent.putExtra("Chapter",8);
                intent.putExtra("Menu",1);
                startActivity(intent);
                break;

            case R.id.t9:
                intent.putExtra("Chapter",9);
                intent.putExtra("Menu",1);
                startActivity(intent);
                break;
            case R.id.t10:
                intent.putExtra("Chapter",10);
                intent.putExtra("Menu",1);
                startActivity(intent);
                break;
            case R.id.t11:
                intent.putExtra("Chapter",11);
                intent.putExtra("Menu",1);
                startActivity(intent);
                break;
            case R.id.t12:
                intent.putExtra("Chapter",12);
                intent.putExtra("Menu",1);
                startActivity(intent);
                break;

            case R.id.t13:
                intent.putExtra("Chapter",13);
                intent.putExtra("Menu",1);
                startActivity(intent);
                break;
            case R.id.t14:
                intent.putExtra("Chapter",14);
                intent.putExtra("Menu",1);
                startActivity(intent);
                break;

        }
    }
}

