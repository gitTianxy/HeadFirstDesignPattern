package chap09_composite_pattern.node;

import java.util.Iterator;

/**
 * TODO
 * 
 * @author XinyuTian
 * @date 2017年3月12日
 **/
public abstract class Component {
    
    public void add(Component c) {
        throw new UnsupportedOperationException();
    }

    public void remove(Component c) {
        throw new UnsupportedOperationException();
    }

    public Component getChild(int idx) {
        throw new UnsupportedOperationException();
    }

    public void getDescription() {
        if (isLeaf()) {
            System.out.println("LEAF_"+getIdx()+"_"+getName());
        } else {
            System.out.println("COMPOSITE_"+getIdx()+"_"+getName());
        }
        Iterator<Component> itr = getIterator();
        while (itr.hasNext()) {
            Component c = (Component) itr.next();
            c.getDescription();
        }
    }
    
    public abstract boolean isLeaf();
    
    public abstract Iterator<Component> getIterator();
    
    public abstract String getName();
    
    public abstract int getIdx();
}
