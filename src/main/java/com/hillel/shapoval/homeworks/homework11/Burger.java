package com.hillel.shapoval.homeworks.homework11;

public class Burger {

    private String bun;
    private String mayonnaise;
    private String cheese;
    private String salad;
    private String meat1;
    private String meat2;

    public Burger(String bun, String mayonnaise, String cheese, String salad, String meat) {
        this.bun = bun;
        this.mayonnaise = mayonnaise;
        this.cheese = cheese;
        this.salad = salad;
        this.meat1 = meat;
        System.out.print("Звичайний бургер: ");
        printComposition();
    }

    public Burger(String bun, String cheese, String salad, String meat) {
        this.bun = bun;
        this.cheese = cheese;
        this.salad = salad;
        this.meat1 = meat;
        System.out.print("Дієтичний бургер: ");
        printComposition();
    }

    public Burger(String bun, String mayonnaise, String cheese, String salad, String meat1, String meat2) {
        this.bun = bun;
        this.mayonnaise = mayonnaise;
        this.cheese = cheese;
        this.salad = salad;
        this.meat1 = meat1;
        this.meat2 = meat2;
        System.out.print("Бургер з подвійним мʼясом: ");
        printComposition();
    }

    private void printComposition() {
        if (this.bun != null){
            System.out.print(this.bun + " ");
        }
        if (this.mayonnaise != null){
            System.out.print(this.mayonnaise + " ");
        }
        if (this.cheese != null){
            System.out.print(this.cheese + " ");
        }
        if (this.salad != null){
            System.out.print(this.salad + " ");
        }
        if (this.meat1 != null){
            System.out.print(this.meat1 + " ");
        }
        if (this.meat2 != null){
            System.out.print(this.meat2 + " ");
        }
    }
}

