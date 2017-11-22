package chap01_strategypattern.operator;

/**
 * @author XinyuTian
 * @date 2016年9月25日
 **/
public class QuackNoSound implements QuackBehavior {
    private String owner;
    
    public QuackNoSound(String owner) {
        super();
        this.owner = owner;
    }

    @Override
    public void quack() {
        System.out.println(owner + ": quack no sound");
    }

    @Override
    public void run() {
        
    }

}
