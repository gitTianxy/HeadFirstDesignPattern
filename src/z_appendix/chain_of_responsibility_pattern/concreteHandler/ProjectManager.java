package z_appendix.chain_of_responsibility_pattern.concreteHandler;

import z_appendix.chain_of_responsibility_pattern.handler.Handler;

/**
 * TODO
 * 
 * @author XinyuTian
 * @date 2017年3月16日
 **/
public class ProjectManager extends Handler {

    @Override
    public boolean approve(double day) {
        if (day < 2) {
            System.out.println("项目经理审批通过");
            return true;
        } else {
            System.out.println("项目经理传给了他的上司");
            return getHandler().approve(day);
        }
    }

}
