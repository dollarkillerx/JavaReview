package com.dollarkiller.factory;

import com.dollarkiller.plant.*;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-21
 * Time: 下午1:32
 * Description: No Description
 */
public class SimpleFactory {
    public static Object createPlant(String name) {
        Plant plant = null;
        if (PlantNameContant.BEAN_NAME.equals(name)) {
            plant = new Bean();
        }
        if (PlantNameContant.ICE_NAME.equals(name)) {
            plant = new Ice();

        }
        if (PlantNameContant.WALL_NAME.equals(name)) {
            plant = new Wall();
        }
        return plant;
    }

    public static Plant createPlantByClassName(String name) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return (Plant)Class.forName(name).newInstance();
    }
}
