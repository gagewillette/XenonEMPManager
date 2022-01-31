package me.GageWillette.XenonEMPManager.Manager;


import me.GageWillette.XenonEMPManager.Utils.Colors;
import me.GageWillette.XenonEMPManager.Utils.RoundedBorder;
import me.GageWillette.XenonEMPManager.Utils.SubFonts;
import me.GageWillette.XenonEMPManager.Utils.getImage;

import javax.swing.*;
import java.awt.*;

public class ManagerMain
{
    public static JFrame frame = null;
    Font buttonFont = SubFonts.getFont(SubFonts.subFonts.ALESAND);
    JButton sales = new JButton("    Sales");
    JButton menu = new JButton("    menu");

    JPanel 

    public ManagerMain()
    {
        frame = new JFrame("Manager Portal");
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        frame.setLayout(null);
        frame.setIconImage(me.GageWillette.XenonEMPManager.Utils.getImage.getImage("resources/crown.png"));
        frame.getContentPane().setBackground(Colors.bkg);
        sales.setFont(buttonFont);
        sales.setBounds(30 , 30 , 150 , 50);
        sales.setBackground(Color.cyan);

        menu.setFont(buttonFont);
        menu.setBounds(210 , 30 , 150 , 50);
        menu.setBackground(Colors.menu);

        frame.add(menu);
        frame.add(sales);
        frame.setVisible(true);
    }
}
