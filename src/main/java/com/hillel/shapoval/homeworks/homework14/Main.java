package com.hillel.shapoval.homeworks.homework14;


import com.hillel.shapoval.homeworks.homework14.styles.MusicStyles;
import com.hillel.shapoval.homeworks.homework14.styles.impl.ClassicMusic;
import com.hillel.shapoval.homeworks.homework14.styles.impl.PopMusic;
import com.hillel.shapoval.homeworks.homework14.styles.impl.RockMusic;


public class Main {
    public static void main(String[] args) {

        ClassicMusic[] classicMusicGroup = {
                new ClassicMusic("Orchestra"),
                new ClassicMusic("Violin"),
                new ClassicMusic("Garra"),
                new ClassicMusic("Hooll")
        };
        playMusic(classicMusicGroup);

        PopMusic[] popMusicBand = {
                new PopMusic("ABBA"),
                new PopMusic("Crystals"),
                new PopMusic("Pentatonix"),
                new PopMusic("Karmin")
        };
        playMusic(popMusicBand);

        RockMusic[] rockMusicBand = {
                new RockMusic("Metallica"),
                new RockMusic("Pink Floyd"),
                new RockMusic("Beatles"),
                new RockMusic("U2")
        };
        playMusic(rockMusicBand);


    }


    private static void playMusic(MusicStyles[] bands){
        for (MusicStyles band : bands) {
            band.playMusic();
        }
    }





}