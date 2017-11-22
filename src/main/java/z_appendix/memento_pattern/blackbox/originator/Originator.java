package z_appendix.memento_pattern.blackbox.originator;

import z_appendix.memento_pattern.blackbox.memento.MementoIF;

/**
 * TODO
 * 
 * @author XinyuTian
 * @date 2017年3月16日
 **/
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        System.out.println("赋值状态：" + state);
    }

    /**
     * 工厂方法，返还一个新的备忘录对象
     */
    public MementoIF createMemento(Integer idx) {
        return new Memento(idx, state);
    }

    /**
     * 发起人恢复到备忘录对象记录的状态
     */
    public void restoreMemento(MementoIF memento) {
        System.out.println("restore memento");
        this.setState(((Memento) memento).getState());
    }

    /**
     * 备忘录被设置成内部类
     * @author XinyuTian
     * @date 2017年3月16日
     */
    private class Memento implements MementoIF {
        private int idx;
        private String state;
        /**
         * 构造方法
         */
        private Memento(Integer idx, String state) {
            this.idx = idx;
            this.state = state;
        }
        private String getState() {
            return state;
        }
        @Override
        public int getIdx() {
            return idx;
        }
    }
}
