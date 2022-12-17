package com.hillel.shapoval.homeworks.homework13;

public class Main {

    public static void main(String[] args) {

        IPhones iphone = new IPhones("iPhone");
        Androids android = new Androids("Android");

        demo(iphone);
        System.out.println();
        demo(android);
    }


    static void demo(Phone phone) {

        if (phone instanceof Smartphones) {
            ((Smartphones) phone).call();
        }
        if (phone instanceof Smartphones) {
            ((Smartphones) phone).sms();
        }
        if (phone instanceof Smartphones) {
            ((Smartphones) phone).internet();
        }
        if (phone instanceof IOS) {
            ((IOS) phone).iOS();
        }
        if (phone instanceof LinuxOS) {
            ((LinuxOS) phone).linuxOS();
        }
    }
}














