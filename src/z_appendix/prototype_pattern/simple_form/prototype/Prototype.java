package z_appendix.prototype_pattern.simple_form.prototype;

/**
 * TODO
 * 
 * @author XinyuTian
 * @date 2017年3月14日
 **/
public class Prototype implements Cloneable {
    public Prototype clone() {
        Prototype prototype = null;
        try {
            prototype = (Prototype) super.clone(); // super即Object类--调用Object类中的clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototype;
    }
}
