package chap04_factorypattern.factory;

import chap04_factorypattern.product.CheezePizza;
import chap04_factorypattern.product.Pizza;
import chap04_factorypattern.product.VeggiePizza;

/**
 * @author XinyuTian
 * @date 2016年9月21日
**/
public class SimplePizzaFactoryB implements SimpleFactory{
    private final Pizza[] Menu = {new CheezePizza("CheezePizza", 2000),new VeggiePizza("VeggiePizza", 1000)};
    
    @Override
    public Pizza createPizza(String type) {
        for (Pizza pizza : Menu) {
            if (pizza.getName().equals(type)) {
                return pizza;
            }
        }
        return null;
    }
}
