package z_appendix.visitor_pattern.final_compromise_edition.client;

import java.util.List;

import z_appendix.visitor_pattern.final_compromise_edition.element.Visitable;
import z_appendix.visitor_pattern.final_compromise_edition.elementstructure.ElementStructure;
import z_appendix.visitor_pattern.final_compromise_edition.visitor.AbstractVisitor;
import z_appendix.visitor_pattern.final_compromise_edition.visitor.ConcreteVisitor;

/**
 * TODO
 * @author XinyuTian
 * @date 2017年3月13日
**/
public class Client {
    public static void main(String[] args) {
        List<Visitable> elements = ElementStructure.getEleList();
        AbstractVisitor v = new ConcreteVisitor();
        for (Visitable e : elements) {
            e.accept(v);
        }
    }
}
