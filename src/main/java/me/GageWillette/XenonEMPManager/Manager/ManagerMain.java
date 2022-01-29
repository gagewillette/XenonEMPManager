package me.GageWillette.XenonEMPManager.Manager;

import javax.swing.*;
import java.awt.*;

public class ManagerMain
{
    public static JFrame frame = null;



    public ManagerMain()
    {
        frame = new JFrame("Manager Portal");
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);

        frame.setVisible(true);
    }
}
