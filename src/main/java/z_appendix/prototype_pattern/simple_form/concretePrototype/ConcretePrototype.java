package z_appendix.prototype_pattern.simple_form.concretePrototype;

import z_appendix.prototype_pattern.simple_form.prototype.Prototype;

/**
 * TODO
 * 
 * @author XinyuTian
 * @date 2017年3月14日
 **/
public class ConcretePrototype extends Prototype {
    public void show() {
        System.out.println("原型模式实现类:" + this);
    }
}
