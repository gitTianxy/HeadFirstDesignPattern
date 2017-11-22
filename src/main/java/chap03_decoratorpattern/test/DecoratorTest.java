package chap03_decoratorpattern.test;

import chap03_decoratorpattern.component.Beverage;
import chap03_decoratorpattern.concrete_component.Espresso;
import chap03_decoratorpattern.concrete_component.HouseBlend;
import chap03_decoratorpattern.concrete_decorator.Milk;
import chap03_decoratorpattern.concrete_decorator.Moca;

/**
 * @author XinyuTian
 * @date 2016年9月24日
**/
public class DecoratorTest {
    public static void main(String[] args) {
        int idx = 0;
        System.out.println("**** "+ (++idx) +"st Round");
        Beverage beverage1 = new Espresso();
        System.out.println(beverage1.getDescription() + ": $" + beverage1.cost());
        beverage1 = new Milk(beverage1);
        beverage1 = new Milk(beverage1);
        beverage1 = new Moca(beverage1);
        System.out.println(beverage1.getDescription() + ": $" + beverage1.cost());
        System.out.println("**** "+ (++idx) +"st Round");
        Beverage beverage2 = new HouseBlend();
        System.out.println(beverage2.getDescription() + ": $" + beverage2.cost());
        beverage2 = new Milk(beverage2);
        System.out.println(beverage2.getDescription() + ": $" + beverage2.cost());
        beverage2 = new Milk(beverage2);
        System.out.println(beverage2.getDescription() + ": $" + beverage2.cost());
        beverage2 = new Moca(beverage2);
        System.out.println(beverage2.getDescription() + ": $" + beverage2.cost());
    }
}
