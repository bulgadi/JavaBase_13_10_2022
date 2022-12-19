package com.hillel.shapoval.homeworks.homework14.groups;

public abstract class Group {

    private String name;

    public Group(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void rock();
    public abstract void pop();
    public abstract void classic();
}

