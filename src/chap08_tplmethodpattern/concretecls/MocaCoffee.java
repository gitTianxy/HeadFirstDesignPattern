package chap08_tplmethodpattern.concretecls;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import chap08_tplmethodpattern.abstractcls.Coffee;
import chap08_tplmethodpattern.abstractcls.Coffee.Condiment;
import chap08_tplmethodpattern.abstractcls.Coffee.Decorator;

/**
 * TODO
 * @author XinyuTian
 * @date 2016年9月26日
**/
public class MocaCoffee extends Coffee{
    private final Decorator decorator = new Moca();
    private Condiment condiment = new Condiment();
    public void cook(){
        System.out.println("cook " + this.getClass().getSimpleName());
    }
    public void addDecorator(){
        System.out.println("add " + decorator.getClass().getSimpleName() + "to " + condiment.getName());
    }
    @Override
    public boolean needCook() {
        System.out.println("Would you want cook your coffee? y/n");
        String answer = null;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = input.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (answer==null || answer.toLowerCase().startsWith("n")) {
            return false;
        } else {
            return true;
        }
    }
    public class Moca extends Decorator {
        private final String name = "Moca";
    }
}
