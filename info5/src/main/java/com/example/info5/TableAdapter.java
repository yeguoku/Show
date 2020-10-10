package com.example.info5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.Comparator;
import java.util.List;


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

        Goods goods = (Goods) this.getItem(position);

        ViewHolder viewHolder;

        if (convertView == null) {

            viewHolder = new ViewHolder();

            convertView = inflater.inflate(R.layout.list_item, null);
            viewHolder.goodName = (TextView) convertView.findViewById(R.id.text_shangpin1);
            viewHolder.goodCodeBar = (TextView) convertView.findViewById(R.id.text_jiage1);
            viewHolder.goodMoney = (TextView) convertView.findViewById(R.id.text_num1);
            viewHolder.goodNum = (TextView) convertView.findViewById(R.id.text_gongying1);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.goodName.setText(goods.getGoodsName());
        viewHolder.goodName.setTextSize(13);
        viewHolder.goodMoney.setText(goods.getMoney() + "");
        viewHolder.goodMoney.setTextSize(13);
        viewHolder.goodNum.setText(goods.getNum() + "");
        viewHolder.goodNum.setTextSize(13);
        viewHolder.goodCodeBar.setText(goods.getCodeBar());
        viewHolder.goodCodeBar.setTextSize(13);

        return convertView;
    }

    public static class ViewHolder {
        public TextView goodName;
        public TextView goodCodeBar;
        public TextView goodMoney;
        public TextView goodNum;
    }

    @Override
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }

    public static class Moneysheng implements Comparator<Goods> {

        @Override
        public int compare(Goods g1, Goods g2) {
            return String.valueOf(g1.getMoney()).compareTo(String.valueOf(g2.getMoney()));
        }
    }

    public static class Moneyjiang implements Comparator<Goods> {

        @Override
        public int compare(Goods g1, Goods g2) {
            return -String.valueOf(g1.getMoney()).compareTo(String.valueOf(g2.getMoney()));
        }
    }

    public static class Numsheng implements Comparator<Goods> {

        @Override
        public int compare(Goods g1, Goods g2) {
            return String.valueOf(g1.getNum()).compareTo(String.valueOf(g2.getNum()));
        }
    }

    public static class Numjiang implements Comparator<Goods> {

        @Override
        public int compare(Goods g1, Goods g2) {
            return -String.valueOf(g1.getNum()).compareTo(String.valueOf(g2.getNum()));
        }
    }

}