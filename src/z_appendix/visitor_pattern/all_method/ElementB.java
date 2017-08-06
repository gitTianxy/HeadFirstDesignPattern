package z_appendix.visitor_pattern.all_method;

public class ElementB implements Element {
    private void priMethod() {
        System.out.println("private method of " + this.getClass().getSimpleName());
    }

    public void method() {
        System.out.println("public method of " + this.getClass().getSimpleName());
    }

    @Override
    public void commonMethod() {
        System.out.println("common public method of " + this.getClass().getSimpleName());
    }

    @Override
    public void accept(VisitorZhang v) {
        v.visit(this);
        this.priMethod();
    }

    @Override
    public void accept(VisitorLi v) {
        v.visit(this);
        this.priMethod();
    }

}
