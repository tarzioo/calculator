package com.companydesktopjava.swing.jframe;

import java.awt.FlowLayout;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;

import static java.awt.Color.*;
import static java.awt.Color.BLUE;
import static java.awt.Color.LIGHT_GRAY;
import static java.awt.Color.red;
import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

class Main {

    public static void main(String[] args) {

        new Operation().calc();
    }
}

class Operation {
    String oper = "";
    String pre = "";


    public void calc()
    {


        JFrame frame1 = new JFrame("Calculator");
        frame1.setBounds(300,200,300,330);
        frame1.getContentPane().setBackground(Color.decode("#0C62CF"));

        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setLayout(null);

        final JTextField display = new JTextField();
        display.setBounds(10,40,210,50);
        display.setForeground(Color.red);
        frame1.add(display);
        display.setFont(new java.awt.Font("Lucida Grande", 0, 19));
        display.setDisabledTextColor(Color.decode("#4DB7BE"));
        display.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        display.setText("0");
        display.disable();
        display.setBackground(Color.decode("#121E29"));


        JButton clear = new JButton ("Clear");
        clear.setBounds(220,40,70,50);
        clear.setBackground(Color.decode("#EF4949"));
        clear.setBorder(null);
        clear.setContentAreaFilled(true);
        clear.setOpaque(true);
        frame1.add(clear);

        JButton seven = new JButton ("7");
        seven.setBounds(10,100,70,50);
//        seven.setBackground(Color.decode("#859FAC"));
//        seven.setBorder(null);
//        seven.setContentAreaFilled(true);
//        seven.setOpaque(true);
        //seven.setBorder(BorderFactory.createLineBorder(Color.decode("#0C62CF")));
        seven.setRolloverEnabled(true);
        frame1.add(seven);

        JButton eight = new JButton ("8");
        eight.setBounds(80,100,70,50);
//        eight.setBackground(Color.decode("#E859FAC"));
//        eight.setBorder(null);
//        eight.setContentAreaFilled(true);
//        eight.setOpaque(true);
        //eight.setBorder(BorderFactory.createLineBorder(Color.decode("#0C62CF")));
        frame1.add(eight);

        JButton nine = new JButton ("9");
        nine.setBounds(150,100,70,50);
//        nine.setBackground(Color.decode("#E859FAC"));
//        nine.setBorder(null);
//        nine.setContentAreaFilled(true);
//        nine.setOpaque(true);
        //seven.setBorder(BorderFactory.createLineBorder(Color.decode("#0C62CF")));
        frame1.add(nine);

        JButton plus = new JButton ("+");
        plus.setBounds(220,100,70,50);
//        plus.setBackground(Color.decode("#4DB7BE"));
//        plus.setBorder(null);
//        plus.setContentAreaFilled(true);
//        plus.setOpaque(true);
        frame1.add(plus);

        JButton four = new JButton ("4");
        four.setBounds(10,150,70,50);
//        four.setBackground(Color.decode("#E859FAC"));
//        four.setBorder(null);
//        four.setContentAreaFilled(true);
//        four.setOpaque(true);
        frame1.add(four);

        JButton five = new JButton ("5");
        five.setBounds(80,150,70,50);
//        five.setBackground(Color.decode("#E859FAC"));
//        five.setBorder(null);
//        five.setContentAreaFilled(true);
//        five.setOpaque(true);
        frame1.add(five);

        JButton six = new JButton ("6");
        six.setBounds(150,150,70,50);
//        six.setBackground(Color.decode("#E859FAC"));
//        six.setBorder(null);
//        six.setContentAreaFilled(true);
//        six.setOpaque(true);
        frame1.add(six);

        JButton sub = new JButton ("-");
        sub.setBounds(220,150,70,50);
//        sub.setBackground(Color.decode("#4DB7BE"));
//        sub.setBorder(null);
//        sub.setContentAreaFilled(true);
//        sub.setOpaque(true);
        frame1.add(sub);

        JButton one = new JButton ("1");
        one.setBounds(10,200,70,50);
//        one.setBackground(Color.decode("#E859FAC"));
//        one.setBorder(null);
//        one.setContentAreaFilled(true);
//        one.setOpaque(true);
        frame1.add(one);

        JButton two = new JButton ("2");
        two.setBounds(80,200,70,50);
//        two.setBackground(Color.decode("#E859FAC"));
//        two.setBorder(null);
//        two.setContentAreaFilled(true);
//        two.setOpaque(true);
        frame1.add(two);

        JButton three = new JButton ("3");
        three.setBounds(150,200,70,50);
//        three.setBackground(Color.decode("#E859FAC"));
//        three.setBorder(null);
//        three.setContentAreaFilled(true);
//        three.setOpaque(true);
        frame1.add(three);

        JButton mult = new JButton ("*");
        mult.setBounds(220,200,70,50);
//        mult.setBackground(Color.decode("#4DB7BE"));
//        mult.setBorder(null);
//        mult.setContentAreaFilled(true);
//        mult.setOpaque(true);
        frame1.add(mult);

        JButton zero = new JButton ("0");
        zero.setBounds(10,250,70,50);
//        zero.setBackground(Color.decode("#E859FAC"));
//        zero.setBorder(null);
//        zero.setContentAreaFilled(true);
//        zero.setOpaque(true);
        frame1.add(zero);

        JButton decimal = new JButton (".");
        decimal.setBounds(80,250,70,50);
//        decimal.setBackground(Color.decode("#E859FAC"));
//        decimal.setBorder(null);
//        decimal.setContentAreaFilled(true);
//        decimal.setOpaque(true);
        frame1.add(decimal);


        JButton total = new JButton ("=");
        total.setBounds(150,250,70,50);
//        equals.setBackground(Color.decode("#EF4949"));
//        equals.setBorder(null);
//        equals.setContentAreaFilled(true);
//        equals.setOpaque(true);
        frame1.add(total);

        JButton div = new JButton ("/");
        div.setBounds(220,250,70,50);
//        div.setBackground(Color.decode("#4DB7BE"));
//        div.setBorder(null);
//        div.setContentAreaFilled(true);
//        div.setOpaque(true);
        frame1.add(div);

        frame1.setVisible(true);

        one.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent ae){
                if(oper.equals("=")){
                    display.setText("1");
                    oper="";
                }
                else if(display.getText().equals("0"))
                    display.setText("1");
                else
                    display.setText(display.getText()+"1");
            }
        });

        two.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent ae){
                if(oper.equals("=")){
                    display.setText("2");
                    oper="";
                }
                else if(display.getText().equals("0"))
                    display.setText("2");
                else
                    display.setText(display.getText()+"2");
            }
        });

        three.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent ae){
                if(oper.equals("=")){
                    display.setText("3");
                    oper="";
                }
                else if(display.getText().equals("0"))
                    display.setText("3");
                else
                    display.setText(display.getText()+"3");
            }
        });

        four.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent ae){
                if(oper.equals("=")){
                    display.setText("4");
                    oper="";
                }
                else if(display.getText().equals("0"))
                    display.setText("4");
                else
                    display.setText(display.getText()+"4");
            }
        });

        five.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent ae){
                if(oper.equals("=")){
                    display.setText("5");
                    oper="";
                }
                else if(display.getText().equals("0"))
                    display.setText("5");
                else
                    display.setText(display.getText()+"5");
            }
        });

        six.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent ae){
                if(oper.equals("=")){
                    display.setText("6");
                    oper="";
                }
                else if(display.getText().equals("0"))
                    display.setText("6");
                else
                    display.setText(display.getText()+"6");
            }
        });

        seven.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent ae){
                if(oper.equals("=")){
                    display.setText("7");
                    oper="";
                }
                else if(display.getText().equals("0"))
                    display.setText("7");
                else
                    display.setText(display.getText()+"7");
            }
        });

        eight.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent ae){
                if(oper.equals("=")){
                    display.setText("8");
                    oper="";
                }
                else if(display.getText().equals("0"))
                    display.setText("8");
                else
                    display.setText(display.getText()+"8");
            }
        });

        nine.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent ae){
                if(oper.equals("=")){
                    display.setText("9");
                    oper="";
                }
                else if(display.getText().equals("0"))
                    display.setText("9");
                else
                    display.setText(display.getText()+"9");
            }
        });

        zero.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent ae){
                if(oper.equals("=")){
                    display.setText("0");
                    oper="";
                }
                else if(display.getText().equals("0"))
                    display.setText("0");
                else
                    display.setText(display.getText()+"0");
            }
        });

        plus.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent ae){
                oper="+";
                pre=display.getText();
                display.setText("");
            }
        });

        sub.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent ae){
                oper="-";
                pre=display.getText();
                display.setText("");
            }
        });

        mult.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent ae){
                oper="*";
                pre=display.getText();
                display.setText("");
            }
        });

        div.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent ae){
                oper="/";
                pre=display.getText();
                display.setText("");
            }
        });

        total.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent ae){
                if(oper.equals("=")){
                    display.setText("0.");
                    oper="";
                }
                else
                    display.setText(display.getText()+".");
            }
        });

        clear.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent ae){
                oper="";  //AC
                pre=""; //AC
                display.setText("0");

            }
        });

        total.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent ae){
                switch(oper){
                    case "":
                        display.setText("0");
                        break;
                    case"+":
                        display.setText((Float.parseFloat(pre)+Float.parseFloat(display.getText()))+"");
                        break;
                    case "-":
                        display.setText((Float.parseFloat(pre)-Float.parseFloat(display.getText()))+"");
                        break;
                    case"*":
                        display.setText((Float.parseFloat(pre)*Float.parseFloat(display.getText()))+"");
                        break;
                    case"/":
                        display.setText((Float.parseFloat(pre)/Float.parseFloat(display.getText()))+"");
                        break;
                    case "=":
                        break;
                }
                oper="=";
            }
        });

    }
}
