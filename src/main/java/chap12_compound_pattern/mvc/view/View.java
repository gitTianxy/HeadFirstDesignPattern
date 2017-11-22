package chap12_compound_pattern.mvc.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import chap12_compound_pattern.mvc.controller.Controller;
import chap12_compound_pattern.mvc.model.HeartBeatListener;

/**
 * TODO
 * 
 * @author XinyuTian
 * @date 2017年3月13日
 **/
public class View extends JFrame implements HeartBeatListener, ActionListener, ChangeListener {
    Controller controller;
    JButton onButton, offButton;
    public JSlider slider;
    JProgressBar bar;

    public View() {
        JPanel buttonPanel = new JPanel();
        onButton = new JButton("on");
        offButton = new JButton("off");
        onButton.addActionListener(this);
        offButton.addActionListener(this);
        buttonPanel.add(onButton);
        buttonPanel.add(offButton);
        add(buttonPanel, BorderLayout.NORTH);

        bar = new JProgressBar();
        bar.setForeground(Color.RED);
        add(bar, BorderLayout.CENTER);

        slider = new JSlider();
        slider.setMaximum(200);
        slider.setMinimum(1);
        slider.setValue(70);
        slider.addChangeListener(this);
        JPanel sliderPanel = new JPanel();
        sliderPanel.add(new JLabel("频率："));
        sliderPanel.add(slider);
        add(sliderPanel, BorderLayout.SOUTH);

        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("心脏起搏器");
        off();
        setVisible(true);
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void on() {
        offButton.setEnabled(true);
        onButton.setEnabled(false);
    }

    public void off() {
        offButton.setEnabled(false);
        onButton.setEnabled(true);
    }

    @Override
    public void onHeartBeat() {
        try {
            for (int i = 0; i < bar.getMaximum(); i += bar.getMaximum() / 5) {
                bar.setValue(i);
                Thread.sleep(20);
            }
            for (int i = bar.getMaximum(); i >= 0; i -= bar.getMaximum() / 5) {
                bar.setValue(i);
                Thread.sleep(20);
            }
        } catch (InterruptedException e) {
        }
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        int freq = ((JSlider) e.getSource()).getValue();
        controller.setFrequency(freq);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == onButton)
            controller.on();
        else if (e.getSource() == offButton)
            controller.off();
    }
}
