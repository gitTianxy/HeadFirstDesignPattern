package z_appendix.builder_pattern.client;

import z_appendix.builder_pattern.director.Director;

/**
 * TODO
 * @author XinyuTian
 * @date 2017年3月15日
**/
public class Tester {
    public static void main(String[] args) {
        Director director = new Director();
        director.getProductA().display();
        director.getProductB().display();
    }
}
