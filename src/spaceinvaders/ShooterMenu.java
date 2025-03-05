package spaceinvaders;

import javax.swing.*;


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


        img1.addActionListener(e -> game.imageSelection.setShooterImage("./images/shooter1.png"));
        img2.addActionListener(e -> game.imageSelection.setShooterImage("./images/shooter2.png"));
        img3.addActionListener(e -> game.imageSelection.setShooterImage("./images/shooter3.png"));


        shooterMenu.add(img1);
        shooterMenu.add(img2);
        shooterMenu.add(img3);


        return shooterMenu;
    }
}
