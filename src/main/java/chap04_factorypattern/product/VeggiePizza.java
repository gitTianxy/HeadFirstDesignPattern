package chap04_factorypattern.product;
/**
 * @author XinyuTian
 * @date 2016年9月21日
**/
public class VeggiePizza extends Pizza{

    public VeggiePizza(String name, long price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void prepare() {
        System.out.println("prepare VeggiePizza");
    }

    @Override
    public void bake() {
        System.out.println("bake VeggiePizza");
    }

    @Override
    public void cut() {
        System.out.println("cut VeggiePizza");
    }

    @Override
    public void box() {
        System.out.println("box VeggiePizza");
    }

}
