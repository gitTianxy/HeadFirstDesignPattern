package chap01_strategypattern.operator;
/**
 * @author XinyuTian
 * @date 2016年9月25日
**/
public interface QuackBehavior extends Runnable {
    public void quack();
}
