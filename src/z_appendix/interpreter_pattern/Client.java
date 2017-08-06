package z_appendix.interpreter_pattern;

public class Client {
    public static void main(String args[]){
        String statement = "1+ 10*23 -6/3+5%2"; //=230
        Calculator calculator = new Calculator();
        calculator.build(statement);
        System.out.println(String.format("%s = %s", statement, calculator.compute()));
    }
}
