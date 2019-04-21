package com.dollarkiller.factory;

import com.dollarkiller.plant.Bean;
import com.dollarkiller.plant.Plant;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-21
 * Time: 下午2:06
 * Description: No Description
 */
public class BeanFactory implements Factory{
    public Plant createPlant() {
        Bean bean = new Bean();
        return bean;
    }
}
