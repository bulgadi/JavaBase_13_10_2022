package com.hillel.shapoval.homeworks.homework14.styles.impl;

import com.hillel.shapoval.homeworks.homework14.styles.MusicStyles;
import com.hillel.shapoval.homeworks.homework14.groups.Group;

public class RockMusic extends MusicStyles {
    @Override
    public void start(Group group) {
        group.pop();
    }
}
