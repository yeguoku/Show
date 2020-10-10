package com.example.a;

import java.util.Comparator;
import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


public class TableAdapter extends BaseAdapter {

    private List<Goods> list;
    private LayoutInflater inflater;

    public TableAdapter(Context context, List<Goods> list) {
        this.list = list;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        int ret = 0;
        if (list != null) {
            ret = list.size();
        }
        return ret;
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //获得数据源
        Goods goods = (Goods) this.getItem(position);

        ViewHolder viewHolder;

        if (convertView == null) {

            viewHolder = new ViewHolder();

            convertView = inflater.inflate(R.layout.list_item, null);
            viewHolder.goodName = (TextView) convertView.findViewById(R.id.text_goods_name1);
            viewHolder.goodCodeBar = (TextView) convertView.findViewById(R.id.text_codeBar1);
            viewHolder.goodMoney = (TextView) convertView.findViewById(R.id.text_money1);

            convertView.setTag(viewHolder); //将Holder存储到convertView中
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.goodName.setText(goods.getGoodsName());//获得对应数据
        viewHolder.goodName.setTextSize(13);//设置字体大小
        viewHolder.goodCodeBar.setText(goods.getCodeBar());
        viewHolder.goodCodeBar.setTextSize(13);
        viewHolder.goodMoney.setText(goods.getMoney() + "");
        viewHolder.goodMoney.setTextSize(13);

        return convertView;
    }

    //对数据进行封装，等待调用
    public static class ViewHolder {
        public TextView goodName;
        public TextView goodCodeBar;
        public TextView goodMoney;
    }

    //刷新
    @Override
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }


    public static class BarJiang implements Comparator<Goods> {

        @Override
        public int compare(Goods g1, Goods g2) {
            return -String.valueOf(g1.getCodeBar()).compareTo(String.valueOf(g2.getCodeBar()));
        }
    }

    public static class Barsheng implements Comparator<Goods> {

        @Override
        public int compare(Goods g1, Goods g2) {
            return String.valueOf(g1.getCodeBar()).compareTo(String.valueOf(g2.getCodeBar()));
        }
    }

    public static class Moneyjiang implements Comparator<Goods> {


        @Override
        public int compare(Goods g1, Goods g2) {
            return -String.valueOf(g1.getMoney()).compareTo(String.valueOf(g2.getMoney()));
        }
    }

    public static class Moneysheng implements Comparator<Goods> {


        @Override
        public int compare(Goods g1, Goods g2) {
            return String.valueOf(g1.getMoney()).compareTo(String.valueOf(g2.getMoney()));
        }
    }
}