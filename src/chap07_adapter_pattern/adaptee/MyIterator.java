package chap07_adapter_pattern.adaptee;

import java.util.Iterator;

/**
 * TODO
 * @author XinyuTian
 * @date 2017年3月10日
**/
public class MyIterator implements Iterator<Object>{
    int cursor; // 游标
    int length; // 存储的数组的长度
    Object[] dataArray; // 存储数据数组的引用
    
    public MyIterator(int length, Object[] dataArray) {
        super();
        this.cursor = 0;
        this.length = length;
        this.dataArray = dataArray;
    }

    @Override
    public boolean hasNext() {
        return cursor < length;
    }

    @Override
    public Object next() {
        return dataArray[cursor++];
    }

    @Override
    public void remove() {
        remove(cursor);
    }
    
    private Object remove(int index) {
        Object oldEle = dataArray[index];
        int numMoved = length - index - 1;
        if (numMoved > 0) {
            System.arraycopy(dataArray, index+1, dataArray, index, numMoved);
        }
        dataArray[--length] = null;
        return oldEle;
    }

    public static void main(String[] args) {
        Integer[] intArr = {1,2,3,4,5};
        MyIterator myItr = new MyIterator(intArr.length, intArr);
        int idx = -1;
        while (myItr.hasNext()) {
            idx++;
            if (idx == myItr.length/2) {
                myItr.remove();
            }
            System.out.println(myItr.next());
        }
    }
}
