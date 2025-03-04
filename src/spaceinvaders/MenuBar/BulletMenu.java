package spaceinvaders.MenuBar;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

// new bulletMenu branch completed
public class BulletMenu {
    public static JMenu createBulletMenu() {
        JMenu bulletMenu = new JMenu("Bullet Type");

        JMenuItem shape1 = new JMenuItem("Circle");
        JMenuItem shape2 = new JMenuItem("Triangle");
        JMenuItem shape3 = new JMenuItem("Square");
        JMenuItem customImg = new JMenuItem("Custom Bullet Image");

        shape1.addActionListener(e -> ImageLoader.setBulletType("circle"));
        shape2.addActionListener(e -> ImageLoader.setBulletType("triangle"));
        shape3.addActionListener(e -> ImageLoader.setBulletType("square"));
        customImg.addActionListener(e -> ImageLoader.setCustomBulletImage());

        bulletMenu.add(shape1);
        bulletMenu.add(shape2);
        bulletMenu.add(shape3);
        bulletMenu.add(customImg);

        return bulletMenu;
    }

}
