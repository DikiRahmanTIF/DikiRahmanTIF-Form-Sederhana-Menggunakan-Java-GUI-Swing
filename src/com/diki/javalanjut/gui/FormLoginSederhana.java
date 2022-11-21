package com.diki.javalanjut.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormLoginSederhana {
    private JTextField textUsername;
    private JTextField textPassword;
    private JButton loginButton;
    private JPanel rootPanel;

    public FormLoginSederhana() {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("ini adalah login");
            }
        });
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }
}
