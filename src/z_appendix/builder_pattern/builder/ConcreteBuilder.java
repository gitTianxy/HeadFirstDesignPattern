package z_appendix.builder_pattern.builder;

import z_appendix.builder_pattern.product.Product;

/**
 * TODO
 * 
 * @author XinyuTian
 * @date 2017年3月14日
 **/
public class ConcreteBuilder implements Builder {
    Product p = new Product();

    @Override
    public void setPart(String name, Float price) {
        p.setName(name);
        p.setPrice(price);
    }

    @Override
    public Product buildProduct() {
        return p;
    }

}
