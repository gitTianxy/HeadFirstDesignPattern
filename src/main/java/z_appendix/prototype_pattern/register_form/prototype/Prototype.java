package z_appendix.prototype_pattern.register_form.prototype;
/**
 * TODO
 * @author XinyuTian
 * @date 2017年3月14日
**/
public interface Prototype extends Cloneable {
    Prototype clone();
    void show();
}
