package z_appendix.builder_pattern.builder;

import z_appendix.builder_pattern.product.Product;

/**
 * TODO
 * @author XinyuTian
 * @date 2017年3月14日
**/
public interface Builder {
    void setPart(String name, Float price);
    Product buildProduct();
}
