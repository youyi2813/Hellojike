package com.test.lala.hellojike;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //TODO 帮我在这里协助做点事
        for(int i = 0;i<2;i++)
            System.out.println(i+1);
        // 测试git push跟pull
        // 平台修改了东西，未pull到本地
        setContentView(R.layout.activity_main);
    }
}
