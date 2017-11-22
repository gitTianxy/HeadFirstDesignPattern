package chap04_factorypattern.product;
/**
 * @author XinyuTian
 * @date 2016年9月21日
**/
public class CheezePizza extends Pizza{

    public CheezePizza(String name, long price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void prepare() {
        System.out.println("prepare CheezePizza");
    }

    @Override
    public void bake() {
        System.out.println("bake CheezePizza");
    }

    @Override
    public void cut() {
        System.out.println("cut CheezePizza");
    }

    @Override
    public void box() {
        System.out.println("box CheezePizza");
    }

}
