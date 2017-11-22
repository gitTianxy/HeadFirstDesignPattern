package z_appendix.memento_pattern.blackbox.caretaker;

import java.util.ArrayList;
import java.util.List;

import z_appendix.memento_pattern.blackbox.memento.MementoIF;

/**
 * TODO
 * 
 * @author XinyuTian
 * @date 2017年3月16日
 **/
public class Caretaker {
    private List<MementoIF> mementos;

    public Caretaker() {
        mementos = new ArrayList<MementoIF>();
    }

    /**
     * 备忘录取值方法
     */
    public MementoIF retrieveMemento(int idx) {
        return mementos.get(idx);
    }

    /**
     * 备忘录赋值方法
     */
    public void saveMemento(MementoIF memento) {
        System.out.println("save memento");
        mementos.add(memento);
    }
}
