package chap06_commandpattern.command;

/**
 * @author XinyuTian
 * @date 2016年9月20日
 **/
public class MacroCmd implements Command {
    private Command[] cmds;

    public MacroCmd(Command[] cmds) {
        this.cmds = cmds;
    }

    @Override
    public void execute() {
        for (Command cmd : cmds) {
            cmd.execute();
        }
    }

    @Override
    public void undo() {
        for (Command cmd : cmds) {
            cmd.undo();
        }
    }

}
