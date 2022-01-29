package me.GageWillette.XenonEMPManager.Manager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.logging.Level;

import static me.GageWillette.XenonEMPManager.Manager.ManagerSplash.frame;

public class LoginListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        String username = ManagerSplash.username.getText();
        String password = String.valueOf(ManagerSplash.pass.getPassword());

        if (username.equals("gagewillette") && password.equals("manager"))
        {
            frame.setVisible(false);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            new ManagerMain();
            return;
        }

        ManagerSplash.LOGGER.log(Level.SEVERE, "Incorrect Username or Password");
        System.exit(1000);

    }
}
