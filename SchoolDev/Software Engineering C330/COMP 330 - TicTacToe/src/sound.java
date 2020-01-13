import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class sound{
    static void playSound(File file){
        try{
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(file));
            clip.start();

            //Thread.sleep(clip.getMicrosecondLength()/1000);
        }catch(Exception e){

        }
    }
    public static void playRing(){
        File chime = new File("chime.wav");
        playSound(chime);
    }

    public static void playApplause(){
        File chime = new File("applause_y.wav");
        playSound(chime);
    }
}



