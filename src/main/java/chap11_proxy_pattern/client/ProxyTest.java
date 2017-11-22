package chap11_proxy_pattern.client;

import org.springframework.cglib.proxy.Enhancer;

import chap11_proxy_pattern.proxy.CglibProxy;
import chap11_proxy_pattern.proxy.DynamicProxyHandler;
import chap11_proxy_pattern.proxy.SubjectDynamicProxyHandler;
import chap11_proxy_pattern.proxy.SubjectStaticProxy;
import chap11_proxy_pattern.realsubject.RealSubject;
import chap11_proxy_pattern.subject.Subject;

/**
 * TODO
 *
 * @author XinyuTian
 * @date 2017年3月11日
 **/
public class ProxyTest {
    public static void main(String[] args) {
        Subject realSubject = new RealSubject();
        // static proxy
        Subject staticProxy = new SubjectStaticProxy(realSubject);
        staticProxy.request();
        // JDK-based dynamic proxy
        Subject dynamicProxy = new SubjectDynamicProxyHandler(realSubject).getProxy(); //specific method
        dynamicProxy.request();
        Subject dynamicProxy2 = (Subject) new DynamicProxyHandler(realSubject).getProxy(); //genernal method
        dynamicProxy2.request();
        // CGLIB-based dynamic proxy
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(RealSubject.class);
        enhancer.setCallback(new CglibProxy());
        Subject subProxy = (Subject) enhancer.create();
        subProxy.request();
    }
}
