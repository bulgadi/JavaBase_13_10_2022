package com.hillel.shapoval.homeworks.homework11;

public class BurgerMain {
    public static void main(String[] args) {

        Burger ordinary = new Burger("булочка", "майонез", "сир", "зелень", "м'ясо");
        System.out.println();
        Burger diet = new Burger("булочка", "сир", "зелень", "м'ясо");
        System.out.println();
        Burger doubleMeat = new Burger("булочка", "майонез", "сир",
                "зелень", "м'ясо", "мʼясо");
    }
}
