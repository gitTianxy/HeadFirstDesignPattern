package chap10_state_pattern.state;

import chap10_state_pattern.input.Input;

/**
 * @author XinyuTian
 * @date 2017年3月9日
**/
public interface State {
    public void hehave(Input in);
    public String getName();
}
