package z_appendix.mediator_pattern.houseRentDemo.mediator;

import z_appendix.mediator_pattern.houseRentDemo.colleague.Landlord;
import z_appendix.mediator_pattern.houseRentDemo.colleague.Person;
import z_appendix.mediator_pattern.houseRentDemo.colleague.Renter;

/**
 * TODO
 * 
 * @author XinyuTian
 * @date 2017年3月17日
 **/
public class HouseMediator extends Mediator {

    @Override
    public void operation(Person person, String message) {
        if (person instanceof Renter) {
            // 将租屋的需求消息传递给 注册了的房东们
            for (Person landlord : landlordList) {
                landlord.getMessageFromMediator(message);
            }
        } else if (person instanceof Landlord) {
            // 将房东的出租房消息传递给 注册了的 房屋求租者们
            for (Person renter : renterList) {
                renter.getMessageFromMediator(message);
            }
        }
    }

}
