package com.imooc.cart.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-15
 * Time: 下午10:32
 * Description: 本地缓存
 */
public class LocalCache {
    private static Map<Long,Product> productMap = new HashMap<>();
    private static Map<Long, Cart> catMap = new HashMap<>();
    static {
        productMap.put(1l,new Product(1l,"HTML/CSS","大话HTML","this is 大话HTML","初级",66));
        productMap.put(2l,new Product(2l,"JavaScript","大话JavaScript","this is 大话JavaScript","初级",99));
        productMap.put(3l,new Product(3l,"PHP","大话PHP","this is 大话PHP","初级",166));
        productMap.put(4l,new Product(4l,"PHP","大话PHP","this is 大话PHP","初级",166));
        productMap.put(5l,new Product(5l,"PHP","大话PHP","this is 大话PHP","初级",166));
        productMap.put(6l,new Product(6l,"PHP","大话PHP","this is 大话PHP","初级",166));
        productMap.put(7l,new Product(7l,"PHP","大话PHP","this is 大话PHP","初级",166));
        productMap.put(8l,new Product(8l,"PHP","大话PHP","this is 大话PHP","初级",166));
        productMap.put(9l,new Product(9l,"PHP","大话PHP","this is 大话PHP","初级",166));
        productMap.put(10l,new Product(10l,"PHP","大话PHP","this is 大话PHP","初级",166));
        productMap.put(11l,new Product(11l,"PHP","大话PHP","this is 大话PHP","初级",166));
        productMap.put(12l,new Product(12l,"PHP","大话PHP","this is 大话PHP","初级",166));
        productMap.put(13l,new Product(13l,"PHP","大话PHP","this is 大话PHP","初级",166));
    }
    public static List<Product> getProduct() {
        return new ArrayList<>(productMap.values());
    }

    public static Product getProduct(Long id) {
        return productMap.get(id);
    }

    public static void addCart(Product product) {
        if(catMap.containsKey(product.getId())){
            catMap.put(product.getId(),new Cart(product.getId(),product.getId(),product.getName(),product.getPrice(),1));
        }else{

        }
    }

    public static void incrCart (Long productId) {
        catMap.get(productId).incrCount();
    }

    public static void decrCart(Long productId) {
        catMap.get(productId).decrCount();
    }

    public static List<Cart> getCarts() {
        return new ArrayList<>(catMap.values());
    }
}
