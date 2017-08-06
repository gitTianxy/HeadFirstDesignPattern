package chap07_adapter_pattern.adaptee;

import java.util.Enumeration;

/**
 * TODO
 * 
 * @author XinyuTian
 * @date 2017年3月10日
 **/
public class MyEnumerator implements Enumeration<Object> {
    int cursor; // 游标
    int length; // 存储的数组的长度
    Object[] dataArray; // 存储数据数组的引用

    public MyEnumerator(Integer length, Object[] dataArray) {
        this.cursor = 0;
        this.length = length;
        this.dataArray = dataArray;
    }

    @Override
    public boolean hasMoreElements() {
        return cursor < length;
    }

    @Override
    public Object nextElement() {
        return dataArray[cursor++];
    }

}
