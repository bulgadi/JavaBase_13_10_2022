package com.hillel.shapoval.homeworks.homework16;

public class Homework16 {
    public static boolean runArray(int[][] mas1) {

        for (int i = 0, l = mas1.length; i < l; i++) {
            if (mas1[i].length != l) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }
    public static void arithmeticMean(int[][] mas1, int a, int b) {
        double average = 0;
        double average1 = 0;

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                average = average1 + mas1[i][j];
                average1 = average;
            }
        }
        average /= a * b;
    }
}
