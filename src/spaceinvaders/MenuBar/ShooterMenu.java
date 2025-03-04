import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

package spaceinvaders.MenuBar;
// completed
public class ShooterMenu {
    public static JMenu createShooterMenu() {
        JMenu shooterMenu = new JMenu("Shooter Image");

        JMenuItem img1 = new JMenuItem("Shooter 1");
        JMenuItem img2 = new JMenuItem("Shooter 2");
        JMenuItem img3 = new JMenuItem("Shooter 3");
        JMenuItem customImg = new JMenuItem("Custom Image");

        img1.addActionListener(e -> ImageLoader.setShooterImage("shooter1.png"));
        img2.addActionListener(e -> ImageLoader.setShooterImage("shooter2.png"));
        img3.addActionListener(e -> ImageLoader.setShooterImage("shooter3.png"));
        customImg.addActionListener(e -> ImageLoader.setCustomShooterImage());

        shooterMenu.add(img1);
        shooterMenu.add(img2);
        shooterMenu.add(img3);
        shooterMenu.add(customImg);

        return shooterMenu;
    }


}
