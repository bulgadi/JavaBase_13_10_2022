package com.hillel.shapoval.homeworks.homework4;

public class homework4_1 {

    public static void main(String[] args) {

      /*
        int a = 10;
        int b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);

        System.out.println();


        // Автоматично до int. Дроби!

        System.out.println((double)10 / 3);
        System.out.println((double)10 / (double)3);
        System.out.println(10 / (double)3);
        System.out.println();

        //   залишок ділення


        System.out.println(a % b); */





        // Армія Лі
        int LiWarriorAttack = 13;
        int LiBowmanAttack = 24;
        int LiRiderAttack = 46;
        int LiNumber = 860;
        System.out.println("Сила армії Лі = " + (LiWarriorAttack * LiNumber) + (LiBowmanAttack * LiNumber) + (LiRiderAttack * LiNumber));

        // Армія Мінь
        int MinWarriorAttack = 9;
        int MinBowmanAttack = 35;
        int MinRiderAttack = 12;
        double MinNumber = LiNumber * 1.5;
        System.out.println("Сила армії Мінь = " + (MinWarriorAttack * MinNumber) + (MinBowmanAttack * MinNumber) + (MinRiderAttack * MinNumber));


    }
}
