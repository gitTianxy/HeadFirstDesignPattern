package z_appendix.flyweight_pattern.flyweightFactory;

import java.util.concurrent.ConcurrentHashMap;

import z_appendix.flyweight_pattern.concreteFlyweight.ConcreteFlyWeight;
import z_appendix.flyweight_pattern.flyweight.FlyWeight;

/**
 * TODO
 * 
 * @author XinyuTian
 * @date 2017年3月15日
 **/
public class FlyWeightFactory {
    private static ConcurrentHashMap<String, FlyWeight> allFlyWeight = new ConcurrentHashMap<String, FlyWeight>();

    /**
     * 
     * @param name
     * @return
     */
    public static FlyWeight getFlyWeight(String name) {
        if (allFlyWeight.get(name) == null) {
            synchronized (allFlyWeight) {
                if (allFlyWeight.get(name) == null) {
                    FlyWeight flyWeight = new ConcreteFlyWeight(name);
                    allFlyWeight.put(name, flyWeight);
                }
            }
        }
        return allFlyWeight.get(name);
    }
}
