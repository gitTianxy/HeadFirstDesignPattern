package chap01_strategypattern.operator;

/**
 * @author XinyuTian
 * @date 2016年9月25日
 **/
public class FlyNoWay implements FlyBehavior {
    private String owner;
    
    public FlyNoWay(String owner) {
        super();
        this.owner = owner;
    }

    @Override
    public void fly() {
        System.out.println(owner + ": fly no way");
    }

    @Override
    public void run() {
        while (this != null) {
            try {
                this.fly();
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
