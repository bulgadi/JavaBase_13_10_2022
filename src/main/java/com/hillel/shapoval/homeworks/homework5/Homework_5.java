package com.hillel.shapoval.homeworks.homework5;

import java.util.Scanner;

public class Homework_5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть імʼя першої команди");
        String nameTeam1 = scanner.nextLine();

        System.out.println("Введіть кількість фрагів для першого гравця команди " + nameTeam1);
        int pl1T1  = scanner.nextInt();
        System.out.println("Введіть кількість фрагів для другого гравця команди " + nameTeam1);
        int pl2T1  = scanner.nextInt();
        System.out.println("Введіть кількість фрагів для третього гравця команди " + nameTeam1);
        int pl3T1  = scanner.nextInt();
        System.out.println("Введіть кількість фрагів для четвертого гравця команди " + nameTeam1);
        int pl4T1  = scanner.nextInt();
        System.out.println("Введіть кількість фрагів для пʼятого гравця команди " + nameTeam1);
        int pl5T1  = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введіть імʼя другої команди");
        String nameTeam2 = scanner.nextLine();

        System.out.println("Введіть кількість фрагів для першого гравця команди " + nameTeam2);
        int pl1T2  = scanner.nextInt();
        System.out.println("Введіть кількість фрагів для другого гравця команди " + nameTeam2);
        int pl2T2  = scanner.nextInt();
        System.out.println("Введіть кількість фрагів для третього гравця команди " + nameTeam2);
        int pl3T2  = scanner.nextInt();
        System.out.println("Введіть кількість фрагів для четвертого гравця команди " + nameTeam2);
        int pl4T2  = scanner.nextInt();
        System.out.println("Введіть кількість фрагів для пʼятого гравця команди " + nameTeam2);
        int pl5T2  = scanner.nextInt();
        scanner.nextLine();

        final int PLAYER = 5;

        int resultT1 = ((pl1T1 + pl2T1 + pl3T1 + pl4T1 + pl5T1) / PLAYER);
        int resultT2 = ((pl1T2 + pl2T2 + pl3T2 + pl4T2 + pl5T2) / PLAYER);

        int result1Fr = (pl1T1 + pl2T1 + pl3T1 + pl4T1 + pl5T1);
        int result2Fr = (pl1T2 + pl2T2 + pl3T2 + pl4T2 + pl5T2);


        if (resultT1 > resultT2) {
            System.out.println("Перемогла команда " + nameTeam1 + " набравши " + result1Fr + " очків.");
        }
        if (resultT1 < resultT2) {
            System.out.println("Перемогла команда " + nameTeam2 + " набравши " + result2Fr + " очків.");
        }
        else {
            System.out.println("Перемогла нічия " + "команда " + nameTeam1 + " набрала " + result1Fr + " очків " +
                    ", а також команда " + nameTeam2 + " набрала " + result2Fr + " очків.");
        }



        //   System.out.println("Перша команда = " + nameTeam1);




//        int number = scanner.nextInt();
//        System.out.println(number);




    }
}
