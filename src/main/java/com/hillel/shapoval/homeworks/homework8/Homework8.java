package com.hillel.shapoval.homeworks.homework8;

import java.util.Arrays;

public class Homework8 {
    public static void main(String[] args) {
        int[] numberCompany = new int[7];
        int[] numberPlayer = new int[7];

        for (int i = 0; i < numberCompany.length; i++) {
            numberCompany[i] = (int) (Math.random() * 10);
            numberPlayer[i] = (int) (Math.random() * 10);
        }

        Arrays.sort(numberCompany);
        System.out.println(Arrays.toString(numberCompany));
        Arrays.sort(numberPlayer);
        System.out.println(Arrays.toString(numberPlayer));
        System.out.println();

        int counter = 0;
        for (int i = 0; i < numberCompany.length; i++) {
            if (numberCompany[i] == numberPlayer[i]) {
                counter++;
            }
        }
        System.out.println("Кількість збігів:" + counter);
    }
}
