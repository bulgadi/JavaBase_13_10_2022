package com.hillel.shapoval.homeworks.homework16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestHomework16 {

    @Test
    public void test1(){

        int a = 8;
        int b = 8;

        int[][] mas1 = new int[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                mas1[i][j] = (int) (Math.random() * 6);
            }
        }
        boolean square = Homework16.runArray(mas1);
        Assertions.assertTrue(square);
    }
}
