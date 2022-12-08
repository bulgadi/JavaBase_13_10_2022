package com.hillel.shapoval.homeworks.homework11;

public class Burger {

    String product1 = "булочка";
    String product2 = "майонез";
    String product3 = "сир";
    String product4 = "зелень";
    String product5 = "м'ясо";
    String product6 = "м'ясо";


    public Burger(String product1, String product2, String product3, String product4, String product5) {
        System.out.println("Звичайний бургер: " + "\n" + product1 + "\n" + product2 + "\n" + product3 +
                "\n" + product4 + "\n" + product5);

    }

    public Burger(String product1, String product3, String product4, String product5) {
        System.out.println("Дієтичний бургер: " + "\n" + product1 + "\n" + product3 +
                "\n" + product4 + "\n" + product5);

    }

    public Burger(String product1, String product2, String product3, String product4, String product5, String product6) {
        System.out.println("Бургер з подвійним мʼясом: " + "\n" + product1 + "\n" + product2 +
                "\n" + product3 + "\n" + product4 + "\n" + product5 + "\n" + product6);

    }

}

