package com.fuicuiedu.xc.eventbus_20170331;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import org.greenrobot.eventbus.EventBus;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        findViewById(R.id.main2_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//        执行某个操作后，发送一个事件
                EventBus.getDefault().post(new MessageEvent("背对疾风吧！"));
            }
        });

    }
}
