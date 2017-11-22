package chap11_proxy_pattern.proxy;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * CBLIB dynamic proxy
 * NOTE:
 * 不需要对target实例进行引用
 * <p>
 * CGLib全称是Code Generation Library(https://github.com/cglib)
 * ，是一个第三方开源的代码生成包，功能很强大，性能很优越，许多开源框架如Spring、Hibernate、EasyMock都使用了这个包来实现动态代理。
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