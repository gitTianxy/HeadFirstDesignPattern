package chap07_adapter_pattern.adaptor;

import java.util.Iterator;

import chap07_adapter_pattern.adaptee.MyEnumerator;

/**
 * TODO
 * 
 * @author XinyuTian
 * @date 2017年3月10日
 **/
public class Enumeration2Iterator implements Iterator<Object> {
    MyEnumerator myEnum;

    public Enumeration2Iterator(MyEnumerator myEnum) {
        super();
        this.myEnum = myEnum;
    }

    @Override
    public boolean hasNext() {
        return myEnum.hasMoreElements();
    }

    @Override
    public Object next() {
        return myEnum.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("remove element in Enumeration");
    }

}
