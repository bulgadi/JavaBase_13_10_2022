package com.hillel.shapoval.homeworks.homework13;

import com.hillel.shapoval.homeworks.homework13.classes.Androids;
import com.hillel.shapoval.homeworks.homework13.classes.IPhones;
import com.hillel.shapoval.homeworks.homework13.classes.Phone;
import com.hillel.shapoval.homeworks.homework13.interfaces.IOS;
import com.hillel.shapoval.homeworks.homework13.interfaces.LinuxOS;
import com.hillel.shapoval.homeworks.homework13.interfaces.Smartphones;
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














