package chap11_proxy_pattern.proxy;

import chap11_proxy_pattern.subject.Subject;

/**
 * TODO
 * 
 * @author XinyuTian
 * @date 2017年3月11日
 **/
public class StaticSubjectProxy implements Subject {
    private Subject subject;

    public StaticSubjectProxy(Subject subject) {
        this.subject = subject;
    }

    public void request() {
        System.out.println("*** static proxy ***");
        subject.request();
    }
}
