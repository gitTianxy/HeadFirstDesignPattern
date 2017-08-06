package chap09_iterator_pattern.aggregate;

import java.util.Arrays;
import java.util.Iterator;

import chap09_iterator_pattern.component.BreakfastMenuItem;
import chap09_iterator_pattern.iterator.BreakfastMenuIterator;

/**
 * TODO
 * 
 * @author XinyuTian
 * @date 2017年3月11日
 **/
public class BreakfastMenu implements Menu<BreakfastMenuItem> {
    BreakfastMenuItem[] items;

    public BreakfastMenu(BreakfastMenuItem[] items) {
        super();
        this.items = items;
    }

    @Override
    public Iterator<BreakfastMenuItem> getIterator() {
        return new BreakfastMenuIterator(items);
    }

}
