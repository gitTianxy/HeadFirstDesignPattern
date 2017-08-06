package chap09_iterator_pattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;

import chap09_iterator_pattern.component.DinnerMenuItem;

/**
 * TODO
 * 
 * @author XinyuTian
 * @date 2017年3月11日
 **/
public class DinnerMenuIterator implements Iterator<DinnerMenuItem> {
    ArrayList<DinnerMenuItem> items;
    Iterator<DinnerMenuItem> itr;

    public DinnerMenuIterator(ArrayList<DinnerMenuItem> items) {
        super();
        this.items = items;
        this.itr = items.iterator();
    }

    @Override
    public boolean hasNext() {
        return itr.hasNext();
    }

    @Override
    public DinnerMenuItem next() {
        return itr.next();
    }

    @Override
    public void remove() {
        itr.remove();
    }

}
