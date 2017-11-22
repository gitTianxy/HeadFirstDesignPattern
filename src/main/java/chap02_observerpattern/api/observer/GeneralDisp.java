package chap02_observerpattern.api.observer;

import java.util.Observable;
import java.util.Observer;

import chap02_observerpattern.api.subject.WeatherData;

/**
 * 观察者
 * -- 当对象(实现了Observable接口)状态发生变化时,促发update方法
 * 
 * @author XinyuTian
 * @date 2016年9月25日
 **/
public class GeneralDisp implements Observer {
    WeatherData weather;

    public GeneralDisp(WeatherData weather) {
        this.weather = weather;
        weather.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            weather = (WeatherData) obs;
            display();
        }
    }
    
    public void display() {
        System.out.println("temperature: " + this.weather.getTemperature() + " pressure: " + this.weather.getPressure());
    }
}
