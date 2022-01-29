package me.GageWillette.XenonEMPManager.Utils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class getImage
{
    public Image getImage(String path)
    {
        Image img = null;
        try {
            img = ImageIO.read(new File(path));
        } catch (Exception e) {e.printStackTrace();}

        return img;
    }

}
