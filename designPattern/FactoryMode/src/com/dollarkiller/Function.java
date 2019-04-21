package com.dollarkiller;

import com.dollarkiller.factory.SimpleFactory;
import com.dollarkiller.plant.Bean;
import com.dollarkiller.plant.Ice;
import com.dollarkiller.plant.Plant;
import com.dollarkiller.plant.Wall;
import org.junit.jupiter.api.Test;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-21
 * Time: 上午10:51
 * Description: No Description
 */
public class Function {

    /**
     * 放植物 v1.3
     * @param name 玩家选中的是那种植物
     * @param number 放到那个格子里面
     */
    public void put(String name,int number) {
        Plant plant = (Plant)SimpleFactory.createPlant(name);
        System.out.println("将" + plant.getName() + "放到" + number + "号草地上");
    }

//    /**
//     * 放植物 v1.2
//     * @param name 玩家选中的是那种植物
//     * @param number 放到那个格子里面
//     */
//    public void put(String name,int number) {
//        Plant plant = (Plant)SimpleFactory.createPlant(name);
//        System.out.println("将" + plant.getName() + "放到" + number + "号草地上");
//    }

//    /**
//     * 放植物 v1.1
//     * @param name 玩家选中的是那种植物
//     * @param number 放到那个格子里面
//     */
//    public void put(String name,int number) {
//        Plant plant = null;
//        if ("Bean".equals(name)) {
//            plant = new Bean();
//            System.out.println("将" + plant.getName() + "放到" + number + "号草地上");
//        }
//        if ("Ice".equals(name)) {
//            plant = new Ice();
//            System.out.println("将" + plant.getName() + "放到" + number + "号草地上");
//        }
//        if ("Wall".equals(name)) {
//            plant = new Wall();
//            System.out.println("将" + plant.getName() + "放到" + number + "号草地上");
//        }
//    }
//    /**
//     * 放植物 v1.0
//     * @param name 玩家选中的是那种植物
//     * @param number 放到那个格子里面
//     */
//    public void put(String name,int number) {
//        if ("Bean".equals(name)) {
//            Bean bean = new Bean();
//            System.out.println("将" + bean.getName() + "放到" + number + "号草地上");
//        }
//        if ("Ice".equals(name)) {
//            Ice ice = new Ice();
//            System.out.println("将" + ice.getName() + "放到" + number + "号草地上");
//        }
//        if ("Wall".equals(name)) {
//            Wall wall = new Wall();
//            System.out.println("将" + wall.getName() + "放到" + number + "号草地上");
//        }
//    }

}
