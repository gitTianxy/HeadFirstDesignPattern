package z_appendix.visitor_pattern.interface_edition.element;

import z_appendix.visitor_pattern.interface_edition.visitor.Visitor;

/**
 * TODO
 * @author XinyuTian
 * @date 2017年3月13日
**/
public interface Visitable {
    void getStatus();
    void accept(Visitor v);
}
