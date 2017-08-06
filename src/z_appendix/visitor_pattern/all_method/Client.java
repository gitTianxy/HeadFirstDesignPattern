package z_appendix.visitor_pattern.all_method;

/**
 * 这种情况下: 
 * 1. visitor中需要定义不同类型Element作为参数的visit方法 
 * 2. element中需要定义以Visitor作为参数的accept函数, 且对element的访问形式转换element接受visitor
 * 
 * @author kevin
 * @date 2017-08-06
 *
 */
public class Client {
    public static void main(String[] args) {
        Element eleA = new ElementA();
        Element eleB = new ElementB();
        VisitorZhang zhang = new VisitorZhang();
        eleA.accept(zhang);
        eleB.accept(zhang);
        System.out.println("----------------");
        VisitorLi li = new VisitorLi();
        eleA.accept(li);
        eleB.accept(li);
    }
}
