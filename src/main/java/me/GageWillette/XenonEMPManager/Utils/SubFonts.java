package me.GageWillette.XenonEMPManager.Utils;

import java.awt.*;
import java.io.File;

public class SubFonts
{
    public static enum subFonts {
        ROBOTO, OPENSANS
    }


    public static Font getFont(subFonts font)
    {
        Font temp = null;

        switch (font){
            case ROBOTO:
                try {
                    temp = Font.createFont(Font.TRUETYPE_FONT, new File("fonts/Roboto-Light.ttf"));
                } catch(Exception e) {e.printStackTrace();}
                break;

            case OPENSANS:
                try {
                    temp = Font.createFont(Font.TRUETYPE_FONT, new File("fonts/OpenSans-Medium.ttf"));
                } catch (Exception e) {e.printStackTrace();}
                break;
        }

        return temp;
    }

}
