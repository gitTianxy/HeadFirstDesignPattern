package z_appendix.chain_of_responsibility_pattern.handler;

/**
 * TODO
 * 
 * @author XinyuTian
 * @date 2017年3月16日
 **/
public abstract class Handler {
    protected Handler handler;

    public abstract boolean approve(double day);

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
