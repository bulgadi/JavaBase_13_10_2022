package com.hillel.shapoval.homeworks.homework15;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {


        int a = 3;
        int b = 3;

        int[][] mas1 = new int[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                mas1[i][j] = (int) (Math.random() * 11);
            }
        }
        for (int[] j : mas1) {
            for (int i : j) {
                System.out.print(i + "\t");
            }

        }

        double average = 0;
        double average1 = 0;

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                average = average1 + mas1[i][j];
                average1 = average;
            }
        }
        average/= a * b;

        System.out.println(average);

    }



}
