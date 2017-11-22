package chap04_factorypattern.product;

/**
 * @author XinyuTian
 * @date 2016年9月21日
 **/
public abstract class Pizza {
    String name;
    Long price;

    public String getName() {
        return name;
    }

    public Long getPrice() {
        return price;
    }

    public abstract void prepare();

    public abstract void bake();

    public abstract void cut();

    public abstract void box();
}
