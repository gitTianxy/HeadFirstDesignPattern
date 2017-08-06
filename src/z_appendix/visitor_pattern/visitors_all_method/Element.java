package z_appendix.visitor_pattern.visitors_all_method;

public interface Element {
    void commonMethod();
    void accept(Visitor v);
}
