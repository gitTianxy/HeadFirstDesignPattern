package z_appendix.builder_pattern.director;

import z_appendix.builder_pattern.builder.Builder;
import z_appendix.builder_pattern.builder.ConcreteBuilder;
import z_appendix.builder_pattern.product.Product;

/**
 * director is the one who holds the builder of product
 * 
 * @author XinyuTian
 * @date 2017年3月15日
 **/
public class Director {
    Builder builder = new ConcreteBuilder();
    
    public Product getProductA() {
        builder.setPart("productA", 1000.00f);
        return builder.buildProduct();
    }
    
    public Product getProductB() {
        builder.setPart("productB", 2000.00f);
        return builder.buildProduct();
    }
}
