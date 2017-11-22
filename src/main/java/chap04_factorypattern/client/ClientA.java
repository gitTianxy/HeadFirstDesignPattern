package chap04_factorypattern.client;

import chap04_factorypattern.product.Pizza;
import chap04_factorypattern.store.PizzaStore;
import chap04_factorypattern.store.PizzaStoreA;

/**
 * TODO
 * @author XinyuTian
 * @date 2017年3月7日
**/
public class ClientA implements Client{
    PizzaStore store;
    final String name = "ClientA";
    final String type = "CheezePizza";
    
    @Override
    public void goToPizzaStore(PizzaStore store) {
        this.store = store;
    }
    
    @Override
    public Pizza orderPizza(PizzaStore store) {
        System.out.println("****" + name + " order: " + type + "****");
        return store.makePizza(name, type);
    }
    
    public static void main(String[] args) {
        ClientA clientA = new ClientA();
        clientA.goToPizzaStore(new PizzaStoreA());
        clientA.orderPizza(clientA.store);
    }
}
