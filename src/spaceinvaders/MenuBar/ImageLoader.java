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

    public static void setShooterImage(String imagePath) {
        if (gameInstance != null) {
            gameInstance.imageSelection.setGameImages(imagePath, gameInstance.imageSelection.getInvaderImage().toString(), gameInstance.imageSelection.getBulletImage().toString());
        }
    }

    // Method to update invader image
    public static void setInvaderImage(String imagePath) {
        if (gameInstance != null) {
            gameInstance.imageSelection.setGameImages(gameInstance.imageSelection.getShooterImage().toString(), imagePath, gameInstance.imageSelection.getBulletImage().toString());
        }
    }

    // Method to update bullet type
    public static void setBulletType(String bulletType) {
        if (gameInstance != null) {
            gameInstance.imageSelection.setGameImages(gameInstance.imageSelection.getShooterImage().toString(), gameInstance.imageSelection.getInvaderImage().toString(), bulletType);
        }
    }

    // Method to select a custom shooter image
    public static void setCustomShooterImage() {
        selectCustomImage("shooter");
    }

    // Method to select a custom invader image
    public static void setCustomInvaderImage() {
        selectCustomImage("invader");
    }

    // Method to select a custom bullet image
    public static void setCustomBulletImage() {
        selectCustomImage("bullet");
    }

    
}
