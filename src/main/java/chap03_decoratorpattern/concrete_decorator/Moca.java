package chap03_decoratorpattern.concrete_decorator;

import chap03_decoratorpattern.component.Beverage;
import chap03_decoratorpattern.decorator.Condiment;

/**
 * TODO
 * @author XinyuTian
 * @date 2016年9月23日
**/
public class Moca extends Condiment{
    public final float price = 50.0f;
    public final String description = "+Moca";
    
    public Moca(Beverage beverage) {
        super(beverage);
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
