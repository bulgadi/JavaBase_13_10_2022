package com.hillel.shapoval.homeworks.test.test;

import com.hillel.shapoval.homeworks.test.test.group.Group;
import com.hillel.shapoval.homeworks.test.test.group.impl.PopGroup;
import com.hillel.shapoval.homeworks.test.test.group.impl.ClassicGroup;
import com.hillel.shapoval.homeworks.test.test.group.impl.RockGroup;
import com.hillel.shapoval.homeworks.test.test.styles.impl.ClassicMusic;
import com.hillel.shapoval.homeworks.test.test.styles.MusicStyles;
import com.hillel.shapoval.homeworks.test.test.styles.impl.PopMusic;
import com.hillel.shapoval.homeworks.test.test.styles.impl.RockMusic;

public class Main {

    public static void main(String[] args) {

        Group[] group = {
                new ClassicGroup("Orchestra"),
                new ClassicGroup("Violin"),
                new PopGroup("ABBA"),
                new RockGroup("Coldplay"),
                new RockGroup("Beatles")};

        MusicStyles[] musicStyles = {
                new ClassicMusic(),
                new PopMusic(),
                new RockMusic()
        };

//        for (MusicStyles musicStyle: musicStyles) {
//            for (Group grouped : group) {
////                musicStyle.playMusic(group);
//                musicStyle.playMusic();
//
//
//            }
//
//        }








//
//        PopMusic popMusic = new PopMusic("A");
//        RockMusic rockMusic = new RockMusic("B");
//        ClassicMusic classicMusic = new ClassicMusic("C");
//
//        popMusic.playMusic();
//        rockMusic.playMusic();
//        classicMusic.playMusic();





    }
















}
