package com.hillel.shapoval.homeworks.homework14.styles.impl;

import com.hillel.shapoval.homeworks.homework14.styles.MusicStyles;
import com.hillel.shapoval.homeworks.homework14.groups.Group;

public class ClassicMusic extends MusicStyles {
    @Override
    public void playMusic(Group group) {
        group.rock();
    }
}
