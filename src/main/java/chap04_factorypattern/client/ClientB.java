package chap04_factorypattern.client;

import chap04_factorypattern.product.Pizza;
import chap04_factorypattern.store.PizzaStore;

/**
 * TODO
 * 
 * @author XinyuTian
 * @date 2017年3月7日
 **/
public class ClientB implements Client {
    PizzaStore store;
    final String name = "ClientB";
    final String type = "VeggiePizza";

    @Override
    public Pizza orderPizza(PizzaStore store) {
        System.out.println("****" + name + " order: " + type + "****");
        return store.makePizza(name, type);
    }

    @Override
    public void goToPizzaStore(PizzaStore store) {
        this.store = store;
    }
}
