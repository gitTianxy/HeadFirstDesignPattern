package z_appendix.prototype_pattern.register_form.client;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import z_appendix.prototype_pattern.register_form.concretePrototype.ConcretePrototype;
import z_appendix.prototype_pattern.register_form.prototype.Prototype;
import z_appendix.prototype_pattern.register_form.prototypeManager.PrototypeManager;

/**
 * TODO
 * @author XinyuTian
 * @date 2017年3月14日
**/
public class Client {
    public static void main(String[] args) {
        Prototype p1 = new ConcretePrototype();
        System.out.println("---------------- after add ----------------");
        PrototypeManager.setPrototype("p1", p1);
        PrototypeManager.setPrototype("p2", p1.clone());
        PrototypeManager.goThroughMap();
        PrototypeManager.removePrototype("p1");
        System.out.println("---------------- after remove 'p1' ----------------");
        PrototypeManager.goThroughMap();
    }
}
