package chap09_iterator_pattern.aggregate;

import java.util.Iterator;

/**
 * TODO
 * @author XinyuTian
 * @date 2017年3月11日
**/
public interface Menu<T> {
    enum MenuType {
        BREAKFASTMENU, LUNCHMENU, DINNERMENU
    }
    Iterator<T> getIterator();
}
