package com.dollarkiller.refilect.test;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-20
 * Time: 下午8:15
 * Description: No Description
 */
public class Goods {
    private String goodsId;
    private String goosName;
    private double price;
    private String desc;

    public Goods() {};

    public Goods(String goodsId, String goosName, double price, String desc) {
        this.goodsId = goodsId;
        this.goosName = goosName;
        this.price = price;
        this.desc = desc;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoosName() {
        return goosName;
    }

    public void setGoosName(String goosName) {
        this.goosName = goosName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void display() {
        System.out.println("Goods{" +
                "goodsId='" + goodsId + '\'' +
                ", goosName='" + goosName + '\'' +
                ", price=" + price +
                ", desc='" + desc + '\'' +
                '}');
    }

}
