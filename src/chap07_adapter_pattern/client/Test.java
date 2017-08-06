package chap07_adapter_pattern.client;

import chap07_adapter_pattern.adaptee.MyEnumerator;
import chap07_adapter_pattern.adaptee.MyIterator;
import chap07_adapter_pattern.adaptor.Enumeration2Iterator;
import chap07_adapter_pattern.adaptor.Iterator2Enumeration;

/**
 * TODO
 * @author XinyuTian
 * @date 2017年3月10日
**/
public class Test {
    public static void main(String[] args) {
        Integer[] intArr = {1,2,3,4,5};
        // enumeration to iterator
        MyEnumerator myEnum = new MyEnumerator(intArr.length, intArr);
        Enumeration2Iterator enum2Itr = new Enumeration2Iterator(myEnum);
        System.out.println("use Enumeration2Iterator to adaptor enum 2 itr: ");
        while (enum2Itr.hasNext()) {
            System.out.print(enum2Itr.next() + " ");
        }
        // iterator 2 enumeration
        MyIterator myItr = new MyIterator(intArr.length, intArr);
        Iterator2Enumeration itr2Enum = new Iterator2Enumeration(myItr);
        System.out.println(" \nuse Iterator2Enumeration to adaptor itr 2 enum: ");
        while (itr2Enum.hasMoreElements()) {
            System.out.print(itr2Enum.nextElement() + " ");
        }
    }
}
