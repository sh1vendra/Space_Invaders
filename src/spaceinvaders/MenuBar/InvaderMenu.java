package spaceinvaders.MenuBar;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

// new branch for Invadermenu completed

public class InvaderMenu {
    public static JMenu createInvaderMenu() {
        JMenu invaderMenu = new JMenu("Invader Image");

        JMenuItem img1 = new JMenuItem("Invader 1");
        JMenuItem img2 = new JMenuItem("Invader 2");
        JMenuItem img3 = new JMenuItem("Invader 3");
        JMenuItem customImg = new JMenuItem("Custom Image");

        img1.addActionListener(e -> ImageLoader.setInvaderImage("invader1.png"));
        img2.addActionListener(e -> ImageLoader.setInvaderImage("invader2.png"));
        img3.addActionListener(e -> ImageLoader.setInvaderImage("invader3.png"));
        customImg.addActionListener(e -> ImageLoader.setCustomInvaderImage());

        invaderMenu.add(img1);
        invaderMenu.add(img2);
        invaderMenu.add(img3);
        invaderMenu.add(customImg);

        return invaderMenu;
    }
}
