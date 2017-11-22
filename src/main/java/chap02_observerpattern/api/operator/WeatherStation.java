package chap02_observerpattern.api.operator;

import java.util.Random;

import chap02_observerpattern.api.observer.GeneralDisp;
import chap02_observerpattern.api.subject.WeatherData;

/**
 * java提供java.util.Observable接口实现'观察对象',java.util.Observer接口实现'观察者'
 * 
 * @author XinyuTian
 * @date 2016年9月25日
 **/
public class WeatherStation {
    private WeatherData data;
    private GeneralDisp disp;
    private Collector collector;

    public void setData(WeatherData data) {
        this.data = data;
    }

    public void setDisp(GeneralDisp disp) {
        this.disp = disp;
    }

    public void setCollector(Collector collector) {
        this.collector = collector;
    }

    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        WeatherData weather0 = new WeatherData(20f, 100f);
        station.setData(weather0);
        station.setDisp(new GeneralDisp(weather0));
        station.setCollector(station.new Collector());
        Thread weatherThr = new Thread(station.collector);
        weatherThr.start();
    }

    class Collector implements Runnable {
        private final Random valFluc = new Random();
        @Override
        public void run() {
            while (true) {
                try {
                    collectDatas();
                    Thread.sleep(5000); //没5秒收集一次数据
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        private synchronized void collectDatas() {
            float temperature = (float) (data.getTemperature() + 5.0 * (valFluc.nextFloat() - 0.5));
            float pressure = (float) (data.getPressure() + 10.0 * (valFluc.nextFloat() - 0.5));
            data.setWeatherData(temperature, pressure); // 促发Observable对象状态变化
        }
    }
}
