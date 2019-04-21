package com.dollarkiller.factory;

import com.dollarkiller.plant.*;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-21
 * Time: 下午2:10
 * Description: No Description
 */
public class FactoryBuider {
    public static Factory build(String name) {
        Factory factory = null;
        if (PlantNameContant.BEAN_NAME.equals(name)) {
            factory = new BeanFactory();
        }
        if (PlantNameContant.ICE_NAME.equals(name)) {
            factory = new IceFactory();

        }
        if (PlantNameContant.WALL_NAME.equals(name)) {
            factory = new WallFactory();
        }
        return factory;
    }

    public static Factory buildByClassName(String name) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return (Factory)Class.forName(name).newInstance();
    }
}
