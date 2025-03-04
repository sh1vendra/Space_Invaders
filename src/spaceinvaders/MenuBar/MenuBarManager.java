import javax.swing.*;

package spaceinvaders.MenuBar;

// created a class
public class MenuBarManager {
    public static JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();

        menuBar.add(ShooterMenu.createShooterMenu());
        menuBar.add(InvaderMenu.createInvaderMenu());
        menuBar.add(BulletMenu.createBulletMenu());
        menuBar.add(MusicMenu.createMusicMenu());

        return menuBar;
    }
}

// new branch ShooterMenu