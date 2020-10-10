package com.example.info2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button but1, but2;
    ImageView iv1, iv2;
    ImageButton chongqi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv1.setImageResource(R.drawable.xue_kai);
                iv2.setImageResource(R.drawable.hot_guang);
            }
        });
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                iv1.setImageResource(R.drawable.xue_guang);
                iv2.setImageResource(R.drawable.hot_kai);
            }
        });
        chongqi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv1.setImageResource(R.drawable.xue_guang);
                iv2.setImageResource(R.drawable.hot_guang);
            }
        });
    }

}
