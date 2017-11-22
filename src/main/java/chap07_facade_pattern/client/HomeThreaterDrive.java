package chap07_facade_pattern.client;

import chap07_facade_pattern.facade.HomeTheaterFacade;

/**
 * TODO
 * @author XinyuTian
 * @date 2017年3月11日
**/
public class HomeThreaterDrive {
    public static void main(String[] args) {
        HomeTheaterFacade facade = new HomeTheaterFacade();
        System.out.println("**** START watch movie");
        facade.watchMovie();
        System.out.println("**** STOP watch movie");
        facade.endMovie();
        System.out.println("**** START listen music");
        facade.listenMusic();
        System.out.println("**** STOP listen music");
        facade.endMusic();
    }
}
