package chap03_decoratorpattern.decorator;

import chap03_decoratorpattern.component.Beverage;

/**
 * @author XinyuTian
 * @date 2016年9月23日
 **/
public abstract class Condiment extends Beverage {
    protected Beverage beverage;

    public Condiment(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public abstract String getDescription();

}
