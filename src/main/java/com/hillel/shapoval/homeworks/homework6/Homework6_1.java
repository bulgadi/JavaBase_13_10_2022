package com.hillel.shapoval.homeworks.homework6;

import java.util.Scanner;

public class Homework6_1 {

    //Зробити гру, в якій потрібно відгадати ціле число, яке "загадав" комп'ютер у діапазоні від 0 до 10
    //Користувач повинен мати можливість вгадувати в кілька спроб (мінімум 3).

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int random = (int) (Math.random() * 11);
        System.out.println(random);

        System.out.println("У Вас є три спроби відгадати число.");
        System.out.println("Введіть перше число:");
        while (true) {

            if (scanner.hasNextInt()) {
                int number1 = scanner.nextInt();
                if (number1 >= 0 && number1 <= 10) {
                    System.out.println("Ви ввели число: " + number1);
                    if (random == number1) {
                        System.out.println("Ви виграли!!!");
                    } else {
                        System.out.println("На жаль, ви не вгадали, у Вас є ще 2 спроби");
                        break;
                    }
                } else {
                    System.out.println("Введіть число від 0 до 10.");
                    scanner.nextLine();
                }
            } else {
                System.out.println("Введіть число від 0 до 10.");
                scanner.nextLine();
            }
        }

        System.out.println("Введіть Ваше друге число:");
        while (true) {
            scanner.nextLine();
            if (scanner.hasNextInt()) {
                int number2 = scanner.nextInt();
                if (number2 >= 0 && number2 <= 10) {
                    System.out.println("Ви ввели число: " + number2);
                    if (random == number2) {
                        System.out.println("Ви виграли!!!");
                    } else {
                        System.out.println("На жаль, ви не вгадали, у Вас є ще 1 спроба");
                        break;
                    }
                } else {
                    System.out.println("Введіть число від 0 до 10.");
                }
            } else {
                System.out.println("Введіть число від 0 до 10.");
            }
        }

        System.out.println("Введіть Ваше третє число:");
        while (true) {
            scanner.nextLine();
            if (scanner.hasNextInt()) {
                int number3 = scanner.nextInt();
                if (number3 >= 0 && number3 <= 10) {
                    System.out.println("Ви ввели число: " + number3);
                    if (random == number3) {
                        System.out.println("Ви виграли!!!");
                    } else {
                        System.out.println("Дуже шкода, але Ви програли(");
                        break;
                    }
                } else {
                    System.out.println("Введіть число від 0 до 10.");
                }
            } else {
                System.out.println("Введіть число від 0 до 10.");
            }
        }
    }
}
