package com.example.info5;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends Activity {
    private List<Goods> goods;
    private ImageView imageView;
    private ImageView imageView2;
    private TableAdapter adapter;

    private boolean flag = false;//定义一个标识符，用来判断

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.list);

        TextView jiage = (TextView) findViewById(R.id.text_jiage);
        TextView num = (TextView) findViewById(R.id.text_num);

        imageView = (ImageView) findViewById(R.id.bon);
        imageView2 = (ImageView) findViewById(R.id.top);

        goods = new ArrayList<Goods>();
        goods.add(new Goods("发动机A", 9001, "11", "发动机供应商1"));
        goods.add(new Goods("发动机B", 9002, "12", "发动机供应商2"));
        goods.add(new Goods("发动机C", 9003, "13", "发动机供应商3"));
        goods.add(new Goods("发动机D", 9004, "14", "发动机供应商3"));
        goods.add(new Goods("发动机E", 9005, "15", "发动机供应商2"));

        adapter = new TableAdapter(this, goods);

        listView.setAdapter(adapter);

        jiage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag = false) {
                    Collections.sort(goods, new TableAdapter.Numsheng());
                    imageView.setImageResource(R.drawable.top2);
                    imageView2.setImageResource(R.drawable.top);
                    adapter.notifyDataSetChanged();
                    flag = true;
                } else {
                    Collections.sort(goods, new TableAdapter.Numjiang());
                    imageView.setImageResource(R.drawable.top2);
                    imageView2.setImageResource(R.drawable.botton);
                    adapter.notifyDataSetChanged();
                    flag = false;
                }

            }
        });
        num.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag == false) {
                    Collections.sort(goods, new TableAdapter.Moneysheng());
                    imageView.setImageResource(R.drawable.top);
                    imageView2.setImageResource(R.drawable.botton2);
                    adapter.notifyDataSetChanged();
                    flag = true;
                } else {
                    Collections.sort(goods, new TableAdapter.Moneyjiang());
                    imageView.setImageResource(R.drawable.botton);
                    imageView2.setImageResource(R.drawable.botton2);
                    adapter.notifyDataSetChanged();
                    flag = false;
                }

            }
        });

    }

}