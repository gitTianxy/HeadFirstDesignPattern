package z_appendix.memento_pattern.self;

/**
 * TODO
 * 
 * @author XinyuTian
 * @date 2017年3月16日
 **/
public class Originator {
    private String state;

    public Originator(String state) {
        super();
        this.state = state;
    }

    public String getState() {
        System.out.println("current state: " + state);
        return state;
    }

    public void setState(String state) {
        System.out.println("state set as: " + state);
        this.state = state;
    }

}
