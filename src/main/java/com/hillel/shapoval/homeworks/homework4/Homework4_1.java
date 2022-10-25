package com.hillel.shapoval.homeworks.homework4;

public class Homework4_1 {

    public static void main(String[] args) {

        // Армія Лі
        int LiWarriorAttack = 13;
        int LiBowmanAttack = 24;
        int LiRiderAttack = 46;
        int LiNumber = 860;
        System.out.println("Сила армії Лі = " + ((LiWarriorAttack * LiNumber) + (LiBowmanAttack * LiNumber) + (LiRiderAttack * LiNumber)));

        // Армія Мінь
        int MinWarriorAttack = 9;
        int MinBowmanAttack = 35;
        int MinRiderAttack = 12;
        double MinNumber = LiNumber * 1.5;
        System.out.println("Сила армії Мінь = " + ((MinWarriorAttack * MinNumber) + (MinBowmanAttack * MinNumber) + (MinRiderAttack * MinNumber)));



    }
}
