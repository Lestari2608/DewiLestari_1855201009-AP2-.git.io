/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS2;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

/**
 *
 * @author acer
 */
public class Wavplayer {
    
    private static AudioClip musik;
    
    public void mainMusik(String source){
        URL url = this.getClass().getResource(source);
        musik = Applet.newAudioClip(url);
        musik.play();
        System.out.println("play");
    }
    
    public void stopMusik(String source){
        URL url = this.getClass().getResource(source);
        musik = Applet.newAudioClip(url);
        musik.stop();
    }
    
    public static void main(String[] args) {
        Wavplayer sik = new Wavplayer();
        sik.mainMusik("lathi.wav");
    }
}
