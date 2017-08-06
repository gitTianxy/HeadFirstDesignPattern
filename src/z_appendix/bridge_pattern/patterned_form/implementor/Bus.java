package z_appendix.bridge_pattern.patterned_form.implementor;

import z_appendix.bridge_pattern.patterned_form.abstraction.Road;

/**
 * TODO
 * 
 * @author XinyuTian
 * @date 2017年3月15日
 **/
public class Bus implements Motor {

    @Override
    public void runImp(Road r) {
        System.out.println("bus run on " + r.getClass().getSimpleName());
    }

}
