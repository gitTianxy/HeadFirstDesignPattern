package z_appendix.mediator_pattern.houseRentDemo.mediator;

import java.util.ArrayList;
import java.util.List;

import z_appendix.mediator_pattern.houseRentDemo.colleague.Person;

/**
 * TODO
 * 
 * @author XinyuTian
 * @date 2017年3月17日
 **/
public abstract class Mediator {
    // 用于添加储存 "房东"角色
    protected List<Person> landlordList = new ArrayList<Person>();

    // 用于添加储存 "求租者"角色
    protected List<Person> renterList = new ArrayList<Person>();

    /**
     * 中介者注册房东信息
     * 
     * @param landlord
     *            房东实体
     */
    public void registerLandlord(Person landlord) {
        landlordList.add(landlord);
    }

    /**
     * 中介者注册 求租者信息
     * 
     * @param landlord
     *            房东实体
     */
    public void registerRenter(Person landlord) {
        renterList.add(landlord);
    }

    /**
     * 声明抽象方法 由具体中介者子类实现 消息的中转和协调
     */
    public abstract void operation(Person person, String message);

}
