package spaceinvaders;
import javax.swing.*;

public class InvaderMenu {
    public static JMenu createInvaderMenu() {
        JMenu invaderMenu = new JMenu("Invader Image");

        JMenuItem img1 = new JMenuItem("Invader 1");
        JMenuItem img2 = new JMenuItem("Invader 2");
        JMenuItem img3 = new JMenuItem("Invader 3");
        JMenuItem customImg = new JMenuItem("Custom Image");
        img1.addActionListener(e -> setInvaderImage("invader1.png"));
        img2.addActionListener(e -> setInvaderImage("invader2.png"));
        img3.addActionListener(e -> setInvaderImage("invader3.png"));
        customImg.addActionListener(e -> setCustomInvaderImage());

        invaderMenu.add(img1);
        invaderMenu.add(img2);
        invaderMenu.add(img3);
        invaderMenu.add(customImg);

        return invaderMenu;
    }

    private static void setInvaderImage(String imagePath) {
        System.out.println("Invader image set to: " + imagePath);
    }

    private static void setCustomInvaderImage() {
        String imagePath = JOptionPane.showInputDialog("Enter image URL or path:");
        System.out.println("Custom invader image set to: " + imagePath);
    }


    
}
