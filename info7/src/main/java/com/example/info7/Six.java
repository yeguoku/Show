package com.example.info7;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Six extends AppCompatActivity {

    String c1 = "材料1";
    String c2 = "材料2";
    String c3 = "材料3";

    private EditText et1, et2;
    private TextView monry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.six);

        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);

        monry = (TextView) findViewById(R.id.monry);

        Button button = (Button) findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
        AlertDialog alertDialog = new AlertDialog.Builder(Six.this)
                .setTitle("提示").setMessage("确定购买吗？")
                .setPositiveButton("确定", new DialogInterface.OnClickListener() {//添加"Yes"按钮
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (et1.getText().toString().equals("仓库1")&&et2.getText().toString().equals(c1)){
                            int a =200;
                            int b;
                            b = Integer.parseInt(monry.getText().toString().trim());
                            b = b-a;
                            monry.setText(String.valueOf(b));

                        }else if (et1.getText().toString().equals("仓库1")&&et2.getText().toString().equals(c2)){
                            int c =400;
                            int b;
                            b = Integer.parseInt(monry.getText().toString().trim());
                            b = b-c;
                            monry.setText(String.valueOf(b));
                        }else if (et1.getText().toString().equals("仓库1")&&et2.getText().toString().equals(c3)){
                            int d =600;
                            int b;
                            b = Integer.parseInt(monry.getText().toString().trim());
                            b = b-d;
                            monry.setText(String.valueOf(b));
                        }
                        Toast.makeText(Six.this, "购买成功", Toast.LENGTH_SHORT).show();
                    }
                })

                .setNegativeButton("取消", new DialogInterface.OnClickListener() {//添加取消
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(Six.this, "购买成功失败", Toast.LENGTH_SHORT).show();
                    }
                }).create();
        alertDialog.show();

            }
        });

    }
}
