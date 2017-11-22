package z_appendix.visitor_pattern.final_compromise_edition.visitor;

import z_appendix.visitor_pattern.final_compromise_edition.element.ElementA;
import z_appendix.visitor_pattern.final_compromise_edition.element.ElementB;
import z_appendix.visitor_pattern.final_compromise_edition.element.Visitable;

/**
 * TODO
 * @author XinyuTian
 * @date 2017年3月14日
**/
public abstract class AbstractVisitor {
    public void generalVisit(Visitable ele) {
        ele.getStatus();
    }
    public abstract void specificVisit(ElementA eleA);
    public abstract void specificVisit(ElementB eleB);
}
