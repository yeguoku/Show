package com.example.a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {
    private List<Goods> goods;
    private ImageView imageView;
    private ImageView imageView2;
    private TableAdapter adapter;
    Boolean flag = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //获得id实例
        ListView listView = (ListView) findViewById(R.id.list);

        TextView codeBar = (TextView) findViewById(R.id.text_codeBar);
        TextView money = (TextView) findViewById(R.id.text_money);

        imageView = (ImageView) findViewById(R.id.bon);
        imageView2 = (ImageView) findViewById(R.id.top);

        //将数据添加进入数组中
        goods = new ArrayList<Goods>();
        goods.add(new Goods("张一", "程序员6", 9001));
        goods.add(new Goods("张二", "程序员5", 9002));
        goods.add(new Goods("张三", "程序员4", 9003));
        goods.add(new Goods("张四", "程序员3", 9004));
        goods.add(new Goods("张五", "程序员2", 9005));
        goods.add(new Goods("张六", "程序员1", 9006));

        //创建适配器
        adapter = new TableAdapter(this, goods);
        codeBar.setOnClickListener(this);
        money.setOnClickListener(this);

        //配置数据到适配器中
        listView.setAdapter(adapter);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.text_codeBar:
                if (flag == false) {
                    Collections.sort(goods, new TableAdapter.Barsheng());
                    imageView2.setImageResource(R.drawable.top);
                    imageView.setImageResource(R.drawable.botton2);
                    adapter.notifyDataSetChanged();
                    flag = true;
                } else {
                    Collections.sort(goods, new TableAdapter.BarJiang());
                    imageView2.setImageResource(R.drawable.botton);
                    imageView.setImageResource(R.drawable.botton2);
                    adapter.notifyDataSetChanged();
                    flag = false;
                }

                break;
            case R.id.text_money:
                if (flag == false) {
                    Collections.sort(goods, new TableAdapter.Moneysheng());
                    imageView2.setImageResource(R.drawable.top2);
                    imageView.setImageResource(R.drawable.top);
                    adapter.notifyDataSetChanged();
                    flag = true;
                } else {
                    Collections.sort(goods, new TableAdapter.Moneyjiang());
                    imageView2.setImageResource(R.drawable.top2);
                    imageView.setImageResource(R.drawable.botton);
                    adapter.notifyDataSetChanged();
                    flag = false;
                }

                break;
        }
    }
}