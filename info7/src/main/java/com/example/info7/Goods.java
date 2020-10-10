package com.example.info7;

public class Goods implements Comparable<Goods>{
    private String goodsName;
    private String codeBar;
    private double money;

    public Goods() {
        super();
    }

    public Goods(String goodsName, String codeBar,double money) {
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


    @Override
    public int compareTo(Goods goods) {
        int pre = (int) goods.getMoney();
        int next =(int) goods.getMoney();
        int i=pre>next?1:-1;
        return i;
    }
}

