package me.GageWillette.XenonEMPManager.Manager;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.Arrays;

public class ManagerMain
{
    public static Color gray = new Color(211,211,211);


    static JLabel userTxt = new JLabel("Username");
    static JLabel passTxt = new JLabel("Password");
    static JTextField username = new JTextField();
    static JPasswordField pass = new JPasswordField();

    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Manager");
                frame.setLayout(null);
                frame.setResizable(false);
                frame.getContentPane().setBackground(gray);
                frame.setExtendedState(Frame.MAXIMIZED_BOTH);
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

                userTxt.setBounds(200 , 200 , 200 , 50);
                userTxt.setFont(font);

                passTxt.setBounds(200 , 300, 200 , 50);
                passTxt.setFont(font);

                username.setBounds(200 , 250 , 200 , 50);
                pass.setBounds(200 , 350 , 200 , 50);

                username.set


                frame.add(pass);
                frame.add(passTxt);
                frame.add(username);
                frame.add(userTxt);
                frame.setVisible(true);
            }
        });
    }








}
