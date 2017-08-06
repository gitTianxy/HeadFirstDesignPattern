package z_appendix.flyweight_pattern.concreteFlyweight;

import z_appendix.flyweight_pattern.flyweight.FlyWeight;

/**
 * TODO
 * 
 * @author XinyuTian
 * @date 2017年3月15日
 **/
public class ConcreteFlyWeight implements FlyWeight {
    private String key;

    public ConcreteFlyWeight(String key) {
        this.key = key;
    }

    @Override
    public void action(String externalState) {
        System.out.println("internalState: key_" + this.key + ", hashCode_" + this.hashCode() + "; externalState: " + externalState);
    }

}
