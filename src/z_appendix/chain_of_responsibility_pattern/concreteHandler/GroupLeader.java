package z_appendix.chain_of_responsibility_pattern.concreteHandler;

import z_appendix.chain_of_responsibility_pattern.handler.Handler;

/**
 * TODO
 * @author XinyuTian
 * @date 2017年3月16日
**/
public class GroupLeader extends Handler {

    @Override
    public boolean approve(double day) {
        if(day<0.5){  
            System.out.println("小组长审批通过");  
            return true;  
        }else {  
            System.out.println("小组长传给了他的上司");  
            return getHandler().approve(day);  
        }
    }

}
