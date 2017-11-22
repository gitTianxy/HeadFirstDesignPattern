package z_appendix.bridge_pattern.patterned_form.client;

import z_appendix.bridge_pattern.patterned_form.abstraction.SpeedWay;
import z_appendix.bridge_pattern.patterned_form.abstraction.Street;
import z_appendix.bridge_pattern.patterned_form.implementor.Bus;
import z_appendix.bridge_pattern.patterned_form.implementor.Car;

/**
 * 桥接模式将原始的层级结构(primary_hierarchical_form)解构成了平行的两层结构
 * 1. 解耦了抽象者(road)和实现者(motor)，使其能独立变化
 * 2. 增加了用户对系统的使用入口——原来只有一个末端入口，现在变成了road和moter两个平行入口(new Road同时要new Motor)
 * @author XinyuTian
 * @date 2017年3月15日
**/
public class Tester {
    public static void main(String[] args) {
        Bus bus = new Bus();
        Car car = new Car();
        Street busOnStreet = new Street(bus);
        busOnStreet.run();
        Street carOnStreet = new Street(car);
        carOnStreet.run();
        SpeedWay carOnSpeedWay = new SpeedWay(car);
        carOnSpeedWay.run();
    }
}
