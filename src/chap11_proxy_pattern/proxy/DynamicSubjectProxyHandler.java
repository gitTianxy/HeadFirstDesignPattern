package chap11_proxy_pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import chap11_proxy_pattern.subject.Subject;

/**
 * used for dynamic_proxy
 * handler specific for 'Subject'
 * 
 * @author XinyuTian
 * @date 2017年3月11日
 **/
public class DynamicSubjectProxyHandler implements InvocationHandler {
    Subject target;

    public DynamicSubjectProxyHandler(Subject subject) {
        super();
        this.target = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("*** JDK dynamic proxy ***");
        return method.invoke( target, args);
    }
    
    public Subject getProxy() {
        ClassLoader loader = Subject.class.getClassLoader();
//        ClassLoader loader = Thread.currentThread().getContextClassLoader(); // 更通用的方法
        Class<?>[] interfaces = {Subject.class};
//        Class<?>[] interfaces = target.getClass().getInterfaces(); // 更通用的方法
        return (Subject) Proxy.newProxyInstance(loader, interfaces, this);
    }

}
