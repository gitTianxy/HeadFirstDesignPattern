package z_appendix.memento_pattern.whitebox.memeto;

/**
 * NOTE:
 * 1. Originator & Memento share the 'state'
 * 2. the state that stored in Memento is avaible to ALL through 'getState()' & 'setState(String state)'
 * 
 * @author XinyuTian
 * @date 2017年3月16日
 **/
public class Memento {
    private String state;

    public Memento(String state) {  
        this.state = state;  
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
