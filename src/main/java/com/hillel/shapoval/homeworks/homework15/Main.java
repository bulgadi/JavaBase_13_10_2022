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


        Drinks.scannerQuantity();








        switch (drinksType){
            case TEA: {




            }
            case COFFEE: {
                Drinks.costCoffee();
            }
            case MOJITO:{

            }
            case MINERAL:{

            }
            case LEMONADE:{

            }
            case COCA_COLA:{

            }
        }



    }

}
