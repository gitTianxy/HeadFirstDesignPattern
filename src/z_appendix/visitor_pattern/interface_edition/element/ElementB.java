package z_appendix.visitor_pattern.interface_edition.element;

import z_appendix.visitor_pattern.interface_edition.visitor.Visitor;

/**
 * 统一实现接受访问者访问的方法
 * 
 * @author XinyuTian
 * @date 2017年3月13日
**/
public class ElementB implements Visitable {

    public void specificOperationOfEleB() {
        System.out.println("specific operation of element B");
    }
    
    @Override
    public void accept(Visitor v) {
        v.generalVisit(this);
        v.specificVisit(this);
    }

    @Override
    public void getStatus() {
        System.out.println("This is element B");
    }

}
