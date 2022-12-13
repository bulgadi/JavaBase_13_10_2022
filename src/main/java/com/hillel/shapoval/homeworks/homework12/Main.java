package com.hillel.shapoval.homeworks.homework12;

public class Main {

    public static void main(String[] args) {

        Data dima = new Data("Dima", 15, 12, 2000, "dima.shapoval@gmail.com",
                "0934306876", "Shapoval", 72, 120, 4200);
        dima.printAccountInfo();

        Data kate = new Data("Kate", 07, 8, 1997, "kate@gmail.com",
                "0933456789", "Ramon", 78, 134, 3500);
        kate.printAccountInfo();

        Data alex = new Data("Alex", 19, 9, 1988, "alex@gmail.com",
                "093456789", "Talon", 98, 110, 4000);
        alex.printAccountInfo();
        System.out.println();

        dima.setNumberSteps(5673);
        dima.setWeight(76);
        dima.setPressure(134);

        alex.setNumberSteps(738);
        alex.setSurname("Sanlo");
        alex.setWeight(70);

        dima.printAccountInfo();
        kate.printAccountInfo();
        alex.printAccountInfo();
    }
}
