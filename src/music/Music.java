package music;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Music {

    private static Clip clip;

    public static Clip getClip() {
        return clip;
    }

    public static void musicShoot() {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("music\\shoot.wav").getAbsoluteFile());
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            FloatControl floatControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            floatControl.setValue(-10f);
            clip.start();
        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException h) {
            h.printStackTrace();
        }
    }

    public static void musicOfTheGame() {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("music\\muzyka rozpoczynająca rozgrywkę.wav").getAbsoluteFile());
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            FloatControl floatControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            floatControl.setValue(-10f);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException s) {
            s.printStackTrace();
        }
    }

    public static void musicGameWin() {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("music\\GameWin.wav").getAbsoluteFile());
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException h) {
            h.printStackTrace();
        }
    }

    public static void musicGameOver() {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("music\\GameOver.wav").getAbsoluteFile());
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException h) {
            h.printStackTrace();
        }
    }
}