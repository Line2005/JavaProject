package view;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;

/**
 * The Class Main.
 *
 * @author Edwin, Daniela
 */

public class Game {
    private Clip musicClip;

    public void addMusic(String musicFilePath) {
        try {
            File musicFile = new File(musicFilePath);
            System.out.println("Absolute Path: " + musicFile.getAbsolutePath());

            if (!musicFile.exists()) {
                System.err.println("File not found!");
                return;
            }

            try (AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(musicFile)) {
                // rest of the code
            } catch (UnsupportedAudioFileException | IOException e) {
                e.printStackTrace();
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void playMusic() {
        if (musicClip != null && !musicClip.isRunning()) {
            musicClip.start();
        }
    }

    public void stopMusic() {
        if (musicClip != null && musicClip.isRunning()) {
            musicClip.stop();
        }
    }
}
