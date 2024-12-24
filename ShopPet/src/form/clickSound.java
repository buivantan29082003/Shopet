/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package form;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Method;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author ADMIN
 */
public class clickSound {

    public static String ping="src/Sound/ping.wav";
    public static String stop="src/Sound/stop.wav";
    public static String buttonclick="src/Sound/buttonclick.wav";
    public static String erro="src/Sound/error.wav";
    public static String success="src/Sound/successful.wav";
    
    public static void SoundPing(){
        starts(ping);
    }
    
    public static void Soundsuccess(){
        starts(success);
    }
    
    public static void Soundstop(){
        starts(stop);
    }
    
    public static void SoundErro(){
        starts(erro);
    }
    public static void SoundButtonClick(){
        starts(buttonclick);
    }
    public static void starts(String file) {
        try {
            AudioInputStream a = AudioSystem.getAudioInputStream(new File(file));
            Clip clip = AudioSystem.getClip();
            clip.open(a);
            clip.start();
        }catch (Exception ex) {
        }
    }
}
