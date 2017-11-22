package chap06_commandpattern.command;
/**
 * TODO
 * @author XinyuTian
 * @date 2016年9月20日
**/
public interface Command {
    public void execute();
    public void undo();
}
