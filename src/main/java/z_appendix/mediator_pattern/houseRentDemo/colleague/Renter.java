package z_appendix.mediator_pattern.houseRentDemo.colleague;

import z_appendix.mediator_pattern.houseRentDemo.mediator.Mediator;

/**
 * TODO
 * 
 * @author XinyuTian
 * @date 2017年3月17日
 **/
public class Renter extends Person {
    public Renter(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    public void sendMessage2Mediator(String msg) {
        mediator.operation(this, msg);
    }

    @Override
    public void getMessageFromMediator(String msg) {
        System.out.println("求租者[" + name + "]收到中介发来的消息： " + msg);
    }
}
