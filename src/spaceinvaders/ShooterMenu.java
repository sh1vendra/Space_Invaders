package spaceinvaders;

import javax.swing.*;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class ShooterMenu {
    private final SpaceInvadersUI game; 

    public ShooterMenu(SpaceInvadersUI game) {
        this.game = game;
    }

    public JMenu createShooterMenu() {
        JMenu shooterMenu = new JMenu("Shooter Image");

        JMenuItem img1 = new JMenuItem("Shooter 1");
        JMenuItem img2 = new JMenuItem("Shooter 2");
        JMenuItem img3 = new JMenuItem("Shooter 3");
        JMenuItem customImg = new JMenuItem("Custom Image");

        img1.addActionListener(e -> setShooterImage("./resources/ShooterImages/shooter1.png"));
        img2.addActionListener(e -> setShooterImage("./resources/ShooterImages/shooter2.png"));
        img3.addActionListener(e -> setShooterImage("./resources/ShooterImages/shooter3.png"));
        customImg.addActionListener(e -> setCustomShooterImage());

        shooterMenu.add(img1);
        shooterMenu.add(img2);
        shooterMenu.add(img3);
        shooterMenu.add(customImg);

        return shooterMenu;
    }

    private void setShooterImage(String imagePath) {
        System.out.println("Shooter image set to: " + imagePath);
        game.imageSelection.setGameImages(imagePath, game.imageSelection.getInvaderImage().toString(), game.imageSelection.getBulletImage().toString());
    }

    private void setCustomShooterImage() {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try {
                URL imageUrl = file.toURI().toURL();
                setShooterImage(imageUrl.toString());
            } catch (MalformedURLException e) {
                JOptionPane.showMessageDialog(null, "Invalid image file!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
