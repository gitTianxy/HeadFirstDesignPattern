package chap08_tplmethodpattern.abstractcls;

/**
 * template-method: makeCoffee();
 * --its implementation is fulfilled in concrete-class
 * 
 * @author XinyuTian
 * @date 2016年9月26日
 **/
public abstract class Coffee {
    private Condiment condiment;
    private Decorator decorator;

    public void makeCoffee(Condiment condiment, Decorator decorator) {
        prepare(condiment, decorator);
        if (needCook()) {
            cook();
        }
        addDecorator();
        cup();
    }

    public void prepare(Condiment condiment, Decorator decorator) {
        this.condiment = condiment;
        this.decorator = decorator;
    }

    public abstract void cook();

    public abstract void addDecorator();

    void cup() {
        System.out.println("pour " + this.getClass().getSimpleName() + " into cup");
    }

    /**
     * hook
     * @return
     */
    public abstract boolean needCook();

    public class Condiment {
        private final String name = "condiment";
        public String getName() {
            return name;
        }
    }

    public abstract class Decorator {
        private String name;
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
    }

}
