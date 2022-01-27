package me.GageWillette.XenonEMPManager.Manager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;

public class LoginListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        String username = ManagerMain.username.getText();
        String password = String.valueOf(ManagerMain.pass.getPassword());

        if (username.equals("gagewillette") && password.equals("manager"))
        {
            ManagerMain.LOGGER.log(Level.INFO , "Correct Password!");
            System.exit(0);
        }

        ManagerMain.LOGGER.log(Level.SEVERE, "Incorrect Username or Password");
        System.exit(1000);

    }
}
