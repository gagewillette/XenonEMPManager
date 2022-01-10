package me.GageWillette.XenonEMPManager.Manager;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;  //REMOVE ON PRODUCTION BUILD THIS IS SO BAD FOR MEMEMEMEMEMMEORY

import ij.IJ;
import ij.ImagePlus;

public class ManagerSplash extends JFrame{

	JButton exit = new JButton("Exit");

	
	Graphics graphics = getGraphics();
	public ManagerSplash()
	{
		
		addExitButton();
		
		setBackground();
		
		setLayouts();
	}
	
	
	private void setLayouts()
	{
		this.setLayout(null);
		
		this.setAlwaysOnTop(true);
		
		this.setExtendedState(MAXIMIZED_BOTH);
		
		this.setUndecorated(true);
		
		this.setVisible(true);
	}
	
	private void addExitButton()
	{
		exit.setBounds(1850, 1060, 70, 20);
		
		exit.addActionListener(new ExitButtonListener());
		
		exit.setVisible(true);
		
		this.add(exit);
	}
	
	private void setBackground()
	{	
		ImagePlus imp = IJ.openImage("E:\\Users\\gagew\\XenonEMPManager\\src\\main\\java\\logo.png");
		
		Image img = imp.getImage();
		
		JLabel picLabel = new JLabel(new ImageIcon(img));
		
		picLabel.setBounds(5, 5, img.getWidth(picLabel), img.getHeight(picLabel));
		
		picLabel.setVisible(true);
		
		this.add(picLabel);
		
	}
	
	
	private class ExitButtonListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			System.exit(0);
			
		}
	}
	
}
