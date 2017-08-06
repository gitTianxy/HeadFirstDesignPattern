package z_appendix.visitor_pattern.all_method;

public interface Element {
    void commonMethod();
    void accept(VisitorZhang v);
    void accept(VisitorLi v);
}
