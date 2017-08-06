package chap10_state_pattern.client;

import chap10_state_pattern.input.Input;
import chap10_state_pattern.input.InputB;

/**
 * TODO
 * @author XinyuTian
 * @date 2017年3月9日
**/
public class ClientB implements Client {
    @Override
    public Input giveOrder() {
        return InputB.getInstance();
    }

}
