package view;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;

public class Game {
    private Clip musicClip;

    public void addMusic(String musicFilePath) {
        try {
            // Chargement du fichier audio
            File musicFile = new File("C:/Users/user/Downloads/Boulder Dash Theme [C64] (by Peter Liepa).wav");
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(musicFile);

            // Création d'un clip audio
            musicClip = AudioSystem.getClip();
            musicClip.open(audioInputStream);

            // Lecture en boucle de la musique
            musicClip.loop(Clip.LOOP_CONTINUOUSLY);

        } catch (UnsupportedAudioFileException | LineUnavailableException | IOException e) {
            e.printStackTrace();
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

