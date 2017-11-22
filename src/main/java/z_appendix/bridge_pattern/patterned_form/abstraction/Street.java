package z_appendix.bridge_pattern.patterned_form.abstraction;

import z_appendix.bridge_pattern.patterned_form.implementor.Motor;

/**
 * TODO
 * @author XinyuTian
 * @date 2017年3月15日
**/
public class Street extends Road {

    public Street(Motor m) {
        super(m);
    }

    @Override
    public void run() {
        m.runImp(this);
    }

}
