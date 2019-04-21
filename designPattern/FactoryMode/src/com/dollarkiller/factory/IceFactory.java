package com.dollarkiller.factory;

import com.dollarkiller.plant.Ice;
import com.dollarkiller.plant.Plant;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-21
 * Time: 下午2:05
 * Description: No Description
 */
public class IceFactory implements Factory {

    public Plant createPlant() {
        Ice ice = new Ice();
        return ice;
    }
}
