package chap04_factorypattern.store;

import chap04_factorypattern.factory.SimpleFactory;
import chap04_factorypattern.factory.SimplePizzaFactoryB;

/**
 * TODO
 * 
 * @author XinyuTian
 * @date 2017年3月7日
 **/
public class PizzaStoreB extends PizzaStore {
    final SimpleFactory factory = new SimplePizzaFactoryB();
    
    @Override
    public SimpleFactory getFactory() {
        return factory;
    }

    @Override
    String getName() {
        return "PizzaStoreB";
    }

}
