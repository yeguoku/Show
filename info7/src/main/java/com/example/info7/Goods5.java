package com.example.info7;

public class Goods5 implements Comparable<Goods5>{
    private String goodsName;
    private String codeBar;
    private int num;
    private double money;

    public Goods5() {
        super();
    }

    public Goods5(String goodsName, int num, double money, String codeBar) {
        super();
        this.goodsName = goodsName;
        this.codeBar = codeBar;
        this.num = num;
        this.money = money;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
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
    public int compareTo(Goods5 goods) {
        int pre = (int) goods.getMoney();
        int next =(int) goods.getMoney();
        int i=pre>next?1:-1;
        return i;
    }
}