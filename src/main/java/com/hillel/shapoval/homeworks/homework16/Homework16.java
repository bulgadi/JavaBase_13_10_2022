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
    public static double arithmeticMean(int[] mas1) {
        double average = 0;

        for (int i = 0; i < mas1.length; i++) {
                average = average + mas1[i];
        }
        average /= mas1.length;
        return average;
    }
}
