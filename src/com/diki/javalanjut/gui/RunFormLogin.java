package com.diki.javalanjut.gui;

import javax.swing.*;

public class RunFormLogin {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame("Penghitung Volume Balok");
        jFrame.setContentPane(new FormLoginSederhana().getRootPanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(480, 480);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
}
