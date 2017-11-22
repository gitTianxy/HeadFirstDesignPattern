package z_appendix.visitor_pattern.final_compromise_edition.element;

import z_appendix.visitor_pattern.final_compromise_edition.visitor.AbstractVisitor;

/**
 * 统一实现接受访问者访问的方法
 * 
 * @author XinyuTian
 * @date 2017年3月13日
 **/
public class ElementA implements Visitable {

    public void specificOperationOfEleA() {
        System.out.println("specific operation of element A");
    }

    @Override
    public void getStatus() {
        System.out.println("This is element A");
    }

    @Override
    public void accept(AbstractVisitor v) {
        v.generalVisit(this);
        v.specificVisit(this);
    }

}
