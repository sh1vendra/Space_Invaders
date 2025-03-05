package spaceinvaders;

import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import javax.imageio.ImageIO;

public class ImageSelection {
    private Image shooterImage;
    private Image invaderImage;
    private Image bulletImage;

    private static final String DEFAULT_SHOOTER_PATH = "./images/default/ShooterImage.png";
    private static final String DEFAULT_INVADER_PATH = "./images/default/InvaderImage.png";
    private static final String DEFAULT_BULLET_PATH = "./images/default/BulletImage.png";

    public Image getShooterImage() {
        return shooterImage;
    }

    public Image getInvaderImage() {
        return invaderImage;
    }

    public Image getBulletImage() {
        return bulletImage;
    }

    public void setGameImages() {
        shooterImage = loadImage("shooter", DEFAULT_SHOOTER_PATH, DEFAULT_SHOOTER_PATH);
        bulletImage = loadImage("bullet", DEFAULT_BULLET_PATH, DEFAULT_BULLET_PATH);
        invaderImage = loadImage("invader", DEFAULT_INVADER_PATH, DEFAULT_INVADER_PATH);
    }

    public void setShooterImage(String imagePath) {
        shooterImage = loadImage("shooter", imagePath, DEFAULT_SHOOTER_PATH);
        System.out.println("Shooter image updated: " + imagePath);
    }

    public void setInvaderImage(String imagePath) {
        invaderImage = loadImage("invader",imagePath, DEFAULT_INVADER_PATH);
        System.out.println("Invader image updated: " + imagePath);
    }

    public void setBulletImage(String imagePath) {
        bulletImage = loadImage("bullet",imagePath, DEFAULT_BULLET_PATH);
        System.out.println("Bullet image updated: " + imagePath);
    }

    private static Image loadImage(String imageType, String mainResourcePath, String defaultResourcePath) {
        // Try loading the main image
        Image image = loadImageFromResource(mainResourcePath);

        // If the main image is missing, load the default image without showing an error popup
        if (image == null) {
            System.out.println("Warning: " + imageType + " image not found at " + mainResourcePath + ". Loading default.");
            image = loadImageFromResource(defaultResourcePath);
        }

        return image;
    }

    private static Image loadImageFromResource(String resourcePath) {
        URL resourceUrl = ImageSelection.class.getResource(resourcePath);
        if (resourceUrl == null) {
            System.out.println("Error: Resource not found at " + resourcePath);
            return null;
        }

        // Try loading using ClassLoader
        try (InputStream stream = ImageSelection.class.getResourceAsStream(resourcePath)) {
            if (stream == null) {
                System.out.println("Error: Resource stream is null for " + resourcePath);
                return null;
            }
            return ImageIO.read(stream);
        } catch (IOException e) {
            System.out.println("Error: Failed to load image at " + resourcePath + " - " + e.getMessage());
        }

        return null;
    }
}
