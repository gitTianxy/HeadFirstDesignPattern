package chap09_iterator_pattern.iterator;

import java.util.Iterator;

import chap09_iterator_pattern.component.BreakfastMenuItem;

/**
 * TODO
 * @author XinyuTian
 * @date 2017年3月11日
**/
public class BreakfastMenuIterator implements Iterator<BreakfastMenuItem>{
    BreakfastMenuItem[] items;
    int cursor;
    int length;

    public BreakfastMenuIterator(BreakfastMenuItem[] items) {
        super();
        this.items = items;
        this.cursor = 0;
        this.length = items.length;
    }

    @Override
    public boolean hasNext() {
        if (cursor >= length || items[cursor]==null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public BreakfastMenuItem next() {
        return items[cursor++];
    }

    @Override
    public void remove() {
        if (cursor <= 0 || items[--cursor]==null) { // --cursor注意
            throw new IllegalStateException();
        }
        int len = length - cursor -1;
        System.arraycopy(items, cursor+1, items, cursor, len);
        items[--length] = null;
    }
    
}
