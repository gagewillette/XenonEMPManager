package me.GageWillette.XenonEMPManager.Manager;


import me.GageWillette.XenonEMPManager.Utils.Colors;
import me.GageWillette.XenonEMPManager.Utils.Employee;
import me.GageWillette.XenonEMPManager.Utils.SubFonts;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManagerMain
{
    public static JFrame frame = null;
    static Font buttonFont = SubFonts.getFont(SubFonts.subFonts.ALESAND);
    static JButton sales = new JButton("    Sales");
    static JButton menu = new JButton("    menu");
    static JButton employee = new JButton("    employees");
    static ImageIcon salesIcon = new ImageIcon("resources/outline_trending_up_black_24dp.png");
    static JLabel salesLabel = new JLabel(salesIcon);
    private JRadioButton Balls;

    public ManagerMain()
    {
        frame = new JFrame("Manager Portal");
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        frame.setLayout(null);
        frame.setIconImage(me.GageWillette.XenonEMPManager.Utils.getImage.getImage("resources/crown.png"));
        frame.getContentPane().setBackground(Colors.bkg);

        setButtons();

        frame.setVisible(true);
    }

    private void setButtons()
    {
        sales.setFont(buttonFont);
        sales.setBounds(30 , 30 , 150 , 50);
        sales.setBackground(Color.cyan);
        salesLabel.setBounds(35,35, 30,30);


        menu.setFont(buttonFont);
        menu.setBounds(210 , 30 , 150 , 50);
        menu.setBackground(Colors.menu);

        employee.setFont(buttonFont);
        employee.setBounds(390 , 30 , 150 , 50);
        employee.setBackground(Colors.employee);
        employee.addActionListener(new employeeListener());


        frame.add(sales);
        frame.add(salesLabel);
        frame.add(employee);
        frame.add(menu);
    }

    private void actionListeners()
    {
        sales.addActionListener( new salesListener());
    }

    private class salesListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    private class menuListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    private class employeeListener implements ActionListener {
        JFrame employeeList = null;

        @Override
        public void actionPerformed(ActionEvent e) {
            Dimension size = Toolkit.getDefaultToolkit().getScreenSize();

            employeeList = new JFrame("Employee List");
            employeeList.setBounds(size.width / 2 - 350 , size.height / 2 - 350, 700 , 700);

            JList empList = new JList();


            employeeList.setVisible(true);
        }
    }



}
