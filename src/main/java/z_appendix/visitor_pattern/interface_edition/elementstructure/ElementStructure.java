package z_appendix.visitor_pattern.interface_edition.elementstructure;

import java.util.ArrayList;
import java.util.List;

import z_appendix.visitor_pattern.interface_edition.element.ElementA;
import z_appendix.visitor_pattern.interface_edition.element.ElementB;
import z_appendix.visitor_pattern.interface_edition.element.Visitable;

/**
 * 由元素构成的集合
 * 
 * @author XinyuTian
 * @date 2017年3月13日
 **/
public class ElementStructure {
    public static List<Visitable> getEleList() {
        List<Visitable> list = new ArrayList<Visitable>();
        list.add(new ElementA());
        list.add(new ElementB());
        return list;
    }
}
