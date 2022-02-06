package me.GageWillette.XenonEMPManager.Manager;


import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.common.base.Stopwatch;
import me.GageWillette.XenonEMPManager.Utils.Colors;
import me.GageWillette.XenonEMPManager.Utils.Employee;
import me.GageWillette.XenonEMPManager.Utils.FireDB;
import me.GageWillette.XenonEMPManager.Utils.SubFonts;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Array;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class ManagerMain
{
    private static Firestore db;
    public static JFrame frame = null;
    static Font buttonFont = SubFonts.getFont(SubFonts.subFonts.ALESAND);
    static JButton sales = new JButton("    Sales");
    static JButton menu = new JButton("    menu");
    static JButton employee = new JButton("    employees");
    static ImageIcon salesIcon = new ImageIcon("resources/outline_trending_up_black_24dp.png");
    static JLabel salesLabel = new JLabel(salesIcon);
    private JRadioButton Balls;
    private ArrayList<Employee> emps = new ArrayList<Employee>();


    public ManagerMain()
    {
        frame = new JFrame("Manager Portal");
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        frame.setLayout(null);
        frame.setIconImage(me.GageWillette.XenonEMPManager.Utils.getImage.getImage("resources/crown.png"));
        frame.getContentPane().setBackground(Colors.bkg);

        try {
            db = FireDB.setupDB();
        } catch (Exception e) {e.printStackTrace();}

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


        try {
            emps = getEmployees();
        } catch (Exception ex) { ex.printStackTrace(); }


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

            for (Employee cur : emps)
            {
                System.out.println(cur.toString());
            }
            employeeList.setVisible(true);
        }
    }


    private ArrayList<Employee> getEmployees() throws ExecutionException, InterruptedException {
        ArrayList<Employee> emps = new ArrayList<Employee>();

        // asynchronously retrieve all users
        ApiFuture<QuerySnapshot> query = db.collection("employees").get();
        // ...
        // query.get() blocks on response
        QuerySnapshot querySnapshot = query.get();
        List<QueryDocumentSnapshot> documents = querySnapshot.getDocuments();
        for (QueryDocumentSnapshot document : documents) {

            Employee cur = new Employee(document.getString("first") , document.getString("last")
                    , document.getString("bday") , document.getLong("ssn"));
            emps.add(cur);
        }

        return emps;
    }
}
