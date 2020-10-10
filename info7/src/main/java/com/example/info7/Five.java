package com.example.info7;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Five extends Activity {
    private List<Goods5> goods;
    private ImageView imageView;
    private ImageView imageView2;
    private TableAdapter5 adapter;

    private boolean flag = false;//定义一个标识符，用来判断
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.five);

        ListView listView = (ListView) findViewById(R.id.list);

        TextView jiage = (TextView) findViewById(R.id.text_jiage);
        TextView num = (TextView) findViewById(R.id.text_num);

        imageView = (ImageView) findViewById(R.id.bon);
        imageView2 = (ImageView) findViewById(R.id.top);

        goods = new ArrayList<Goods5>();
        goods.add(new Goods5("发动机A", 9001,11,"发动机供应商1"));
        goods.add(new Goods5("发动机B", 9002,12,"发动机供应商2"));
        goods.add(new Goods5("发动机C", 9003,13,"发动机供应商3"));
        goods.add(new Goods5("发动机D", 9004,14,"发动机供应商3"));
        goods.add(new Goods5("发动机E", 9005,15,"发动机供应商2"));


        Collections.sort(goods);
        adapter = new TableAdapter5(this, goods);

        listView.setAdapter(adapter);

        jiage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (false){
                    Collections.reverse(goods);
                    imageView2.setImageResource(R.drawable.top2);
                    imageView.setImageResource(R.drawable.botton);
                    adapter.notifyDataSetChanged();
                    flag = false;
                }else {
                    Collections.reverse(goods);
                    imageView2.setImageResource(R.drawable.top);
                    imageView.setImageResource(R.drawable.botton2);
                    adapter.notifyDataSetChanged();
                    flag = true;
                }

            }
        });
        num.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (false){
                    Collections.reverse(goods);
                    imageView2.setImageResource(R.drawable.top);
                    imageView.setImageResource(R.drawable.botton2);
                    adapter.notifyDataSetChanged();
                    flag = false;
                }else {
                    Collections.reverse(goods);
                    imageView2.setImageResource(R.drawable.top2);
                    imageView.setImageResource(R.drawable.botton);
                    adapter.notifyDataSetChanged();
                    flag = true;
                }

            }
        });

    }

}