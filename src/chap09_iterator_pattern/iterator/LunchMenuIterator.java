package chap09_iterator_pattern.iterator;

import java.util.Hashtable;
import java.util.Iterator;

import chap09_iterator_pattern.component.MenuItem;

/**
 * TODO
 * @author XinyuTian
 * @date 2017年3月11日
**/
public class LunchMenuIterator implements Iterator<MenuItem>{
    Hashtable<String, MenuItem> items;
    Iterator<MenuItem> itr;

    public LunchMenuIterator(Hashtable<String, MenuItem> items) {
        super();
        this.items = items;
        this.itr = items.values().iterator();
    }

    @Override
    public boolean hasNext() {
        return itr.hasNext();
    }

    @Override
    public MenuItem next() {
        return itr.next();
    }

    @Override
    public void remove() {
        itr.remove();
    }
    
}
