package spaceinvaders.MenuBar;

import spaceinvaders.SpaceInvadersUI;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.imageio.ImageIO;

public class ImageLoader {
    private static SpaceInvadersUI gameInstance;
    
    public static void setGameInstance(SpaceInvadersUI game) {
        gameInstance = game;
    }
}
