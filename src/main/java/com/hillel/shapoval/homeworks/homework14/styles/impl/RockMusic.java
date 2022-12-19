package com.hillel.shapoval.homeworks.homework14.styles.impl;

import com.hillel.shapoval.homeworks.homework14.styles.MusicStyles;

public class RockMusic extends MusicStyles {

    private String bandName;

    public RockMusic(String name) {
        this.bandName = name;
    }
    @Override
    public void playMusic() {
        System.out.println("Play rock music of band: " + bandName);
    }
}
