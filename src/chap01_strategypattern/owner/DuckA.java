package chap01_strategypattern.owner;

import chap01_strategypattern.operator.FlyWithWings;
import chap01_strategypattern.operator.Quack;

/**
 * @author XinyuTian
 * @date 2016年9月25日
**/
public class DuckA extends Duck {
    
    public DuckA(String name) {
        super();
        this.name = name;
        this.flyBehavior = new FlyWithWings(this.name);
        this.quackBehavior = new Quack(this.name);
    }

    @Override
    public void display() {
        System.out.println(this.name);
    }

    @Override
    public void performActions() {
        Thread flyThrA = new Thread(this.flyBehavior);
        flyThrA.start();
        Thread quackThrA = new Thread(this.quackBehavior);
        quackThrA.start();
    }

}
