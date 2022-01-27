package me.GageWillette.XenonEMPManager.Manager;

import me.GageWillette.XenonEMPManager.Utils.SubFonts;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Logger;

public class ManagerMain
{
    public final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static Color gray = new Color(211,211,211);


    static JLabel userTxt = new JLabel("Username");
    static JLabel passTxt = new JLabel("Password");
    public static JTextField username = new JTextField();
    public static JPasswordField pass = new JPasswordField();
    static JButton login = new JButton("Login");

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
                login.setBounds(650 , 300 , 200 , 50);
                login.setFont(SubFonts.getFont(SubFonts.subFonts.ROBOTO));

                userTxt.setBounds(200 , 200 , 200 , 50);
                userTxt.setFont(SubFonts.getFont(SubFonts.subFonts.ROBOTO));

                passTxt.setBounds(200 , 300, 200 , 50);
                passTxt.setFont(SubFonts.getFont(SubFonts.subFonts.ROBOTO));

                username.setBounds(200 , 250 , 200 , 50);
                pass.setBounds(200 , 350 , 200 , 50);

                username.setFont(SubFonts.getFont(SubFonts.subFonts.OPENSANS));
                pass.setFont(SubFonts.getFont(SubFonts.subFonts.OPENSANS));

                login.addActionListener(new LoginListener());

                frame.add(login);
                frame.add(pass);
                frame.add(passTxt);
                frame.add(username);
                frame.add(userTxt);
                frame.setVisible(true);
            }
        });
    }
}
