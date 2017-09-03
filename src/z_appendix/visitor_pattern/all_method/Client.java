package z_appendix.visitor_pattern.all_method;

/**
 * 这种情况下: 
 * 1. visitor中需要对不同element分别定义visit方法(其入参即为不同类型Element)
 * 2. element中需要定义以Visitor作为参数的accept函数, 即访问形式由'visitor访问element'转变成'element接受visitor的访问'
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
