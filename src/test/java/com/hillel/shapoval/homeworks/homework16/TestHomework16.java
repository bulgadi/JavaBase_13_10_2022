package com.hillel.shapoval.homeworks.homework16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestHomework16 {

    @Test
    public void test1(){

        int a = 10;
        int b = 10;

        int[][] mas = new int[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                mas[i][j] = (int) (Math.random() * 11);
            }
        }
        boolean square = Homework16.runArray(mas);
        Assertions.assertTrue(square);
    }
}
