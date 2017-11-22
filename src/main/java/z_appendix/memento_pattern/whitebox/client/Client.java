package z_appendix.memento_pattern.whitebox.client;

import z_appendix.memento_pattern.whitebox.caretaker.Caretaker;
import z_appendix.memento_pattern.whitebox.originator.Originator;

/**
 * TODO
 * 
 * @author XinyuTian
 * @date 2017年3月16日
 **/
public class Client {
    public static void main(String[] args) {
        Originator o = new Originator();
        Caretaker c = new Caretaker();
        o.setState("On");
        c.saveMemento(o.createMemento());
        o.setState("Off");
        o.restoreMemento(c.retrieveMemento());
    }
}
