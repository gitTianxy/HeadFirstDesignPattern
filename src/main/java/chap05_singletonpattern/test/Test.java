package chap05_singletonpattern.test;

import chap05_singletonpattern.singleton.EagerSingleton;
import chap05_singletonpattern.singleton.LazySingleton;

/**
 * TWO TYPES OF SINGLETON:
 * 1. eagerSingleton: create singleton on initial
 * 2. lazySingleton: create singleton on requirement
 * @author XinyuTian
 * @date 2016年9月21日
 **/
public class Test {
    public static void main(String[] args) {
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        System.out.println("eagerSingleton.count: " + eagerSingleton.getCount());
        eagerSingleton = EagerSingleton.getInstance();
        System.out.println("eagerSingleton.count: " + eagerSingleton.getCount());

        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println("lazySingleton.count: " + lazySingleton.getCount());
        lazySingleton = LazySingleton.getInstance();
        System.out.println("lazySingleton.count: " + lazySingleton.getCount());
    }
}
