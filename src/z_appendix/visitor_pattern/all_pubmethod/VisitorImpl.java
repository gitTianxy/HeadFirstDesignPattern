package z_appendix.visitor_pattern.all_pubmethod;

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
