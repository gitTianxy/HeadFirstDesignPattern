package chap10_state_pattern.test;

import chap10_state_pattern.client.ClientA;
import chap10_state_pattern.client.ClientB;
import chap10_state_pattern.context.Context;

/**
 * TODO
 * @author XinyuTian
 * @date 2017年3月9日
**/
public class Test {
    public static void main(String[] args) {
        Context context = new Context();
        context.setPresentState(context.stateA);
        ClientA clientA = new ClientA();
        context.behave(clientA.giveOrder());
        ClientB clientB = new ClientB();
        context.behave(clientB.giveOrder());
        context.behave(clientB.giveOrder());
        context.behave(clientA.giveOrder());
    }
}
