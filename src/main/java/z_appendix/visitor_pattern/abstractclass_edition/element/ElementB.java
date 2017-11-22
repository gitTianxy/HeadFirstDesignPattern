package z_appendix.visitor_pattern.abstractclass_edition.element;
/**
 * TODO
 * @author XinyuTian
 * @date 2017年3月14日
**/
public class ElementB extends AbstractElement {

    public void specificOperationOfEleB() {
        System.out.println("specific operation of element B");
    }

    @Override
    public void getStatus() {
        System.out.println("This is element B");
    }

}
