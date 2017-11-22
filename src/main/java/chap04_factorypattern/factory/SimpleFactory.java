package chap04_factorypattern.factory;

import chap04_factorypattern.product.Pizza;

/**
 * @author XinyuTian
 * @date 2016年9月22日
**/
public interface SimpleFactory {
    Pizza createPizza(String type);
}
