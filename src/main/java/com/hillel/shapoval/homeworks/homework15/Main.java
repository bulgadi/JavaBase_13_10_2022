package com.hillel.shapoval.homeworks.homework15;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        runMachine();
    }

    static void runMachine(){

        DrinksMachine[] drinksMachines = DrinksMachine.values();
        DrinksMachine drinksType = null;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, choose a drink:" + Arrays.toString(drinksMachines));

        while (true){
             String userValue = scanner.nextLine().toUpperCase();
            for (DrinksMachine drinksMachine: drinksMachines) {
                if(userValue.equals(drinksMachine.toString())){
                    drinksType = DrinksMachine.valueOf(userValue);
                    System.out.println("You chose: " + drinksType);
                    break;
                }
            }
             if (drinksType != null){
                 break;
             }else {
                 System.out.println("Wrong data. Try again.");
             }
        }

        int quantity = -1;

        while (true){
            System.out.println("Please, specify the quantity of drinks");
            if (scanner.hasNextInt()){
                quantity = scanner.nextInt();

                if (quantity>= 0){
                    break;
                } else {
                    System.out.println("Please enter a positive quantity");
                }
            } else {
                System.out.println("Wrong data. Try again.");
                scanner.nextLine();
            }
        }

        switch (drinksType){
            case TEA: {
                System.out.println("\n" + "The quantity of selected tea: " + quantity);
                Drinks.costTea(quantity);
                break;
            }
            case COFFEE: {
                System.out.println("\n" + "The quantity of selected coffee: " + quantity);
                Drinks.costCoffee(quantity);
                break;
            }
            case MOJITO: {
                System.out.println("\n" + "The quantity of selected mojito: " + quantity);
                Drinks.costMojito(quantity);
                break;
            }
            case MINERAL: {
                System.out.println("\n" + "The quantity of selected mineral: " + quantity);
                Drinks.costMineral(quantity);
                break;
            }
            case LEMONADE: {
                System.out.println("\n" + "The quantity of selected lemonade: " + quantity);
                Drinks.costLemonade(quantity);
                break;
            }
            case COCA_COLA: {
                System.out.println("\n" + "The quantity of selected Coca Cola: " + quantity);
                Drinks.costCocaCola(quantity);
                break;
            }
        }
    }
}