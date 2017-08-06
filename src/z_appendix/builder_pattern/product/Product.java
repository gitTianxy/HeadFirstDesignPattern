package z_appendix.builder_pattern.product;
/**
 * TODO
 * @author XinyuTian
 * @date 2017年3月14日
**/
public class Product {
    private String name;
    private Float price;
    
    public void display() {
        System.out.println("name: " + name + ", price: " + price);
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Float getPrice() {
        return price;
    }
    public void setPrice(Float price) {
        this.price = price;
    }
    
}
