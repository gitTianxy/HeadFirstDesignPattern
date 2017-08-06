package z_appendix.visitor_pattern.all_method;

public class VisitorLi implements Visitor {

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
