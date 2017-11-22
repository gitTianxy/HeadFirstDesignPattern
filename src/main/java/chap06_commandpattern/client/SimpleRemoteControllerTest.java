package chap06_commandpattern.client;

import chap06_commandpattern.command.Command;
import chap06_commandpattern.command.LightOnCommand;
import chap06_commandpattern.invoker.SimpleRemoteController;
import chap06_commandpattern.receiver.Light;

/**
 * TODO
 * @author XinyuTian
 * @date 2016年9月20日
**/
public class SimpleRemoteControllerTest {
    public static void main(String[] args) {
        Light light = new Light();
        Command lightOn = new LightOnCommand(light);
        SimpleRemoteController controller = new SimpleRemoteController();
        controller.setCommand(lightOn);
        controller.pressBtn();
    }
}
