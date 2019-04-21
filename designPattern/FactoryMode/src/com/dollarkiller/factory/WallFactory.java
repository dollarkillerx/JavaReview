package com.dollarkiller.factory;

import com.dollarkiller.plant.Plant;
import com.dollarkiller.plant.Wall;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-21
 * Time: 下午2:06
 * Description: No Description
 */
public class WallFactory implements Factory{
    public Plant createPlant() {
        Wall wall = new Wall();
        return wall;
    }

}
