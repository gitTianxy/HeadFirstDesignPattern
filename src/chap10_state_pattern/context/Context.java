package chap10_state_pattern.context;

import chap10_state_pattern.input.Input;
import chap10_state_pattern.state.State;
import chap10_state_pattern.state.StateA;
import chap10_state_pattern.state.StateB;

/**
 * TODO
 * @author XinyuTian
 * @date 2017年3月9日
**/
public class Context {
    public final State stateA = new StateA(this);
    public final State stateB = new StateB(this);
    
    State presentState;

    public void behave(Input in){
        presentState.hehave(in);
    }

    public State getPresentState() {
        return presentState;
    }

    public void setPresentState(State newState) {
        if (presentState == null) {
            System.out.println("context inits on state: " + newState.getName());
        } else {
            System.out.println("state of context shift from " + presentState.getName() + " to " + newState.getName());
        }
        presentState = newState;
    }
}
