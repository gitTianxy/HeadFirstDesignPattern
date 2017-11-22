package chap02_observerpattern.api.subject;

import java.util.Observable;

/**
 * 被观察对象
 * -- 当状态发生变化时，通过'setChanged()+notifyObservers()'方法通知观察者(实现了Observer接口)
 * 
 * @author XinyuTian
 * @date 2016年9月25日
 **/
public class WeatherData extends Observable {
    private float temperature;
    private float pressure;

    public WeatherData(float temperature, float pressure) {
        super();
        this.temperature = temperature;
        this.pressure = pressure;
    }

    public void setWeatherData(float temperature, float pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
        setChanged();
        notifyObservers();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

}
