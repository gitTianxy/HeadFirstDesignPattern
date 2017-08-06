package z_appendix.mediator_pattern.self.colleague;

import java.util.UUID;

/**
 * TODO
 * 
 * @author XinyuTian
 * @date 2017年3月17日
 **/
public class Colleague {
    private String id;
    private String name;

    public Colleague(String name) {
        super();
        this.id = UUID.randomUUID().toString();
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void sendMsg(String msg, Colleague to) {
        System.out.println(
                this.getName() + " sends '" + msg + "' to " + to.getName());
    }

    public void receiveMsg(String msg, Colleague from) {
        System.out.println(this.getName() + " receives '" + msg + "' from "
                + from.getName());
    }
}
