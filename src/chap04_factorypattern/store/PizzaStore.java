package chap04_factorypattern.store;

import chap04_factorypattern.factory.SimpleFactory;
import chap04_factorypattern.product.Pizza;

/**
 * TODO
 * 
 * @author XinyuTian
 * @date 2017年3月7日
 **/
public abstract class PizzaStore {
    abstract SimpleFactory getFactory();
    abstract String getName();

    public Pizza makePizza(String clientName, String type) {
        System.out.println("---- " + getName() + " make " + type + " for " + clientName + " ----");
        Pizza pizza = getFactory().createPizza(type);
        if (pizza == null) {
            System.out.println(type + " is not available !!!");
        } else {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
        System.out.println();
        return pizza;
    }
}
