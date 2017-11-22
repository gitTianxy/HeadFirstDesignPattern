package z_appendix.memento_pattern.blackbox.client;

import z_appendix.memento_pattern.blackbox.caretaker.Caretaker;
import z_appendix.memento_pattern.blackbox.originator.Originator;

/**
 * NOTE:
 * 1. Originator操控和访问Memento对象
 * 2. Caretaker只负责保存和传递Memento对象
 * 3. Client/Context可以改变Originator的状态, 但是Memento对Client不可见
 * 
 * @author XinyuTian
 * @date 2017年3月16日
 **/
public class Client {
    public static void main(String[] args) {
        Originator o = new Originator();
        Caretaker c = new Caretaker();
        int idx = 0;
        while (idx < 5) {
            o.setState("state" + idx++);
            c.saveMemento(o.createMemento(idx));
        }
        o.restoreMemento(c.retrieveMemento(3));
    }
}
