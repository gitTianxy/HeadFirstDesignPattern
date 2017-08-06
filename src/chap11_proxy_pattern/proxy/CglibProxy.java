package chap11_proxy_pattern.proxy;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

/**
 * CBLIB dynamic proxy
 * NOTE:
 * 不需要对target实例进行引用
 * 
 * @author XinyuTian
 * @date 2017年3月11日
 **/
public class CglibProxy implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy)
            throws Throwable {
        System.out.println("*** CBLIB dynamic proxy ***");
        return methodProxy.invokeSuper(o, args);
    }
}