package chap06_commandpattern.client;

import chap06_commandpattern.command.Command;
import chap06_commandpattern.command.LightOffCommand;
import chap06_commandpattern.command.LightOnCommand;
import chap06_commandpattern.command.MacroCmd;
import chap06_commandpattern.command.TVOffCommand;
import chap06_commandpattern.command.TVOnCommand;
import chap06_commandpattern.invoker.RemoteController;
import chap06_commandpattern.receiver.Light;
import chap06_commandpattern.receiver.TV;

/**
 * TWO NOTE:
 * 1. The compose of the system: client, invoker/controller, command, receiver
 * 2. The 'linear' massage-flow of the pattern: 
 *      a. client turn on/off invoker; 
 *      b. invoker send out command; 
 *      c. command controls receiver
 * @author XinyuTian
 * @date 2016年9月20日
 **/
public class RemoteControllerTest {
    private static RemoteController controller;

    private static void loadSet() {
        controller = new RemoteController();
        // button0: light on/off
        Light light = new Light();
        Command lightOnCmd = new LightOnCommand(light);
        Command lightOffCmd = new LightOffCommand(light);
        controller.setCommand(0, lightOnCmd, lightOffCmd);
        // button1: tv on/off
        TV tv = new TV();
        Command tvOnCmd = new TVOnCommand(tv);
        Command tvOffCmd = new TVOffCommand(tv);
        controller.setCommand(1, tvOnCmd, tvOffCmd);
        // button2: macroCmd--light&tv on/off
        Command[] onCmdSet = {lightOnCmd,tvOnCmd};
        Command macroOnCmd = new MacroCmd(onCmdSet);
        Command[] offCmdSet = {lightOffCmd, tvOffCmd};
        Command macroOffCmd = new MacroCmd(offCmdSet);
        controller.setCommand(2, macroOnCmd, macroOffCmd);
    }

    public static void main(String[] args) {
        loadSet();
        System.out.print("pressOnBtn(0): ");
        controller.pressOnBtn(0);
        System.out.print("pressOnBtn(1): ");
        controller.pressOnBtn(1);
        System.out.print("pressOnBtn(2): ");
        controller.pressOffBtn(2);
    }
}
