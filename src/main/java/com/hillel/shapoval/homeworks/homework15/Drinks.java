package com.hillel.shapoval.homeworks.homework15;

public class Drinks{
   private static final int PRICE_COFFEE = 20;
   private static final int PRICE_TEA = 15;
   private static final int PRICE_LEMONADE = 30;
   private static final int PRICE_MOJITO = 35;
   private static final int PRICE_MINERAL = 10;
   private static final int PRICE_COCA_COLA = 25;


   static void costCoffee(int quantity) {
      int sum = quantity * PRICE_COFFEE;
      System.out.println("The total cost: " + sum + "$");
   }

   static void costTea(int quantity) {
      int sum = quantity * PRICE_TEA;
      System.out.println("The total cost: " + sum + "$");
   }

   static void costLemonade(int quantity) {
      int sum = quantity * PRICE_LEMONADE;
      System.out.println("The total cost: " + sum + "$");
   }

   static void costMojito(int quantity) {
      int sum = quantity * PRICE_MOJITO;
      System.out.println("The total cost: " + sum + "$");
   }

   static void costMineral(int quantity) {
      int sum = quantity * PRICE_MINERAL;
      System.out.println("The total cost: " + sum + "$");
   }

   static void costCocaCola(int quantity) {
      int sum = quantity * PRICE_COCA_COLA;
      System.out.println("The total cost: " + sum + "$");
   }




















}
