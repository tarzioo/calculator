package com.companydesktopjava.swing.jframe;

import java.awt.FlowLayout;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Calculator");
        JPanel panel = new JPanel();

        panel.setLayout(new FlowLayout());

        JLabel label = new JLabel("cal buttons");

        JButton button = new JButton();

        button.setText("1");

        JButton button2 = new JButton();

        button2.setText("2");

        JButton button3 = new JButton();

        button3.setText("3");

        panel.add(label);

        panel.add(button);
        panel.add(button2);
        panel.add(button3);

        frame.add(panel);

        frame.setSize(600, 400);

        frame.setLocationRelativeTo(null);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);


    }
}
