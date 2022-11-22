package com.hillel.shapoval.homeworks.howework9;

import java.util.Scanner;

public class Homework9 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int[] [] array = new int [m] [n];


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array [i] [j] = (int) (Math.random() * 10);
            }
        }


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();



        for (int i = 0; i < m; i++) {
            for (int j = i; j < n; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[j][i] + "\t");
            }
            System.out.println();
        }











    }


}




