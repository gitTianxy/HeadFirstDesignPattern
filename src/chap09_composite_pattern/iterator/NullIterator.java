package chap09_composite_pattern.iterator;

import java.util.Iterator;

import chap09_composite_pattern.node.Component;

/**
 * TODO
 * 
 * @author XinyuTian
 * @date 2017年3月12日
 **/
public class NullIterator implements Iterator<Component> {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Component next() {
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

}
