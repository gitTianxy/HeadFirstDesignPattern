package z_appendix.chain_of_responsibility_pattern.concreteHandler;

import z_appendix.chain_of_responsibility_pattern.handler.Handler;

/**
 * TODO
 * 
 * @author XinyuTian
 * @date 2017年3月16日
 **/
public class CEO extends Handler {

    @Override
    public boolean approve(double day) {
        System.out.println("总经理审批通过");
        return true;
    }

}
