package chap11_proxy_pattern.realsubject;

import chap11_proxy_pattern.subject.Subject;

/**
 * TODO
 * @author XinyuTian
 * @date 2017年3月11日
**/
public class RealSubject implements Subject {
    @Override
    public void request(){
        System.out.println("RealSubject response to 'request'");
    }
}
