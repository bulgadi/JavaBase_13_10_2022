package com.hillel.shapoval.homeworks.test.test.styles.impl;

import com.hillel.shapoval.homeworks.test.test.group.Group;
import com.hillel.shapoval.homeworks.test.test.styles.MusicStyles;

public class ClassicMusic extends MusicStyles {
//    public ClassicMusic(String nameBand) {
//        super(nameBand);
//    }



    @Override
    public void playMusic(Group group) {
        group.playClassic();
    }
}
