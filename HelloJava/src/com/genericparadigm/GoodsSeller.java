package com.genericparadigm;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-6
 * Time: 下午3:56
 * Description: No Description
 */
public class GoodsSeller {

    public void sellGoods(List<? extends Goods> goods) {
        for(Goods g:goods) {
            g.sell();
        }
    }

}
