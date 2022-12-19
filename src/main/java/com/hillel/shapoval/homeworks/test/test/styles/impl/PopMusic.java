package com.hillel.shapoval.homeworks.test.test.styles.impl;

import com.hillel.shapoval.homeworks.test.test.group.Group;
import com.hillel.shapoval.homeworks.test.test.styles.MusicStyles;

public class PopMusic extends MusicStyles {
//    public PopMusic(String nameBand) {
//        super(nameBand);
//    }



    @Override
    public void playMusic(Group group) {
        group.playPop();
    }
}
