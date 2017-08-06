package z_appendix.visitor_pattern.all_pubmethod;

public class ElementB implements Element {
    public void method() {
        System.out.println("public method of " + this.getClass().getSimpleName());
    }

    @Override
    public void commonMethod() {
        System.out.println("common public method of " + this.getClass().getSimpleName());
    }

}
