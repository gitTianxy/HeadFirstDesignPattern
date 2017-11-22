package z_appendix.visitor_pattern.abstractclass_edition.element;

import z_appendix.visitor_pattern.abstractclass_edition.visitor.AbstractVisitor;
import z_appendix.visitor_pattern.interface_edition.visitor.Visitor;

/**
 * TODO
 * @author XinyuTian
 * @date 2017年3月14日
**/
public abstract class AbstractElement {
    public abstract void getStatus();
    
    public void accept(AbstractVisitor v, ElementA e) {
        v.generalVisit(e);
        v.specificVisit(e);
    }
    
    public void accept(AbstractVisitor v, ElementB e) {
        v.generalVisit(e);
        v.specificVisit(e);
    }
}
