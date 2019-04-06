package com.map.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-6
 * Time: 下午3:19
 * Description: No Description
 */
public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        // 定义HashMap对象
        Map<String,Goods> goodsMap = new HashMap<String, Goods>();

        System.out.println("请输入商品信息:");
        int i = 0;
        while (i<3) {
            System.out.println("请输入第"+(i+1)+"条信息");
            System.out.println("Goods id:");
            String goodsId = console.next();
            if(goodsMap.containsKey(goodsId)){
                System.out.println("商品id以存在");
                continue;
            }
            System.out.println("Goods name:");
            String goodsName = console.next();
            System.out.println("Goods price:");
            Double goodsPrice = console.nextDouble();
            Goods goods = new Goods(goodsId,goodsName,goodsPrice);
            goodsMap.put(goodsId,goods);
            i++;
        }
        // 遍历map输出商品信息
        System.out.println("遍历map输出商品信息");
        Iterator<Goods> itGoods = goodsMap.values().iterator();
        while (itGoods.hasNext()){
            System.out.println(itGoods.next());
        }

    }
}
