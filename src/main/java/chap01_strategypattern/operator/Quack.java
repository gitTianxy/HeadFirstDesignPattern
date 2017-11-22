package chap01_strategypattern.operator;

/**
 * @author XinyuTian
 * @date 2016年9月25日
 **/
public class Quack implements QuackBehavior {
    private String owner;
    
    public Quack(String owner) {
        super();
        this.owner = owner;
    }

    @Override
    public void quack() {
        System.out.println(owner + ": quack");
    }

    @Override
    public void run() {
        while (this != null) {
            try {
                this.quack();
                Thread.sleep(10000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
