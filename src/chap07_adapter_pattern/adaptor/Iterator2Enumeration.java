package chap07_adapter_pattern.adaptor;

import java.util.Enumeration;

import chap07_adapter_pattern.adaptee.MyIterator;

/**
 * TODO
 * 
 * @author XinyuTian
 * @date 2017年3月11日
 **/
public class Iterator2Enumeration implements Enumeration<Object> {
    MyIterator myItr;

    public Iterator2Enumeration(MyIterator myItr) {
        super();
        this.myItr = myItr;
    }

    @Override
    public boolean hasMoreElements() {
        return myItr.hasNext();
    }

    @Override
    public Object nextElement() {
        return myItr.next();
    }

}
