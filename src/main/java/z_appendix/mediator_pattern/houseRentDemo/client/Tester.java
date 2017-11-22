package z_appendix.mediator_pattern.houseRentDemo.client;

import z_appendix.mediator_pattern.houseRentDemo.colleague.Landlord;
import z_appendix.mediator_pattern.houseRentDemo.colleague.Person;
import z_appendix.mediator_pattern.houseRentDemo.colleague.Renter;
import z_appendix.mediator_pattern.houseRentDemo.mediator.HouseMediator;
import z_appendix.mediator_pattern.houseRentDemo.mediator.Mediator;

/**
 * TODO
 * 
 * @author XinyuTian
 * @date 2017年3月17日
 **/
public class Tester {
    public static void main(String[] args) {
        // 实例化房屋中介
        Mediator mediator = new HouseMediator();

        Person landlordA, landlordB, renter;
        landlordA = new Landlord("房东李", mediator);
        landlordB = new Landlord("房东黎", mediator);

        renter = new Renter("小吕", mediator);

        // 房东注册中介
        mediator.registerLandlord(landlordA);
        mediator.registerLandlord(landlordB);
        // 求租者注册中介
        mediator.registerRenter(renter);

        // 求租者 发送求租消息
        renter.sendMessage2Mediator("在天河公园附近租套房子，价格1000元左右一个月");
        System.out.println("--------------------------");
        // 房东A 发送房屋出租消息
        landlordA.sendMessage2Mediator("天河公园学院站三巷27号四楼有一房一厅出租  1200/月  光线好 近公交站");
    }
}
