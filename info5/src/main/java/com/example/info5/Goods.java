package com.example.info5;

public class Goods{
    private String goodsName;
    private String codeBar;
    private int num;
    private String money;

    public Goods() {
        super();
    }

    public Goods(String goodsName,int num, String money, String codeBar) {
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

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

}