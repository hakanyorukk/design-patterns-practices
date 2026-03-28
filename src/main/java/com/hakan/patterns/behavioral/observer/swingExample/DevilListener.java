package com.hakan.patterns.behavioral.observer.swingExample;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DevilListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent event) {
        System.out.println("Come on, do it!");
    }
}
