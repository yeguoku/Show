package com.example.info;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = (Button) findViewById(R.id.but1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                an a = new an();
                FragmentTransaction fragmentManager = getSupportFragmentManager().beginTransaction();
                fragmentManager.replace(R.id.lift_layout, a);
                fragmentManager.commit();
            }
        });
        Button b2 = (Button) findViewById(R.id.but2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                laing l = new laing();
                FragmentTransaction fragmentManager = getSupportFragmentManager().beginTransaction();
                fragmentManager.replace(R.id.lift_layout, l);
                fragmentManager.commit();
            }
        });
    }
}
