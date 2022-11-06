package com.hillel.shapoval.homeworks.homework6;

public class Homework6_2 {
    //  У Японії числа 4 та 9 вважаються нещасливими.
    //  Вам потрібно пронумерувати 100 космічних шатлів для перевезення людей на Марс так,
    //  щоб у номерах шатлів не траплялося нещасливих чисел. Напишіть функцію,
    //  яка виводить усі номери таких шатлів.

    public static void main(String[] args) {
        int counter = 1;
        for (int i = 1; counter <= 100; i++) {
            if (i / 10 == 4 || i / 10 == 9 || i % 10 == 4 || i % 10 == 9 || i / 10 == 14) {
                continue;
            }
            System.out.println(counter);
            System.out.println("shuttle number: " + i);
            counter++;
        }
    }
}

