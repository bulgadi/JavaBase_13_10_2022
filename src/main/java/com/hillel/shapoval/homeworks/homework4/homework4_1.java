package com.hillel.shapoval.homeworks.homework4;

public class homework4_1 {

    public static void main(String[] args) {

        // Армія Лі "Сила армії Лі = " +
        int LiWarriorAttack = 13;
        int LiBowmanAttack = 24;
        int LiRiderAttack = 46;
        int LiNumber = 860;
        System.out.println((LiWarriorAttack * LiNumber) + (LiBowmanAttack * LiNumber) + (LiRiderAttack * LiNumber));

        // Армія Мінь "Сила армії Мінь = "
        int MinWarriorAttack = 9;
        int MinBowmanAttack = 35;
        int MinRiderAttack = 12;
        double MinNumber = LiNumber * 1.5;
        System.out.println((MinWarriorAttack * MinNumber) + (MinBowmanAttack * MinNumber) + (MinRiderAttack * MinNumber));


    }
}
