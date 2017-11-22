package chap06_commandpattern.command;

import chap06_commandpattern.receiver.TV;

/**
 * @author XinyuTian
 * @date 2016年9月20日
 **/
public class TVOffCommand implements Command {
    private TV tv;

    public TVOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();
    }

}
