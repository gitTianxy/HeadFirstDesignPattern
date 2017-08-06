package chap11_proxy_pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * used for dynamic_proxy
 * a general method
 * 
 * @author XinyuTian
 * @date 2017年3月11日
 **/
public class DynamicProxyHandler implements InvocationHandler {
    Object target;

    public DynamicProxyHandler(Object target) {
        super();
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("*** JDK dynamic proxy ***");
        return method.invoke( target, args);
    }
    
    public Object getProxy() {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();
        return Proxy.newProxyInstance(loader, interfaces, this);
    }

}
