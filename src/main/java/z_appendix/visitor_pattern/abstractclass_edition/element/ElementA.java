package z_appendix.visitor_pattern.abstractclass_edition.element;
/**
 * TODO
 * @author XinyuTian
 * @date 2017年3月14日
**/
public class ElementA extends AbstractElement {

    public void specificOperationOfEleA() {
        System.out.println("specific operation of element A");
    }

    @Override
    public void getStatus() {
        System.out.println("This is element A");
    }

}
