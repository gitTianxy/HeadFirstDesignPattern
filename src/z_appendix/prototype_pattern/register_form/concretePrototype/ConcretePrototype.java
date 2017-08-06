package z_appendix.prototype_pattern.register_form.concretePrototype;

import z_appendix.prototype_pattern.register_form.prototype.Prototype;

/**
 * TODO
 * @author XinyuTian
 * @date 2017年3月14日
**/
public class ConcretePrototype implements Prototype{

    @Override
    public Prototype clone() {
        return new ConcretePrototype();
    }

    public void show(){
        System.out.println("this is a 'ConcretePrototype': " + this);
    }
}
