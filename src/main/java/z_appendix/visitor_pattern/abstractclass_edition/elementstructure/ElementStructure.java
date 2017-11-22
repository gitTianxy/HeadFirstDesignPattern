package z_appendix.visitor_pattern.abstractclass_edition.elementstructure;

import java.util.ArrayList;
import java.util.List;

import z_appendix.visitor_pattern.abstractclass_edition.element.AbstractElement;
import z_appendix.visitor_pattern.abstractclass_edition.element.ElementA;
import z_appendix.visitor_pattern.abstractclass_edition.element.ElementB;

/**
 * 由元素构成的集合
 * 
 * @author XinyuTian
 * @date 2017年3月13日
 **/
public class ElementStructure {
    public static List<AbstractElement> getEleList() {
        List<AbstractElement> list = new ArrayList<AbstractElement>();
        list.add(new ElementA());
        list.add(new ElementB());
        return list;
    }
}
