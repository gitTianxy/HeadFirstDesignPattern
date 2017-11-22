package chap09_composite_pattern.node;

import java.util.ArrayList;
import java.util.Iterator;

import chap09_composite_pattern.iterator.CompositeIterator;

/**
 * TODO
 * @author XinyuTian
 * @date 2017年3月12日
**/
public class Composite extends Component {
    int idx;
    String name;
    ArrayList<Component> children = new ArrayList<Component>();

    public Composite(int idx, String name, ArrayList<Component> children) {
        super();
        this.idx = idx;
        this.name = name;
        this.children = children;
    }

    @Override
    public boolean isLeaf() {
        return false;
    }

    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public Component getChild(int idx) {
        return children.get(idx);
    }

    @Override
    public Iterator<Component> getIterator() {
        return new CompositeIterator(children);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getIdx() {
        return idx;
    }

}
