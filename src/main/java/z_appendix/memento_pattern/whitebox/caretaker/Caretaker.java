package z_appendix.memento_pattern.whitebox.caretaker;

import z_appendix.memento_pattern.whitebox.memeto.Memento;

/**
 * The ROLE of 'Caretaker'
 * 1. store a memento
 * 2. transfer its memento to others
 * 
 * @author XinyuTian
 * @date 2017年3月16日
 **/
public class Caretaker {
    private Memento memento;

    /**
     * 备忘录的取值方法
     */
    public Memento retrieveMemento() {
        return this.memento;
    }

    /**
     * 备忘录的赋值方法
     */
    public void saveMemento(Memento memento) {
        this.memento = memento;
    }
}
