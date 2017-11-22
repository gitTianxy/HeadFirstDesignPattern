package chap10_state_pattern.state;

import chap10_state_pattern.context.Context;
import chap10_state_pattern.input.Input;
import chap10_state_pattern.input.InputA;

/**
 * TODO
 * 
 * @author XinyuTian
 * @date 2017年3月9日
 **/
public class StateB implements State {
    private String name = "StateB"; 
    Context context;

    public StateB() {
        super();
    }

    public StateB(Context context) {
        super();
        this.context = context;
    }

    @Override
    public void hehave(Input in) {
        System.out.println("on StateB behave when input: " + in.getKey());
        if (in.equals(InputA.getInstance())) {
            context.setPresentState(context.stateA);
        }
    }

    @Override
    public String getName() {
        return name;
    }

}
