package z_appendix.visitor_pattern.abstractclass_edition.visitor;

import z_appendix.visitor_pattern.abstractclass_edition.element.AbstractElement;
import z_appendix.visitor_pattern.abstractclass_edition.element.ElementA;
import z_appendix.visitor_pattern.abstractclass_edition.element.ElementB;

/**
 * TODO
 * @author XinyuTian
 * @date 2017年3月14日
**/
public abstract class AbstractVisitor {
    public void generalVisit(AbstractElement ele) {
        ele.getStatus();
    }
    public abstract void specificVisit(ElementA eleA);
    public abstract void specificVisit(ElementB eleB);
}
