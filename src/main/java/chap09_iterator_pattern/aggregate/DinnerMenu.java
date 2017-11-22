package chap09_iterator_pattern.aggregate;

import java.util.ArrayList;
import java.util.Iterator;

import chap09_iterator_pattern.component.DinnerMenuItem;
import chap09_iterator_pattern.iterator.DinnerMenuIterator;

/**
 * TODO
 * 
 * @author XinyuTian
 * @date 2017年3月11日
 **/
public class DinnerMenu implements Menu<DinnerMenuItem> {
    ArrayList<DinnerMenuItem> items;

    public DinnerMenu(ArrayList<DinnerMenuItem> items) {
        super();
        this.items = items;
    }

    @Override
    public Iterator<DinnerMenuItem> getIterator() {
        return new DinnerMenuIterator(items);
    }

}
