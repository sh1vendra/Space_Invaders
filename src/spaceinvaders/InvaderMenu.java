package spaceinvaders;
import javax.swing.*;

public class InvaderMenu {
    private final SpaceInvadersUI game;
    
    public InvaderMenu(SpaceInvadersUI game){
        this.game = game;
    }

    public JMenu createInvaderMenu() {
        JMenu invaderMenu = new JMenu("Invader Image");

        JMenuItem img1 = new JMenuItem("Invader 1");
        JMenuItem img2 = new JMenuItem("Invader 2");
        JMenuItem img3 = new JMenuItem("Invader 3");

        img1.addActionListener(e -> game.imageSelection.setInvaderImage("./images/invader1.png"));
        img2.addActionListener(e -> game.imageSelection.setInvaderImage("./images/invader2.png"));
        img3.addActionListener(e -> game.imageSelection.setInvaderImage("./images/invader3.png"));

        invaderMenu.add(img1);
        invaderMenu.add(img2);
        invaderMenu.add(img3);


        return invaderMenu;
    }


    
}
