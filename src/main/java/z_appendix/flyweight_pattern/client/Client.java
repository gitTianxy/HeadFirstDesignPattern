package z_appendix.flyweight_pattern.client;

import z_appendix.flyweight_pattern.flyweight.FlyWeight;
import z_appendix.flyweight_pattern.flyweightFactory.FlyWeightFactory;

/**
 * TODO
 * @author XinyuTian
 * @date 2017年3月15日
**/
public class Client {
    public static void main(String[] args) {
        FlyWeight fwA = FlyWeightFactory.getFlyWeight("A");
        fwA.action("in client, round1");
        FlyWeight fwA2 = FlyWeightFactory.getFlyWeight("A");
        fwA2.action("in client, round2");
        FlyWeight fwB = FlyWeightFactory.getFlyWeight("B");
        fwB.action("in client, round3");
    }
}
