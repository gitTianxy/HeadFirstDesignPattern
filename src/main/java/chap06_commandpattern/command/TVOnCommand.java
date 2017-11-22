package chap06_commandpattern.command;

import chap06_commandpattern.receiver.TV;

/**
 * @author XinyuTian
 * @date 2016年9月20日
 **/
public class TVOnCommand implements Command {
    private TV tv;

    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void undo() {
        tv.off();
    }

}
