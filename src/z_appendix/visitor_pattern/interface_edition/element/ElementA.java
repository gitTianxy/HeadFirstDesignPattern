package z_appendix.visitor_pattern.interface_edition.element;

import z_appendix.visitor_pattern.interface_edition.visitor.Visitor;

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

    /**
     * 附：accept更像一个模板方法,所以似乎定义一个AbstractElement的抽象类能节省代码
     * 但是：其中的specificVisit()方法其实是入参类型不同的两个方法——如果把accept方法移入上一级，
     *      代价是要写入参类型不同的多个accept方法
     * 鉴于此: 不宜把accept不符合模板方法的条件——不宜抽象到上一层
     * 其实仔细想想: 不同元素类在接受visitor的访问时，具体的反应操作自然应该是不同的!
     */
    @Override
    public void accept(Visitor v) {
        v.generalVisit(this); // visit eleA.getStatus()
        v.specificVisit(this); // visit eleA.specificOperationOfEleA()
    }

    @Override
    public void getStatus() {
        System.out.println("This is element A");
    }

}
