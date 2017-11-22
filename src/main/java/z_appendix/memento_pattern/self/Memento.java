package z_appendix.memento_pattern.self;
/**
 * TODO
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
