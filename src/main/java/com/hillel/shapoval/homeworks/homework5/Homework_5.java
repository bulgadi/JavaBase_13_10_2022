package com.hillel.shapoval.homeworks.homework5;

import java.util.Scanner;

public class Homework_5 {

    public static void main(String[] args) {

        String error = "Ви ввели неправильні данні. Значення при введенні фрагів має бути суто числовим. Спробуйте ще раз.";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть імʼя першої команди");
        String nameTeam1 = scanner.nextLine();

        System.out.println("Введіть кількість фрагів для першого гравця команди " + nameTeam1);
        int pl1T1 = 0;
        if (scanner.hasNextInt()) {
            pl1T1 = scanner.nextInt();
        } else {
            System.out.println(error);
            System.exit(0);
        }

        System.out.println("Введіть кількість фрагів для другого гравця команди " + nameTeam1);
        int pl2T1 = 0;
        if (scanner.hasNextInt()) {
            pl2T1 = scanner.nextInt();
        } else {
            System.out.println(error);
            System.exit(0);
        }

        System.out.println("Введіть кількість фрагів для третього гравця команди " + nameTeam1);
        int pl3T1 = 0;
        if (scanner.hasNextInt()) {
            pl3T1 = scanner.nextInt();
        } else {
            System.out.println(error);
            System.exit(0);
        }

        System.out.println("Введіть кількість фрагів для четвертого гравця команди " + nameTeam1);
        int pl4T1 = 0;
        if (scanner.hasNextInt()) {
            pl4T1 = scanner.nextInt();
        } else {
            System.out.println(error);
            System.exit(0);
        }

        System.out.println("Введіть кількість фрагів для пʼятого гравця команди " + nameTeam1);
        int pl5T1 = 0;
        if (scanner.hasNextInt()) {
            pl5T1 = scanner.nextInt();
        } else {
            System.out.println(error);
            System.exit(0);
        }
        scanner.nextLine();


        System.out.println("Введіть імʼя другої команди");
        String nameTeam2 = scanner.nextLine();

        System.out.println("Введіть кількість фрагів для першого гравця команди " + nameTeam2);
        int pl1T2 = 0;
        if (scanner.hasNextInt()) {
            pl1T2 = scanner.nextInt();
        } else {
            System.out.println(error);
            System.exit(0);
        }

        System.out.println("Введіть кількість фрагів для другого гравця команди " + nameTeam2);
        int pl2T2 = 0;
        if (scanner.hasNextInt()) {
            pl2T2 = scanner.nextInt();
        } else {
            System.out.println(error);
            System.exit(0);
        }

        System.out.println("Введіть кількість фрагів для третього гравця команди " + nameTeam2);
        int pl3T2 = 0;
        if (scanner.hasNextInt()) {
            pl3T2 = scanner.nextInt();
        } else {
            System.out.println(error);
            System.exit(0);
        }

        System.out.println("Введіть кількість фрагів для четвертого гравця команди " + nameTeam2);
        int pl4T2 = 0;
        if (scanner.hasNextInt()) {
            pl4T2 = scanner.nextInt();
        } else {
            System.out.println(error);
            System.exit(0);
        }

        System.out.println("Введіть кількість фрагів для пʼятого гравця команди " + nameTeam2);
        int pl5T2 = 0;
        if (scanner.hasNextInt()) {
            pl5T2 = scanner.nextInt();
        } else {
            System.out.println(error);
            System.exit(0);
        }

        scanner.nextLine();

        final int PLAYER = 5;

        double resultT1 = ((double) (pl1T1 + pl2T1 + pl3T1 + pl4T1 + pl3T2) / PLAYER);
        double resultT2 = ((double) (pl1T2 + pl2T2 + pl3T2 + pl4T2 + pl5T2) / PLAYER);

        int result1Fr = (pl1T1 + pl2T1 + pl3T1 + pl4T1 + pl5T1);
        int result2Fr = (pl1T2 + pl2T2 + pl3T2 + pl4T2 + pl5T2);


        if (resultT1 > resultT2) {
            System.out.println("Перемогла команда " + nameTeam1 + " набравши в сумі " + result1Fr + " очків. " +
                    "Середній результат гравця команди " + nameTeam1 + " становить " + resultT1 + " очків.");
        } else if (resultT1 < resultT2) {
            System.out.println("Перемогла команда " + nameTeam2 + " набравши в сумі " + result2Fr + " очків. " +
                    "Середній результат гравця команди " + nameTeam2 + " становить " + resultT2 + " очків.");
        } else {
            System.out.println("Перемогла нічия, " + "команда " + nameTeam1 + " набрала " + result1Fr + " очків" +
                    ", а також команда " + nameTeam2 + " набрала " + result2Fr + " очків. " +
                    "Середні резульатати гравців команд становлять " + resultT1 + " та " + resultT2 + " очків.");
        }


    }
}
