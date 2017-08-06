package z_appendix.interpreter_pattern;

public class MinNode extends SymbolNode {
    public MinNode(Node left, Node right) {
        super(left, right);
    }

    public int interpret() {
        return super.left.interpret() - super.right.interpret();
    }
}
