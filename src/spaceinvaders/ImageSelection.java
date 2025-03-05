package spaceinvaders;

import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import javax.imageio.ImageIO;

public class ImageSelection {
    private Image shooterImage;
    private Image invaderImage;
    private static final String DEFAULT_SHOOTER_PATH = "/resources/default/ShooterDefault.png";
    private static final String DEFAULT_INVADER_PATH = "/resources/default/InvaderDefault.png";

    public Image getShooterImage() {
        return shooterImage;
    }

    public Image getInvaderImage() {
        return invaderImage;
    }

    public void setGameImages() {
        shooterImage = loadImage("shooter", "./resources/ShooterImages/shooter1.png", DEFAULT_SHOOTER_PATH);
        invaderImage = loadImage("invader", "./resources/InvaderImages/invader1.png", DEFAULT_INVADER_PATH);
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
