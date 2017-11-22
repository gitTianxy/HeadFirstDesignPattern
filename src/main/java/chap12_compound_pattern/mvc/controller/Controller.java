package chap12_compound_pattern.mvc.controller;

import chap12_compound_pattern.mvc.model.Model;
import chap12_compound_pattern.mvc.view.View;

/**
 * TODO
 * 
 * @author XinyuTian
 * @date 2017年3月13日
 **/
public class Controller {
    View view;
    Model model;

    public void setView(View view) {
        this.view = view;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public void setFrequency(int freq) {
        model.setFrequency(freq);
    }

    public void on() {
        view.on();
        model.on();
    }

    public void off() {
        view.off();
        model.off();
    }
}
