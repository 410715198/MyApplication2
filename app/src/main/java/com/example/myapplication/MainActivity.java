package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txv = (TextView) findViewById(R.id.txv);
        txv.setText("嗨！我是曾薇瑄。");
        TestMaster();
    }
        TestDev();
    }
    public boolean onTouchEvent (MotionEvent event){
        TextView txv = (TextView) findViewById(R.id.txv);
        txv.setText("另一位使用者修改螢幕觸控");
        return true;
    }

}
}
