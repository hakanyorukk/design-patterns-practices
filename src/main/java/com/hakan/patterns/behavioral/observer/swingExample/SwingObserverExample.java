package com.hakan.patterns.behavioral.observer.swingExample;

import javax.swing.*;

public class SwingObserverExample {
    JFrame jFrame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    public void go() {
        JFrame frame = new JFrame();

        JButton button = new JButton("Should I do it?");
        //button.addActionListener(new AngelListener());
        button.addActionListener(event -> System.out.println("Don't do it, you might regret it!"));


        button.addActionListener(new DevilListener());
        button.addActionListener(event -> System.out.println("Come on, do it!"));
    }

}
