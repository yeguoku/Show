package com.example.info7;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Four extends AppCompatActivity implements View.OnClickListener {

    private TextView tv11, tv12, tv13, tv14;
    private TextView tv21, tv22, tv23, tv24;
    private TextView tv31, tv32, tv33, tv34;
    private TextView tv41, tv42, tv43, tv44;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.four);

        tv11 = (TextView) findViewById(R.id.tv11);
        tv12 = (TextView) findViewById(R.id.tv12);
        tv13 = (TextView) findViewById(R.id.tv13);
        tv14 = (TextView) findViewById(R.id.tv14);

        tv21 = (TextView) findViewById(R.id.tv21);
        tv22 = (TextView) findViewById(R.id.tv22);
        tv23 = (TextView) findViewById(R.id.tv23);
        tv24 = (TextView) findViewById(R.id.tv24);

        tv31 = (TextView) findViewById(R.id.tv31);
        tv32 = (TextView) findViewById(R.id.tv32);
        tv33 = (TextView) findViewById(R.id.tv33);
        tv34 = (TextView) findViewById(R.id.tv34);

        tv41 = (TextView) findViewById(R.id.tv41);
        tv42 = (TextView) findViewById(R.id.tv42);
        tv43 = (TextView) findViewById(R.id.tv43);
        tv44 = (TextView) findViewById(R.id.tv44);


        tv11.setOnClickListener(this);
        tv12.setOnClickListener(this);
        tv13.setOnClickListener(this);
        tv14.setOnClickListener(this);

        tv21.setOnClickListener(this);
        tv22.setOnClickListener(this);
        tv23.setOnClickListener(this);
        tv24.setOnClickListener(this);

        tv31.setOnClickListener(this);
        tv32.setOnClickListener(this);
        tv33.setOnClickListener(this);
        tv34.setOnClickListener(this);

        tv41.setOnClickListener(this);
        tv42.setOnClickListener(this);
        tv43.setOnClickListener(this);
        tv44.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv11:
                tv11.setText("姓名：王1\n体力:100");
                tv11.setBackgroundColor(Color.parseColor("#8CA2FB"));
                tv12.setText("");
                tv12.setBackgroundColor(Color.parseColor("#F35050"));
                tv13.setText("");
                tv13.setBackgroundColor(Color.parseColor("#F35050"));
                tv14.setText("");
                tv14.setBackgroundColor(Color.parseColor("#F35050"));
                break;
            case R.id.tv12:
                tv11.setText("");
                tv11.setBackgroundColor(Color.parseColor("#F35050"));
                tv12.setText("姓名：王2\n体力:100");
                tv12.setBackgroundColor(Color.parseColor("#8CA2FB"));
                tv13.setText("");
                tv13.setBackgroundColor(Color.parseColor("#F35050"));
                tv14.setText("");
                tv14.setBackgroundColor(Color.parseColor("#F35050"));
                break;
            case R.id.tv13:
                tv11.setText("");
                tv11.setBackgroundColor(Color.parseColor("#F35050"));
                tv12.setText("");
                tv12.setBackgroundColor(Color.parseColor("#F35050"));
                tv13.setText("姓名：王2\n体力:100");
                tv13.setBackgroundColor(Color.parseColor("#8CA2FB"));
                tv14.setText("");
                tv14.setBackgroundColor(Color.parseColor("#F35050"));
                break;
            case R.id.tv14:
                tv11.setText("");
                tv11.setBackgroundColor(Color.parseColor("#F35050"));
                tv12.setText("");
                tv12.setBackgroundColor(Color.parseColor("#F35050"));
                tv13.setText("");
                tv13.setBackgroundColor(Color.parseColor("#F35050"));
                tv14.setText("姓名：王4\n体力:100");
                tv14.setBackgroundColor(Color.parseColor("#8CA2FB"));
                break;
            case R.id.tv21:
                tv21.setText("姓名：张1\n体力:100");
                tv21.setBackgroundColor(Color.parseColor("#8CA2FB"));
                tv22.setText("");
                tv22.setBackgroundColor(Color.parseColor("#F35050"));
                tv23.setText("");
                tv23.setBackgroundColor(Color.parseColor("#F35050"));
                tv24.setText("");
                tv24.setBackgroundColor(Color.parseColor("#F35050"));
                break;
            case R.id.tv22:
                tv21.setText("");
                tv21.setBackgroundColor(Color.parseColor("#F35050"));
                tv22.setText("姓名：张2\n体力:100");
                tv22.setBackgroundColor(Color.parseColor("#8CA2FB"));
                tv23.setText("");
                tv23.setBackgroundColor(Color.parseColor("#F35050"));
                tv24.setText("");
                tv24.setBackgroundColor(Color.parseColor("#F35050"));
                break;
            case R.id.tv23:
                tv21.setText("");
                tv21.setBackgroundColor(Color.parseColor("#F35050"));
                tv22.setText("");
                tv22.setBackgroundColor(Color.parseColor("#F35050"));
                tv23.setText("姓名：张3\n体力:100");
                tv23.setBackgroundColor(Color.parseColor("#8CA2FB"));
                tv24.setText("");
                tv24.setBackgroundColor(Color.parseColor("#F35050"));
                break;
            case R.id.tv24:
                tv21.setText("");
                tv21.setBackgroundColor(Color.parseColor("#F35050"));
                tv22.setText("");
                tv22.setBackgroundColor(Color.parseColor("#F35050"));
                tv23.setText("");
                tv23.setBackgroundColor(Color.parseColor("#F35050"));
                tv24.setText("姓名：张4\n体力:100");
                tv24.setBackgroundColor(Color.parseColor("#8CA2FB"));
                break;
            case R.id.tv31:
                tv31.setText("姓名：刘1\n体力:100");
                tv31.setBackgroundColor(Color.parseColor("#8CA2FB"));
                tv32.setText("");
                tv32.setBackgroundColor(Color.parseColor("#F35050"));
                tv33.setText("");
                tv33.setBackgroundColor(Color.parseColor("#F35050"));
                tv34.setText("");
                tv34.setBackgroundColor(Color.parseColor("#F35050"));
                break;
            case R.id.tv32:
                tv31.setText("");
                tv31.setBackgroundColor(Color.parseColor("#F35050"));
                tv32.setText("姓名：刘2\n体力:100");
                tv32.setBackgroundColor(Color.parseColor("#8CA2FB"));
                tv33.setText("");
                tv33.setBackgroundColor(Color.parseColor("#F35050"));
                tv34.setText("");
                tv34.setBackgroundColor(Color.parseColor("#F35050"));
                break;
            case R.id.tv33:
                tv31.setText("");
                tv31.setBackgroundColor(Color.parseColor("#F35050"));
                tv32.setText("");
                tv32.setBackgroundColor(Color.parseColor("#F35050"));
                tv33.setText("姓名：刘3\n体力:100");
                tv33.setBackgroundColor(Color.parseColor("#8CA2FB"));
                tv34.setText("");
                tv34.setBackgroundColor(Color.parseColor("#F35050"));
                break;
            case R.id.tv34:
                tv31.setText("");
                tv31.setBackgroundColor(Color.parseColor("#F35050"));
                tv32.setText("");
                tv32.setBackgroundColor(Color.parseColor("#F35050"));
                tv33.setText("");
                tv33.setBackgroundColor(Color.parseColor("#F35050"));
                tv34.setText("姓名：刘4\n体力:100");
                tv34.setBackgroundColor(Color.parseColor("#8CA2FB"));
                break;
            case R.id.tv41:
                tv41.setText("姓名：李1\n体力:100");
                tv41.setBackgroundColor(Color.parseColor("#8CA2FB"));
                tv42.setText("");
                tv42.setBackgroundColor(Color.parseColor("#F35050"));
                tv43.setText("");
                tv43.setBackgroundColor(Color.parseColor("#F35050"));
                tv44.setText("");
                tv44.setBackgroundColor(Color.parseColor("#F35050"));
                break;
            case R.id.tv42:
                tv41.setText("");
                tv41.setBackgroundColor(Color.parseColor("#F35050"));
                tv42.setText("姓名：李2\n体力:100");
                tv42.setBackgroundColor(Color.parseColor("#8CA2FB"));
                tv43.setText("");
                tv43.setBackgroundColor(Color.parseColor("#F35050"));
                tv44.setText("");
                tv44.setBackgroundColor(Color.parseColor("#F35050"));
                break;
            case R.id.tv43:
                tv41.setText("");
                tv41.setBackgroundColor(Color.parseColor("#F35050"));
                tv42.setText("");
                tv42.setBackgroundColor(Color.parseColor("#F35050"));
                tv43.setText("姓名：李3\n体力:100");
                tv43.setBackgroundColor(Color.parseColor("#8CA2FB"));
                tv44.setText("");
                tv44.setBackgroundColor(Color.parseColor("#F35050"));
                break;
            case R.id.tv44:
                tv41.setText("");
                tv41.setBackgroundColor(Color.parseColor("#F35050"));
                tv42.setText("");
                tv42.setBackgroundColor(Color.parseColor("#F35050"));
                tv43.setText("");
                tv43.setBackgroundColor(Color.parseColor("#F35050"));
                tv44.setText("姓名：李4\n体力:100");
                tv44.setBackgroundColor(Color.parseColor("#8CA2FB"));
                break;
            default:
                break;
        }
    }
}
