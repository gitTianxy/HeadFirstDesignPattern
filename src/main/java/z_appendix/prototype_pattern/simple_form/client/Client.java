package z_appendix.prototype_pattern.simple_form.client;

import z_appendix.prototype_pattern.simple_form.concretePrototype.ConcretePrototype;

/**
 * TODO
 * 
 * @author XinyuTian
 * @date 2017年3月14日
 **/
public class Client {
    public static void main(String[] args) {
        ConcretePrototype cp = new ConcretePrototype();
        for (int i = 0; i < 5; i++) {
            ConcretePrototype clonecp = (ConcretePrototype) cp.clone();
            clonecp.show();
        }
    }
}
