package z_appendix.visitor_pattern.final_compromise_edition.element;

import z_appendix.visitor_pattern.final_compromise_edition.visitor.AbstractVisitor;

/**
 * TODO
 * @author XinyuTian
 * @date 2017年3月13日
**/
public interface Visitable {
    void getStatus();
    void accept(AbstractVisitor v);
}
