package z_appendix.visitor_pattern.abstractclass_edition.visitor;

import z_appendix.visitor_pattern.abstractclass_edition.element.ElementA;
import z_appendix.visitor_pattern.abstractclass_edition.element.ElementB;

/**
 * TODO
 * @author XinyuTian
 * @date 2017年3月14日
**/
public class ConcreteVisitor extends AbstractVisitor {

    @Override
    public void specificVisit(ElementA eleA) {
        eleA.specificOperationOfEleA();
    }

    @Override
    public void specificVisit(ElementB eleB) {
        eleB.specificOperationOfEleB();
    }

}
