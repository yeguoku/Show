package com.example.info6;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String c1 = "1";
    String c2 = "2";
    String c3 = "3";

    private EditText et1, et2;
    private TextView monry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);

        monry = findViewById(R.id.monry);

        Button button = findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(MainActivity.this).setTitle("确认购买吗？")
                        .setIcon(android.R.drawable.ic_dialog_info)
                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                // 点击“确认”后的操作
                                if (et1.getText().toString().equals("1") && et2.getText().toString().equals(c1)) {
                                    int a = 200;
                                    int b;
                                    b = Integer.parseInt(monry.getText().toString().trim());
                                    b = b - a;
                                    monry.setText(String.valueOf(b));


                                } else if (et1.getText().toString().equals("1") && et2.getText().toString().equals(c2)) {
                                    int c = 400;
                                    int b;
                                    b = Integer.parseInt(monry.getText().toString().trim());
                                    b = b - c;
                                    monry.setText(String.valueOf(b));
                                } else if (et1.getText().toString().equals("1") && et2.getText().toString().equals(c3)) {
                                    int d = 600;
                                    int b;
                                    b = Integer.parseInt(monry.getText().toString().trim());
                                    b = b - d;
                                    monry.setText(String.valueOf(b));
                                }
                                Toast.makeText(MainActivity.this, "购买成功", Toast.LENGTH_LONG).show();

                            }
                        })
                        .setNegativeButton("取消", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                // 点击“返回”后的操作,这里不设置没有任何操作
                            }
                        }).show();


            }
        });

    }
}
