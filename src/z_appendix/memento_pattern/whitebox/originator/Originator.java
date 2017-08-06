package z_appendix.memento_pattern.whitebox.originator;

import z_appendix.memento_pattern.whitebox.memeto.Memento;

/**
 * NOTE:
 * 1. Originator & Memento share the 'state'
 * 2. Originator can record its state by 'createMemento()'
 * 3. Originator can restore to the state that hold by Memento through 'restoreMemento(Memento memento)'
 * 
 * @author XinyuTian
 * @date 2017年3月16日
 **/
public class Originator {
    private String state;

    /**
     * 工厂方法，返回一个新的备忘录对象
     */
    public Memento createMemento() {
        System.out.println("存储状态'" + state + "'到备忘录");
        return new Memento(state);
    }

    /**
     * 将发起人恢复到备忘录对象所记载的状态
     */
    public void restoreMemento(Memento memento) {
        this.state = memento.getState();
        System.out.println("状态恢复成'" + state + "'");
    }

    public String getState() {
        System.out.println("当前状态为'" + state + "'");
        return state;
    }

    public void setState(String state) {
        System.out.println("状态被设置成'" + state + "'");
        this.state = state;
    }
}
