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

    // File chooser for selecting custom images
    private static void selectCustomImage(String type) {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try {
                URL imageUrl = file.toURI().toURL();
                if (type.equals("shooter")) {
                    setShooterImage(imageUrl.toString());
                } else if (type.equals("invader")) {
                    setInvaderImage(imageUrl.toString());
                } else if (type.equals("bullet")) {
                    setBulletType(imageUrl.toString());
                }
            } catch (MalformedURLException e) {
                JOptionPane.showMessageDialog(null, "Invalid image file!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
