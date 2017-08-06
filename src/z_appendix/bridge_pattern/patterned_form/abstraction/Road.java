package z_appendix.bridge_pattern.patterned_form.abstraction;

import z_appendix.bridge_pattern.patterned_form.implementor.Motor;

/**
 * TODO
 * @author XinyuTian
 * @date 2017年3月15日
**/
public abstract class Road {
    Motor m;
    
    public Road(Motor m) {
        this.m = m;
    }

    abstract void run();
}
