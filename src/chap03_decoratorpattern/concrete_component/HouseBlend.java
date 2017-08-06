package chap03_decoratorpattern.concrete_component;

import chap03_decoratorpattern.component.Beverage;

/**
 * 北美特别流行的黑咖啡，它属于混合咖啡，配方因地而有所不同
 * @author XinyuTian
 * @date 2016年9月24日
**/
public class HouseBlend extends Beverage{
    public final float price = 500.0f;

    public HouseBlend() {
        super();
        description = "HouseBlend";
    }

    @Override
    public float cost() {
        return this.price;
    }

}
