package com.example.info7;

import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Two extends AppCompatActivity {

    Button but1, but2;
    ImageView iv1, iv2;
    ImageButton chongqi;

    private int[] hot = {R.drawable.hot_guang, R.drawable.hot_kai};//定义一个int数组，用来放图片
    private int[] xue = {R.drawable.xue_guang, R.drawable.xue_kai};//定义一个int数组，用来放图片

    private boolean flag = false;//定义一个标识符，用来判断

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.two);

        initView();//初始化UI控件

    }

    private void initView() {
        but1 = (Button) findViewById(R.id.but1);
        but2 = (Button) findViewById(R.id.but2);

        iv1 = (ImageView) findViewById(R.id.iv1);
        iv2 = (ImageView) findViewById(R.id.iv2);

        chongqi = (ImageButton) findViewById(R.id.chongqi);
    }


    @Override
    protected void onResume() {
        super.onResume();
        //设置but的点击事件
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv1.setImageResource(xue[1]);
                iv2.setImageResource(hot[0]);
            }
        });
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv2.setImageResource(hot[1]);
                iv1.setImageResource(xue[0]);
            }
        });
        chongqi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv2.setImageResource(hot[0]);
                iv1.setImageResource(xue[0]);
            }
        });
    }

}
