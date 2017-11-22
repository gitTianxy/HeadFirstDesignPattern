package chap06_commandpattern.command;

import chap06_commandpattern.receiver.Light;

/**
 * 
 * @author XinyuTian
 * @date 2016年9月20日
 **/
public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }

}
