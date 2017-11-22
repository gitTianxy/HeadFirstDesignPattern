package z_appendix.memento_pattern.self;
/**
 * TODO
 * @author XinyuTian
 * @date 2017年3月16日
**/
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator("A");
        Caretaker caretaker = new Caretaker(originator);
        caretaker.saveMemento();
        originator.setState("B");
        caretaker.restoreMemento();
    }
}
