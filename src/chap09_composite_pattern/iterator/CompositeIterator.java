package chap09_composite_pattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;

import chap09_composite_pattern.node.Component;

/**
 * TODO
 * @author XinyuTian
 * @date 2017年3月12日
**/
public class CompositeIterator implements Iterator<Component>{
    ArrayList<Component> children;
    Iterator<Component> itr;

    public CompositeIterator(ArrayList<Component> children) {
        super();
        this.children = children;
        this.itr = children.iterator();
    }

    @Override
    public boolean hasNext() {
        return itr.hasNext();
    }

    @Override
    public Component next() {
        return itr.next();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

}
