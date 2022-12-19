package com.hillel.shapoval.homeworks.test.test.group;

public abstract class Group {

    private String name;

    public Group(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public abstract void playClassic();
    public abstract void playRock();
    public abstract void playPop();



}
