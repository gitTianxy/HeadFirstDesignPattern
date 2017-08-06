package chap09_composite_pattern.node;

import java.util.Iterator;

import chap09_composite_pattern.iterator.NullIterator;

/**
 * TODO
 * 
 * @author XinyuTian
 * @date 2017年3月12日
 **/
public class Leaf extends Component {
    int idx;
    String name;

    public Leaf(Integer idx, String name) {
        super();
        this.idx = idx;
        this.name = name;
    }

    @Override
    public boolean isLeaf() {
        return true;
    }

    @Override
    public Iterator<Component> getIterator() {
        return new NullIterator();
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
