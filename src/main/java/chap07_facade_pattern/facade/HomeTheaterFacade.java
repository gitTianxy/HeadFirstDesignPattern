package chap07_facade_pattern.facade;

import chap07_facade_pattern.subInterfaces.Amplifier;
import chap07_facade_pattern.subInterfaces.CDPlayer;
import chap07_facade_pattern.subInterfaces.DVDPlayer;
import chap07_facade_pattern.subInterfaces.Screen;
import chap07_facade_pattern.subInterfaces.Tuner;

/**
 * facade只给外界(client)提供数量有限的接口/方法
 * 1. watchMovie/endMovie
 * 2. listenMusic/endMusic
 * @author XinyuTian
 * @date 2017年3月11日
**/
public class HomeTheaterFacade {
    public enum Status {
        MOVIE_ON, MUSIC_ON, OFF
    }
    
    Amplifier amp;
    Tuner tuner;
    DVDPlayer dvd;
    CDPlayer cd;
    Screen screen;
    
    Status status;
    
    public HomeTheaterFacade() {
        status = Status.OFF;
        this.amp = new Amplifier();
        this.tuner = new Tuner();
        this.dvd = new DVDPlayer();
        this.cd = new CDPlayer();
        this.screen = new Screen();
    }
    public void watchMovie() {
        if (status.equals(Status.OFF)) {
            amp.on();
            dvd.play();
            tuner.setFrequency();
            screen.on();
            status = Status.MOVIE_ON;
        } else {
            System.out.println("already ON !");
        }
    }
    
    public void endMovie() {
        if (status.equals(Status.MOVIE_ON)) {
            amp.off();
            dvd.stop();
            screen.off();
            status = Status.OFF;
        } else {
            System.out.println("already OFF !");
        }
    }
    
    public void listenMusic() {
        if (status.equals(Status.OFF)) {
            amp.on();
            cd.play();
            tuner.setFrequency();
            status = Status.MUSIC_ON;
        } else {
            System.out.println("already ON !");
        }
    }
    
    public void endMusic() {
        if (status.equals(Status.MUSIC_ON)) {
            amp.off();
            cd.stop();
            status = Status.OFF;
        } else {
            System.out.println("already OFF !");
        }
    }
}
