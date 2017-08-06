package z_appendix.visitor_pattern.interface_edition.visitor;

import z_appendix.visitor_pattern.interface_edition.element.ElementA;
import z_appendix.visitor_pattern.interface_edition.element.ElementB;
import z_appendix.visitor_pattern.interface_edition.element.Visitable;

/**
 * 有几个具体元素类,就要添加几个访问方法
 * 
 * @author XinyuTian
 * @date 2017年3月13日
 **/
public interface Visitor {
    void generalVisit(Visitable ele);
    void specificVisit(ElementA eleA);
    void specificVisit(ElementB eleB);
}
