package z_appendix.visitor_pattern.common_pubmethod;

public class VisitorImpl implements Visitor {

    @Override
    public void visit(Element e) {
        e.commonMethod();
    }

}
