package chap10_state_pattern.client;

import chap10_state_pattern.input.Input;
import chap10_state_pattern.input.InputA;

/**
 * TODO
 * @author XinyuTian
 * @date 2017年3月9日
**/
public class ClientA implements Client {
    @Override
    public Input giveOrder() {
        return InputA.getInstance();
    }
}
