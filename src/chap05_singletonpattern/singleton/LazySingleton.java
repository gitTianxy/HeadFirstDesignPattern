package chap05_singletonpattern.singleton;

/**
 * LazySingleton: create the single-instance as it is required
 * @author XinyuTian
 * @date 2016年9月20日
 **/
public class LazySingleton {
    private static int count;
    private volatile static LazySingleton uniqueInstance;

    private LazySingleton() {
        count++;
    }

    public static LazySingleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (LazySingleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new LazySingleton();
                }
            }
        }
        return uniqueInstance;
    }

    public int getCount() {
        return count;
    }
}
