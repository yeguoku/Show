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

public class Three extends Activity implements View.OnClickListener {
    private List<Goods> goods;
    private ImageView imageView;
    private ImageView imageView2;
    private TableAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.three);

        ListView listView = (ListView) findViewById(R.id.list);

        TextView codeBar = (TextView) findViewById(R.id.text_codeBar);
        TextView money = (TextView) findViewById(R.id.text_money);

        imageView = (ImageView) findViewById(R.id.bon);
        imageView2 = (ImageView) findViewById(R.id.top);

        goods = new ArrayList<Goods>();
        goods.add(new Goods("张一", "程序员1", 9001));
        goods.add(new Goods("张二", "程序员2", 9002));
        goods.add(new Goods("张三", "程序员3", 9003));
        goods.add(new Goods("张四", "程序员4", 9004));
        goods.add(new Goods("张五", "程序员5", 9005));
        goods.add(new Goods("张六", "程序员6", 9006));


        Collections.sort(goods);
        adapter = new TableAdapter(this, goods);
        codeBar.setOnClickListener(this);
        money.setOnClickListener(this);

        listView.setAdapter(adapter);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.text_codeBar:
                Collections.reverse(goods);
                imageView2.setImageResource(R.drawable.top);
                imageView.setImageResource(R.drawable.botton2);
                adapter.notifyDataSetChanged();
                break;
            case R.id.text_money:
                Collections.reverse(goods);
                imageView2.setImageResource(R.drawable.top2);
                imageView.setImageResource(R.drawable.botton);
                adapter.notifyDataSetChanged();
                break;
        }
    }
}