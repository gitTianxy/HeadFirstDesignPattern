package z_appendix.visitor_pattern.interface_edition.client;

import java.util.List;

import z_appendix.visitor_pattern.interface_edition.element.Visitable;
import z_appendix.visitor_pattern.interface_edition.elementstructure.ElementStructure;
import z_appendix.visitor_pattern.interface_edition.visitor.ConcreteVisitor;
import z_appendix.visitor_pattern.interface_edition.visitor.Visitor;

/**
 * TODO
 * @author XinyuTian
 * @date 2017年3月13日
**/
public class Client {
    public static void main(String[] args) {
        List<Visitable> elements = ElementStructure.getEleList();
        Visitor v = new ConcreteVisitor();
        for (Visitable e : elements) {
            e.accept(v);
        }
    }
}
