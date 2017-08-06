package z_appendix.visitor_pattern.common_pubmethod;

public class ElementB implements Element{
    
    @Override
    public void commonMethod() {
        System.out.println("common method of " + this.getClass().getSimpleName());
    }

}
