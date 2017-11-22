package chap08_tplmethodpattern.test;

import chap08_tplmethodpattern.abstractcls.Coffee;
import chap08_tplmethodpattern.concretecls.MocaCoffee;

/**
 * TODO
 * @author XinyuTian
 * @date 2016年9月26日
**/
public class CoffeeStore {
    public static void main(String[] args) {
        Coffee coffee = new MocaCoffee();
        coffee.makeCoffee(coffee.new Condiment(), new MocaCoffee().new Moca());
    }
}
