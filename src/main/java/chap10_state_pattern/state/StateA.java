package chap10_state_pattern.state;

import chap10_state_pattern.context.Context;
import chap10_state_pattern.input.Input;
import chap10_state_pattern.input.InputB;

/**
 * TODO
 * @author XinyuTian
 * @date 2017年3月9日
**/
public class StateA implements State {
    private String name = "StateA"; 
    Context context;
    
    public StateA() {
        super();
    }

    public StateA(Context context) {
        super();
        this.context = context;
    }

    @Override
    public void hehave(Input in) {
        System.out.println("on stateA behave when input: " + in.getKey());
        if (in.equals(InputB.getInstance())) {
            context.setPresentState(context.stateB);
        }
    }

    @Override
    public String getName() {
        return name;
    }

}
