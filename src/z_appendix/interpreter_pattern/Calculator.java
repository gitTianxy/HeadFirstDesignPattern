package z_appendix.interpreter_pattern;

import java.util.Stack;
import java.util.regex.Pattern;

import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

public class Calculator {
    private Node result;

    public void build(String statement) {
        Node left = null, right = null;

        if (statement == null || "".equals(statement.trim())) {
            throw new ValueException("input expression is empty.");
        }
        statement = statement.replace(" ", "");
        String[] statementArr = statement.split("(?<=[-+*/%])|(?=[-+*/%])");

        /** 
         * 1st-round: do multiply/division/mod
         * 
         */
        for (int i = 0; i < statementArr.length; i+=1) {
            if (statementArr[i].equalsIgnoreCase("*")) {
                left = new ValueNode(statementArr[i-1]);
                right = new ValueNode(statementArr[i + 1]);
                statementArr[i-1] = "0";
                if (i - 2 >= 0) {
                    statementArr[i] = statementArr[i-2];
                } else {
                    statementArr[i] = "+";
                }
                statementArr[i+1] = String.valueOf(new MulNode(left, right).interpret());
            } else if (statementArr[i].equalsIgnoreCase("/")) {
                left = new ValueNode(statementArr[i-1]);
                right = new ValueNode(statementArr[i + 1]);
                statementArr[i-1] = "0";
                if (i - 2 >= 0) {
                    statementArr[i] = statementArr[i-2];
                } else {
                    statementArr[i] = "+";
                }
                statementArr[i+1] = String.valueOf(new DivNode(left, right).interpret());
            } else if (statementArr[i].equalsIgnoreCase("%")) {
                left = new ValueNode(statementArr[i-1]);
                right = new ValueNode(statementArr[i + 1]);
                statementArr[i-1] = "0";
                if (i - 2 >= 0) {
                    statementArr[i] = statementArr[i-2];
                } else {
                    statementArr[i] = "+";
                }
                statementArr[i+1] = String.valueOf(new ModNode(left, right).interpret());
            }
        }
        
        // 2nd-round: do add/minus
        Stack<Node> stack = new Stack<>();
        for (int i = 0; i < statementArr.length; i++) {
            if (statementArr[i].equalsIgnoreCase("-")) {
                left = (Node) stack.pop();
                right = new ValueNode(statementArr[++i]);
                stack.push(new MinNode(left, right));
            } else if (statementArr[i].equalsIgnoreCase("+")) {
                left = (Node) stack.pop();
                right = new ValueNode(statementArr[++i]);
                stack.push(new AddNode(left, right));
            } else {
                stack.push(new ValueNode(statementArr[i]));
            }
        }
        this.result = (Node) stack.pop();
    }

    public int compute() {
        return result.interpret();
    }

    static boolean isNum(String input) {
        Pattern numRegex = Pattern.compile("[\\d.]");
        return numRegex.matcher(input).find();
    }

    static boolean isOperator(String input) {
        Pattern operatorRegex = Pattern.compile("[-+*/%]");
        return operatorRegex.matcher(input).find();
    }
}
