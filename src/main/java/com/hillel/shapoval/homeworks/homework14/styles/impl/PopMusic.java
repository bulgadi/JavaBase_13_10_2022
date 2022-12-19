package com.hillel.shapoval.homeworks.homework14.styles.impl;

import com.hillel.shapoval.homeworks.homework14.styles.MusicStyles;

public class PopMusic extends MusicStyles {

    private String bandName;


    public PopMusic(String name) {
        this.bandName = name;
    }

    @Override
    public void playMusic() {
        System.out.println("Play pop music of band: " + bandName);
    }
}
