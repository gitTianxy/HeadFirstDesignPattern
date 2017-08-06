package chap06_commandpattern.invoker;

import chap06_commandpattern.command.Command;

/**
 * @author XinyuTian
 * @date 2016年9月20日
 **/
public class SimpleRemoteController {
    private Command slot;

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void pressBtn() {
        slot.execute();
    }
}
