package chap06_commandpattern.command;

import chap06_commandpattern.receiver.Light;

/**
 * 
 * @author XinyuTian
 * @date 2016年9月20日
 **/
public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }

}
