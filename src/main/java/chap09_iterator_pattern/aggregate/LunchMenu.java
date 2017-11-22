package chap09_iterator_pattern.aggregate;

import java.util.Hashtable;
import java.util.Iterator;

import chap09_iterator_pattern.component.LunchMenuItem;
import chap09_iterator_pattern.component.MenuItem;
import chap09_iterator_pattern.iterator.LunchMenuIterator;

/**
 * TODO
 * @author XinyuTian
 * @date 2017年3月11日
**/
public class LunchMenu implements Menu<MenuItem> {
    Hashtable<String, MenuItem> items;
    
    public LunchMenu(Hashtable<String, MenuItem> items) {
        super();
        this.items = items;
    }

    @Override
    public Iterator<MenuItem> getIterator() {
        return new LunchMenuIterator(items);
    }
    
}
