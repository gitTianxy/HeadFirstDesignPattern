package z_appendix.memento_pattern.self;
/**
 * TODO
 * @author XinyuTian
 * @date 2017年3月16日
**/
public class Caretaker {
    private Originator originator;
    private Memento memento;
    
    public Caretaker(Originator originator) {
        super();
        this.originator = originator;
    }
    
    public void saveMemento() {
        this.memento = new Memento(originator.getState());
        System.out.println("save state in memento");
    }
    
    public void restoreMemento() {
        System.out.println("restore state to state in memento");
        originator.setState(memento.getState());
    }
}
