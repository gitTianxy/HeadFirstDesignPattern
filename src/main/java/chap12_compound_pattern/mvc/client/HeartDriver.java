package chap12_compound_pattern.mvc.client;

import chap12_compound_pattern.mvc.controller.Controller;
import chap12_compound_pattern.mvc.model.Model;
import chap12_compound_pattern.mvc.view.View;

/**
 * TODO
 * 
 * @author XinyuTian
 * @date 2017年3月13日
 **/
public class HeartDriver {
    public static void main(String[] args) {
        new HeartDriver();
    }

    public HeartDriver() {
        Controller controller = new Controller();
        Model model = new Model();
        View view = new View();

        view.setController(controller);
        controller.setModel(model);
        controller.setView(view);
        model.addHeartBeatListener(view);

        view.slider.setValue(75);
        model.frequency = 75;
    }

}
