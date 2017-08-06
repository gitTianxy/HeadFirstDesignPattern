package chap11_proxy_pattern.client;

import org.springframework.cglib.proxy.Enhancer;

import chap11_proxy_pattern.proxy.CglibProxy;
import chap11_proxy_pattern.proxy.DynamicProxyHandler;
import chap11_proxy_pattern.proxy.DynamicSubjectProxyHandler;
import chap11_proxy_pattern.proxy.StaticSubjectProxy;
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
        Subject staticProxy = new StaticSubjectProxy(realSubject);
        staticProxy.request();
        // JDK-based dynamic proxy
        Subject dynamicProxy = new DynamicSubjectProxyHandler(realSubject).getProxy(); // specific
                                                                                       // method
        dynamicProxy.request();
        Subject dynamicProxy2 = (Subject) new DynamicProxyHandler(realSubject).getProxy(); // genernal
                                                                                           // method
        dynamicProxy2.request();
        // CGLIB-based dynamic proxy
        CglibProxy cglibProxy = new CglibProxy();  
        Enhancer enhancer = new Enhancer();  
        enhancer.setSuperclass(RealSubject.class);  
        enhancer.setCallback(cglibProxy);  
        Subject cblibProxy = (Subject) enhancer.create();
        cblibProxy.request();
    }
}
