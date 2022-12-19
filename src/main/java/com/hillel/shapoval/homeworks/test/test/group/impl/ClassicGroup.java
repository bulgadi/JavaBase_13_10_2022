package com.hillel.shapoval.homeworks.test.test.group.impl;
import com.hillel.shapoval.homeworks.test.test.group.Group;

public class ClassicGroup extends Group {

    public ClassicGroup(String name) {
        super(name);
    }

    @Override
    public void playClassic() {
        System.out.println(getName() + "play classic");

    }

    @Override
    public void playRock() {
        System.out.println(getName() + "can't play rock");

    }

    @Override
    public void playPop() {
        System.out.println(getName() + "can't play pop");

    }
}
