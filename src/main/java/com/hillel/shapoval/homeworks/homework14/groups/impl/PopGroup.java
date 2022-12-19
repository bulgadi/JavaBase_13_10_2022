package com.hillel.shapoval.homeworks.homework14.groups.impl;

import com.hillel.shapoval.homeworks.homework14.groups.Group;

public class PopGroup extends Group {

    public PopGroup(String name) {
        super(name);
    }

    @Override
    public void rock() {
        System.out.println(getName() + " cant play rock");
    }

    @Override
    public void pop() {
        System.out.println(getName() + " can play pop");
    }

    @Override
    public void classic() {
        System.out.println(getName() + " cant play classic");
    }
}
