package z_appendix.visitor_pattern.visitors_all_method;

public class VisitorImpl implements Visitor {

    @Override
    public void visit(ElementA e) {
        e.commonMethod();
        e.method();
    }

    @Override
    public void visit(ElementB e) {
        e.commonMethod();
        e.method();
    }

}
