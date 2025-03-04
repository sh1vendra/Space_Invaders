import javax.sound.sampled.*;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.io.*;

package spaceinvaders.MenuBar;

// create a branch for MusicMenu completed.
// create a branch for MusicMenu completed

public class MusicMenu {
    private static Clip clip;

    public static JMenu createMusicMenu() {
        JMenu musicMenu = new JMenu("Music");

        JMenuItem music1 = new JMenuItem("Music 1");
        JMenuItem music2 = new JMenuItem("Music 2");
        JMenuItem music3 = new JMenuItem("Music 3");
        JMenuItem customMusic = new JMenuItem("Custom Music");

        music1.addActionListener(e -> playMusic("music1.wav"));
        music2.addActionListener(e -> playMusic("music2.wav"));
        music3.addActionListener(e -> playMusic("music3.wav"));
        customMusic.addActionListener(e -> playCustomMusic());

        musicMenu.add(music1);
        musicMenu.add(music2);
        musicMenu.add(music3);
        musicMenu.add(customMusic);

        return musicMenu;
    }

    public static void playMusic(String filename) {
        stopMusic();
        try {
            File file = new File("resources/music/" + filename);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            clip.start();
        } catch (Exception e) {
            System.out.println("Error: Unable to play music. " + e.getMessage());
        }
    }

    public static void stopMusic() {
        if (clip != null && clip.isRunning()) {
            clip.stop();
        }
    }
}
