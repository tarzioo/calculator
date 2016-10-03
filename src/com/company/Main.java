package com.companydesktopjava.swing.jframe;

import java.awt.FlowLayout;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {


        JFrame frame1 = new JFrame("Calculator");
        frame1.setBounds(300,200,300,330);

        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setLayout(null);

        final JTextField display = new JTextField();
        display.setBounds(10,40,210,50);
        frame1.add(display);
        display.setFont(new java.awt.Font("Lucida Grande", 0, 19));
        display.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        display.setText("0");
        display.disable();

        JButton clear = new JButton ("Clear");
        clear.setBounds(220,40,70,50);
        frame1.add(clear);

        JButton seven = new JButton ("7");
        seven.setBounds(10,100,70,50);
        frame1.add(seven);

        JButton eight = new JButton ("8");
        eight.setBounds(80,100,70,50);
        frame1.add(eight);

        JButton nine = new JButton ("9");
        nine.setBounds(150,100,70,50);
        frame1.add(nine);

        JButton plus = new JButton ("+");
        plus.setBounds(220,100,70,50);
        frame1.add(plus);

        JButton four = new JButton ("4");
        four.setBounds(10,150,70,50);
        frame1.add(four);

        JButton five = new JButton ("5");
        five.setBounds(80,150,70,50);
        frame1.add(five);

        JButton six = new JButton ("6");
        six.setBounds(150,150,70,50);
        frame1.add(six);

        JButton sub = new JButton ("-");
        sub.setBounds(220,150,70,50);
        frame1.add(sub);

        JButton one = new JButton ("1");
        one.setBounds(10,200,70,50);
        frame1.add(one);

        JButton two = new JButton ("2");
        two.setBounds(80,200,70,50);
        frame1.add(two);

        JButton three = new JButton ("3");
        three.setBounds(150,200,70,50);
        frame1.add(three);

        JButton mult = new JButton ("*");
        mult.setBounds(220,200,70,50);
        frame1.add(mult);

        JButton zero = new JButton ("0");
        zero.setBounds(10,250,70,50);
        frame1.add(zero);

        JButton decimal = new JButton (".");
        decimal.setBounds(80,250,70,50);
        frame1.add(decimal);


        JButton equals = new JButton ("=");
        equals.setBounds(150,250,70,50);
        frame1.add(equals);

        JButton div = new JButton ("/");
        div.setBounds(220,250,70,50);
        frame1.add(div);

        frame1.setVisible(true);


    }
}
