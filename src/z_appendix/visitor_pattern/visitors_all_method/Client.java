package z_appendix.visitor_pattern.visitors_all_method;

/**
 * 这种情况下:
 * 1. visitor中需要定义不同类型Element作为参数的visit方法
 * 2. element中需要定义以不同类型Visitor作为参数的accept函数
 * 
 * @author kevin
 * @date 2017-08-06
 *
 */
public class Client {
    public static void main(String[] args) {
        Visitor v = new VisitorImpl();
        new ElementA().accept(v);
        new ElementB().accept(v);
    }
}
