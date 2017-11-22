package chap01_strategypattern.owner;

import chap01_strategypattern.operator.FlyNoWay;
import chap01_strategypattern.operator.QuackNoSound;

/**
 * @author XinyuTian
 * @date 2016年9月25日
**/
public class DuckB extends Duck {
    public DuckB(String name) {
        super();
        this.name = name;
        this.flyBehavior = new FlyNoWay(this.name);
        this.quackBehavior = new QuackNoSound(this.name);
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
