package chap12_compound_pattern.mvc.model;

import java.util.ArrayList;

/**
 * TODO
 * 
 * @author XinyuTian
 * @date 2017年3月13日
 **/
public class Model {
    public int frequency;
    boolean on;
    ArrayList<HeartBeatListener> listeners = new ArrayList<>();

    public void addHeartBeatListener(HeartBeatListener listener) {
        listeners.add(listener);
    }

    public void removeHeartBeatListener(HeartBeatListener listener) {
        listeners.remove(listener);
    }

    public void setFrequency(int freq) {
        this.frequency = freq;
    }

    public void on() {
        on = true;
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (on) {
                    for (HeartBeatListener listener : listeners)
                        listener.onHeartBeat();
                    try {
                        Thread.sleep(60000 / frequency);
                    } catch (InterruptedException e) {
                    }
                }

            }
        }).start();
    }

    public void off() {
        on = false;
    }
}
