package com.example.a;

import android.content.ClipData;

import java.util.Comparator;

public class Goods {
    /*定义属性*/
    private String goodsName;
    private String codeBar;
    private double money;

    public Goods() {
        super();
    }

    public Goods(String goodsName, String codeBar, double money) {
        super();
        this.goodsName = goodsName;
        this.codeBar = codeBar;
        this.money = money;
    }


    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getCodeBar() {
        return codeBar;
    }

    public void setCodeBar(String codeBar) {
        this.codeBar = codeBar;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }


}