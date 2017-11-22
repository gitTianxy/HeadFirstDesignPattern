package chap11_proxy_pattern.proxy;

import chap11_proxy_pattern.subject.Subject;

/**
 * 静态代理:
 * 创建一个代理类实现目标类
 * 
 * @author XinyuTian
 * @date 2017年3月11日
 **/
public class SubjectStaticProxy implements Subject {
    private Subject subject;

    public SubjectStaticProxy(Subject subject) {
        this.subject = subject;
    }

    public void request() {
        System.out.println("*** static proxy ***");
        subject.request();
    }
}
