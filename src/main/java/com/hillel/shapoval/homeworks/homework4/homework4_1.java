package com.hillel.shapoval.homeworks.homework4;

public class homework4_1 {

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


      /*
        int x = 4;
        int y = 7;
        System.out.println(y-- + (x++ - ++x) + (x++ - --y) + y++ + --x); // 7 + (4 - 6) + (6 - 6) + 6 + 6 = 7 - 2 + 12 = 17
       */
    }
}
