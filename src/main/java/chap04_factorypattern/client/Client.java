package chap04_factorypattern.client;

import chap04_factorypattern.product.Pizza;
import chap04_factorypattern.store.PizzaStore;

/**
 * TODO
 * @author XinyuTian
 * @date 2017年3月7日
**/
public interface Client {
    public void goToPizzaStore(PizzaStore store);
    public Pizza orderPizza(PizzaStore store);
}
