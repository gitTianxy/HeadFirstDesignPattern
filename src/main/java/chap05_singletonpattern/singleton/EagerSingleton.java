package chap05_singletonpattern.singleton;

/**
 * EagerSingleton: create the single-instance on the load-process of the class
 * @author XinyuTian
 * @date 2016年9月20日
 **/
public class EagerSingleton {
    private static int count;
    private volatile static EagerSingleton uniqueInstance;
    static{
        if (uniqueInstance==null) {
            synchronized (EagerSingleton.class) {
                if (uniqueInstance==null) {
                    uniqueInstance = new EagerSingleton();
                }
            }
        }
    }

    private EagerSingleton() {
        count++;
    }

    public static EagerSingleton getInstance() {
        return uniqueInstance;
    }
    
    public int getCount() {
        return count;
    }
}
