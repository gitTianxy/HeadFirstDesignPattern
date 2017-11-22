package chap01_strategypattern.owner;

import chap01_strategypattern.operator.FlyBehavior;
import chap01_strategypattern.operator.QuackBehavior;

/**
 * 策略模式: 
 * 1.行为委托--行为多变,委托给不同的类实现(接口类型的属性+模板方法)
 * 2.统一接口--给外部用户提供统一接口(此处的接口指owner暴露给外部的属性和方法)
 * 
 * NOTE: 
 * owner采用'抽象类'而不是'接口'的原因是: 
 *      1)它所拥有的属性(operators)在接口中必须初始化成具体类型--无法实现行为委托的目的;
 *      2)在其中无法定义'performFly()'等模板方法--当然行为委托也就没有了用武之地
 * @author XinyuTian
 * @date 2016年9月25日
**/
public abstract class Duck {
    protected String name;
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public abstract void display();
    
    public abstract void performActions();
    
    public void performFly() {
        flyBehavior.fly();
    }
    
    public void performQuack() {
        quackBehavior.quack();
    }
    
    public void swim() {
        System.out.println("duck swim");
    }
}
