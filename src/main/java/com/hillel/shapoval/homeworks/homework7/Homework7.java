package com.hillel.shapoval.homeworks.homework7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Homework7 {

    public static void main(String[] args) {
        int[] array1 = new int[25];
        int[] array2 = new int[25];

        int ageMax = 40;
        int ageMin = 18;
        int range = ageMax - ageMin + 1;


        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * range) + ageMin;
        }

        System.out.print("Вік гравців команди №1 = ");
        for (int i = 0; i < array1.length; i++) {
            if (i == array1.length - 1) {
                System.out.print(array1[i]);
            } else {
                System.out.print(array1[i] + ", ");
            }
        }

        System.out.println();

        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * range) + ageMin;
        }

        System.out.print("Вік гравців команди №2 = ");
        for (int i = 0; i < array2.length; i++) {
            if (i == array2.length - 1) {
                System.out.print(+array2[i]);
            } else {
                System.out.print(array2[i] + ", ");
            }
        }
        System.out.println();

        double average1 = 0;
        if (array1.length > 0) {
            double sum = 0;
            for (int i = 0; i < array1.length; i++) {
                sum += array1[i];
            }

            average1 = sum / array1.length;
        }

        System.out.println("Cередній вік гравців команди №1 " + average1 + " років.");

        double average2 = 0;
        if (array2.length > 0) {
            double sum = 0;
            for (int i = 0; i < array2.length; i++) {
                sum += array2[i];
            }

            average2 = sum / array2.length;
        }

        System.out.println("Cередній вік гравців команди №2 " + average2 + " років.");

    }
}
