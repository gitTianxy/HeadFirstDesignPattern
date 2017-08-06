package chap09_iterator_pattern.component;

/**
 * TODO
 * 
 * @author XinyuTian
 * @date 2017年3月11日
 **/
public class DinnerMenuItem implements MenuItem {
    String name;
    Double price;

    public DinnerMenuItem(String name, Double price) {
        super();
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return "name: " + getName() + "; price: " + getPrice();
    }

    @Override
    public Double getPrice() {
        return price;
    }
}
