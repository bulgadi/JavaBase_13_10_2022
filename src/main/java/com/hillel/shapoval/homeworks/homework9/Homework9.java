package com.hillel.shapoval.homeworks.homework9;

import java.util.Scanner;

public class Homework9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int m = 0;

        do {
            System.out.println("Введіть M:");
            if (scanner.hasNextInt()) {
                m = scanner.nextInt();
                if (m <= 0) {
                    System.out.println("Помилка. Введіть додатнє чмсло");
                }
            } else {
                System.out.println("Помилка. Введіть ціле додатнє число");
            }
            System.out.println();
            scanner.nextLine();
        } while (m <= 0);

        do {
            System.out.println("Введіть N:");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n <= 0) {
                    System.out.println("Помилка. Введіть додатнє чмсло");
                }
            } else {
                System.out.println("Помилка. Введіть ціле додатнє число");
            }
            System.out.println();
            scanner.nextLine();
        } while (n <= 0);

        int[][] array = new int[m][n];
        int[][] array2 = new int[n][m];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 11);
                array2[j][i] = array[i][j];
            }
        }

        System.out.println("Масив MxN");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Масив NxM");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + "\t");
            }
            System.out.println();
        }
    }
}




