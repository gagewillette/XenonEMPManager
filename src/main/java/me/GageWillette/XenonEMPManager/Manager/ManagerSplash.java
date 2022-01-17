package me.GageWillette.XenonEMPManager.Manager;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import javax.imageio.ImageIO;
import javax.swing.*;  //REMOVE ON PRODUCTION BUILD THIS IS SO BAD FOR MEMEMEMEMEMMEORY

import ij.IJ;
import ij.ImagePlus;
import me.GageWillette.XenonEMPManager.Utils.ImagePanel;
import me.GageWillette.XenonEMPManager.Utils.SQL;

public class ManagerSplash extends JFrame {

	JButton exit = new JButton("Exit");

	private Connection con = this.getCon();

//	Graphics graphics = getGraphics();
	public ManagerSplash() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		this.getLogins();

		this.setBackground(Color.BLACK);

		addExitButton();

		setLayouts();


	}

	private void setLayouts() {
		this.setLayout(null);

		this.setAlwaysOnTop(true);

		this.setExtendedState(MAXIMIZED_BOTH);

		this.setUndecorated(true);

		this.setVisible(true);
	}

	private void addExitButton() {
		exit.setBounds(1850, 1060, 70, 20);

		exit.addActionListener(new ExitButtonListener());

		exit.setVisible(true);

		this.add(exit);
	}

	private class ExitButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			System.exit(0);

		}
	}

	private static Connection getCon() {
		Connection temp = null;

		try {
			temp = SQL.getConnection("admin", "admin", "10.0.0.39", "5353");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return temp;
	}

	private void setBackground() throws IOException {
		BufferedImage img = ImageIO.read(new File("src/main/java/logo.png"));
		this.setContentPane(new ImagePanel(img));
	}


	private HashMap getLogins()
	{
		HashMap<Integer, String> logins = new HashMap<Integer, String>();

		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM xenon.logins");

			while (rs.next())
			{
				System.out.println(rs.getInt(1) + " " + rs.getInt(2) + " " + rs.getString(3));

				logins.put(rs.getInt(2) , rs.getString(3));
			}

		} catch (Exception e)
		{
			e.printStackTrace();
			System.exit(1);
		}
		return logins;
	}
}
