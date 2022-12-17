package com.hillel.shapoval.homeworks.homework13;

public class Androids extends Phone implements Smartphones, LinuxOS {

    public Androids(String phone) {
        super(phone);
    }

    @Override
    public void call() {
        System.out.println(getPhone() + " can call");

    }

    @Override
    public void sms() {
        System.out.println(getPhone() + " send sms");

    }

    @Override
    public void internet() {
        System.out.println(getPhone() + " have internet");

    }

    @Override
    public void linuxOS() {
        System.out.println(getPhone() + " have linuxOS");

    }
}
