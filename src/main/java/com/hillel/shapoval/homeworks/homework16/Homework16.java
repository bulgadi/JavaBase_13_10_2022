package com.hillel.shapoval.homeworks.homework16;

import java.lang.reflect.Array;

public class Homework16 {
    public static boolean runArray(int[][] mas) {

        for (int i = 0, l = mas.length; i < l; i++) {
            if (mas[i].length != l) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }
    public static double arithmeticMean(int[] mas) {
        double average = 0;
        double sum = 0;

        if (mas.length > 0){
            for (int j : mas) {
                sum = average + j;
            }
            average = sum / mas.length;
        }
        return average;
    }
}
