package com.observerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Employee em_1,em_2,em_3;
    private Boss boss;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.btn);

        //实例化员工
        em_1=new Employee("刘炜");
        em_2=new Employee("王嘉翔");
        em_3=new Employee("沈锐彬");

        //实例化老板
        boss=new Boss();

        //员工订阅老板消息
        boss.attact(em_1);
        boss.attact(em_2);
        boss.attact(em_3);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //老板发消息
                boss.notify("明天加班");
                Log.i("msg","--------------分割线-------------");

                //王嘉翔解除订阅
                boss.detact(em_2);
                //老板再发消息
                boss.notify("后天放假");
            }
        });
    }
}
