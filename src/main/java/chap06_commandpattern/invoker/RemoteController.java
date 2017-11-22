package chap06_commandpattern.invoker;

import chap06_commandpattern.command.Command;
import chap06_commandpattern.command.NoCommand;

/**
 * @author XinyuTian
 * @date 2016年9月20日
 **/
public class RemoteController {
    private final int btnNum = 7;
    Command[] onCmds;
    Command[] offCmds;
    Command undoCmd;

    public RemoteController() {
        Command noCmd = new NoCommand();
        onCmds = new Command[btnNum];
        for (Command onCmd : onCmds) {
            onCmd = noCmd;
        }
        offCmds = new Command[btnNum];
        for (Command offCmd : offCmds) {
            offCmd = noCmd;
        }
        undoCmd = noCmd;
    }

    public void setCommand(int slot, Command onCmd, Command offCmd) {
        onCmds[slot] = onCmd;
        offCmds[slot] = offCmd;
    }
    
    public void pressOnBtn (int slot) {
        onCmds[slot].execute();
        undoCmd = onCmds[slot];
    }
    
    public void pressOffBtn (int slot) {
        offCmds[slot].execute();
        undoCmd = offCmds[slot];
    }
    
    public void pressUndoBtn () {
        undoCmd.undo();
    }
}
