package z_appendix.mediator_pattern.houseRentDemo.colleague;

import z_appendix.mediator_pattern.houseRentDemo.mediator.Mediator;

/**
 * TODO
 * 
 * @author XinyuTian
 * @date 2017年3月17日
 **/
public abstract class Person {
    // 维持一个抽象中介者的引用
    protected Mediator mediator;

    protected String name;

    public Person(String name, Mediator mediator) {
        this.mediator = mediator;
        this.name = name;
    }

    /**
     * 设置中介者对象
     * 
     * @param mediator
     */
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    /**
     * 向中介 发送消息
     */
    public abstract void sendMessage2Mediator(String msg);

    /**
     * 从中介 获取消息
     */
    public abstract void getMessageFromMediator(String msg);
}
