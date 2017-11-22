package chap03_decoratorpattern.concrete_decorator;

import chap03_decoratorpattern.component.Beverage;
import chap03_decoratorpattern.decorator.Condiment;

/**
 * TODO
 * @author XinyuTian
 * @date 2016年9月23日
**/
public class Milk extends Condiment{
    private final float price = 5.0f;
    
    public Milk(Beverage beverage) {
        super(beverage);
        description = " +Milk";
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + this.description;
    }

    @Override
    public float cost() {
        return this.beverage.cost() + this.price;
    }

}
