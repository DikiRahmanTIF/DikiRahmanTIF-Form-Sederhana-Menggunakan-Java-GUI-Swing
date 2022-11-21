package com.diki.javalanjut.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormLoginSederhana {
    private JTextField textUsername;
    private JTextField textPassword;
    private JButton loginButton;
    private JPanel rootPanel;
    private JLabel labelHasil;
    private JTextField textPin;

    public FormLoginSederhana() {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Mengambil data dari textUsername
                String username=textUsername.getText();
                //Mengambil data dari textPassword
                String password=textPassword.getText();
                //Mengambil pin dari textPin
                String pin=textPin.getText();
                //Diproses
                User user=new User();
                user.setUsername(username);
                user.setPassword(password);
                user.setPin(Integer.parseInt(pin));
                //Tampilkan Output ke Form
                labelHasil.setText(user.toString());
            }
        });
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }
}
