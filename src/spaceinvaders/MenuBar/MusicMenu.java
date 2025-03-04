import javax.sound.sampled.*;
import java.io.*;

package spaceinvaders.MenuBar;

<<<<<<< HEAD
// create a branch for MusicMenu completed.
=======
// create a branch for MusicMenu completed
>>>>>>> aditya_branch

public class MusicMenu {
    private static Clip clip;

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

    public static void playCustomMusic() {
        
    }

    public static void stopMusic() {
        if (clip != null && clip.isRunning()) {
            clip.stop();
        }
    }
}
