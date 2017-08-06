package chap04_factorypattern.factory;

import chap04_factorypattern.product.CheezePizza;
import chap04_factorypattern.product.Pizza;
import chap04_factorypattern.product.VeggiePizza;

/**
 * @author XinyuTian
 * @date 2016年9月21日
**/
public class SimplePizzaFactoryA implements SimpleFactory{
    @Override
    public Pizza createPizza(String type){
        Pizza pizza = null;
        if ("VeggiePizza".equals(type)) {
            pizza = new VeggiePizza("Veggie", 10);
        } else if ("CheezePizza".equals(type)) {
            pizza = new CheezePizza("Cheeze", 20);
        }
        return pizza;
    }
}
