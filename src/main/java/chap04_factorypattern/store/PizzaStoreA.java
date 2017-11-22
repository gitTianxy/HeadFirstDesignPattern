package chap04_factorypattern.store;

import javax.xml.parsers.FactoryConfigurationError;

import chap04_factorypattern.factory.SimpleFactory;
import chap04_factorypattern.factory.SimplePizzaFactoryA;

/**
 * TODO
 * 
 * @author XinyuTian
 * @date 2017年3月7日
 **/
public class PizzaStoreA extends PizzaStore {
    final SimpleFactory factory = new SimplePizzaFactoryA();
    
    @Override
    public SimpleFactory getFactory() {
        return factory;
    }

    @Override
    String getName() {
        return "PizzaStoreA";
    }

}
