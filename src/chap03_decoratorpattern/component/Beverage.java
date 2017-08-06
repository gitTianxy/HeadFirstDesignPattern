package chap03_decoratorpattern.component;

/**
 * Beverage: drink
 * @author XinyuTian
 * @date 2016年9月23日
 **/
public abstract class Beverage {
    protected String description;

    public String getDescription() {
        return description;
    };

    public abstract float cost();
}
