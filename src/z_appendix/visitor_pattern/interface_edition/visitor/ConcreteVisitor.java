package z_appendix.visitor_pattern.interface_edition.visitor;

import z_appendix.visitor_pattern.interface_edition.element.ElementA;
import z_appendix.visitor_pattern.interface_edition.element.ElementB;
import z_appendix.visitor_pattern.interface_edition.element.Visitable;

/**
 * NOTE: visit()方法中具体定义访问元素时的操作
 * 
 * @author XinyuTian
 * @date 2017年3月13日
 **/
public class ConcreteVisitor implements Visitor {

    /**
     * 附：generalVisit更像一个模板方法,所以似乎可以定义一个AbstractVisitor可以节省代码
     */
    @Override
    public void generalVisit(Visitable ele) {
        ele.getStatus();
    }

    @Override
    public void specificVisit(ElementA eleA) {
        eleA.specificOperationOfEleA();
    }
    
    @Override
    public void specificVisit(ElementB eleB) {
        eleB.specificOperationOfEleB();
    }
}
