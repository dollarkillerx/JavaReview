package com.imooc.cart.data;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-15
 * Time: 下午10:33
 * Description: No Description
 */
public class Product {
    private Long id;
    private String tag;
    private String name;
    private String desc;
    private String level;
    private int price;

    public Product(){}

    public Product(Long id, String tag, String name, String desc, String level, int price) {
        this.id = id;
        this.tag = tag;
        this.name = name;
        this.desc = desc;
        this.level = level;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
