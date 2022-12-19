package com.hillel.shapoval.homeworks.homework14;

import com.hillel.shapoval.homeworks.homework14.groups.Group;
import com.hillel.shapoval.homeworks.homework14.groups.impl.ClassicGroup;
import com.hillel.shapoval.homeworks.homework14.groups.impl.PopGroup;
import com.hillel.shapoval.homeworks.homework14.groups.impl.RockGroup;
import com.hillel.shapoval.homeworks.homework14.styles.MusicStyles;
import com.hillel.shapoval.homeworks.homework14.styles.impl.ClassicMusic;
import com.hillel.shapoval.homeworks.homework14.styles.impl.PopMusic;
import com.hillel.shapoval.homeworks.homework14.styles.impl.RockMusic;

public class Main {
    public static void main(String[] args) {

        Group[] groups = {
                new PopGroup("ABBA"),
                new ClassicGroup("Orchestra"),
                new ClassicGroup("Violin"),
                new RockGroup("Metallica"),
                new RockGroup("Pink Floyd")
        };

        MusicStyles[] musicStyle = {
                new PopMusic(),
                new RockMusic(),
                new ClassicMusic()
        };

        for (MusicStyles musicStyles : musicStyle) {
            for (Group group : groups) {
                musicStyles.start(group);

            }
        }
    }
}