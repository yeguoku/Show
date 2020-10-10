package com.example.info7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView one, two, three, four, five, six;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = (ImageView) findViewById(R.id.one);
        two = (ImageView) findViewById(R.id.two);
        three = (ImageView) findViewById(R.id.three);
        four = (ImageView) findViewById(R.id.four);
        five = (ImageView) findViewById(R.id.five);
        six = (ImageView) findViewById(R.id.six);
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.one:
//                Toast.makeText(MainActivity.this,"shfs",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, One.class);
                startActivity(intent);
                break;
            case R.id.two:
                Intent intent2 = new Intent(MainActivity.this, Two.class);
                startActivity(intent2);
                break;
            case R.id.three:
                Intent intent3 = new Intent(MainActivity.this, Three.class);
                startActivity(intent3);
                break;
            case R.id.four:
                Intent intent4 = new Intent(MainActivity.this,Four.class);
                startActivity(intent4);
                break;
            case R.id.five:
                Intent intent5 = new Intent(MainActivity.this, Five.class);
                startActivity(intent5);
                break;
            case R.id.six:
                Intent intent6 = new Intent(MainActivity.this,Six.class);
                startActivity(intent6);
                break;
        }
    }
}
