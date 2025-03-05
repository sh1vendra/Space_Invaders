package spaceinvaders;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

// new bulletMenu branch completed
public class BulletMenu {
    private SpaceInvadersUI game;
    
    public BulletMenu(SpaceInvadersUI game){
        this.game = game;
    }
    
    public static JMenu createBulletMenu() {
        JMenu bulletMenu = new JMenu("Bullet Type");

        JMenuItem shape1 = new JMenuItem("bullet1");
        JMenuItem shape2 = new JMenuItem("bullet2");
        JMenuItem shape3 = new JMenuItem("bullet3");
        JMenuItem customImg = new JMenuItem("Custom Bullet Image");

        shape1.addActionListener(e -> setBulletType("../resources/BulletImages/bullet1.png"));
        shape2.addActionListener(e -> setBulletType("../resources/BulletImages/bullet2.png"));
        shape3.addActionListener(e -> setBulletType("../resources/BulletImages/bullet3.png"));
        customImg.addActionListener(e -> setCustomBulletImage());

        bulletMenu.add(shape1);
        bulletMenu.add(shape2);
        bulletMenu.add(shape3);
        bulletMenu.add(customImg);

        return bulletMenu;
    }

    private static void setBulletType(String imagePath) {
        System.out.println("Invader image set to: " + imagePath);
    }

    private static void setCustomBulletImage() {
        String imagePath = JOptionPane.showInputDialog("Enter image URL or path:");
        System.out.println("Custom invader image set to: " + imagePath);
    }


}
