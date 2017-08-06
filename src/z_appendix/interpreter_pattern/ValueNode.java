package z_appendix.interpreter_pattern;

public class ValueNode implements Node {
    private int value;

    public ValueNode(String value) {
        this.value = Integer.valueOf(value);
    }

    public int interpret() {
        return this.value;
    }
}
