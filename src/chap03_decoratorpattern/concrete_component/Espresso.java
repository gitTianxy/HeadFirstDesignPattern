package chap03_decoratorpattern.concrete_component;

import chap03_decoratorpattern.component.Beverage;

/**
 * Espresso: 浓咖啡/蒸馏咖啡
 * @author XinyuTian
 * @date 2016年9月24日
**/
public class Espresso extends Beverage{
    public final float price = 50.0f;

    public Espresso() {
        super();
        description = "Espresso";
    }

    @Override
    public float cost() {
        return this.price;
    }

}
