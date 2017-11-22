package z_appendix.visitor_pattern.abstractclass_edition.client;

import java.util.List;

import z_appendix.visitor_pattern.abstractclass_edition.element.AbstractElement;
import z_appendix.visitor_pattern.abstractclass_edition.element.ElementA;
import z_appendix.visitor_pattern.abstractclass_edition.element.ElementB;
import z_appendix.visitor_pattern.abstractclass_edition.elementstructure.ElementStructure;
import z_appendix.visitor_pattern.abstractclass_edition.visitor.AbstractVisitor;
import z_appendix.visitor_pattern.abstractclass_edition.visitor.ConcreteVisitor;

/**
 * TODO
 * @author XinyuTian
 * @date 2017年3月13日
**/
public class Client {
    public static void main(String[] args) {
        List<AbstractElement> elements = ElementStructure.getEleList();
        AbstractVisitor v = new ConcreteVisitor();
        for (AbstractElement e : elements) {
            if (e instanceof ElementA) {
                e.accept(v, (ElementA) e);
            } else if (e instanceof ElementB) {
                e.accept(v, (ElementB) e);
            }
        }
    }
}
