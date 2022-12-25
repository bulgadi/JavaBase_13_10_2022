package com.hillel.shapoval.homeworks.homework15;


import java.util.Scanner;

public class Drinks{
   private static final int PRICE_COFFEE = 20;
   private static final int PRICE_TEA = 15;
   private static final int PRICE_LEMONADE = 30;
   private static final int PRICE_MOJITO = 35;
   private static final int PRICE_MINERAL = 10;
   private static final int PRICE_COCA_COLA = 25;


   public static void costCoffee (int quantity){

      int sum = quantity * PRICE_COFFEE;
      System.out.println(sum);
   }
   static void costTea (int quantity, Drinks drinks){
      int sum = quantity * PRICE_TEA;
   }
   static void costLemonade (int quantity, Drinks drinks){
      int sum = quantity * PRICE_LEMONADE;
   }
   static void costMojito (int quantity, Drinks drinks){
      int sum = quantity * PRICE_MOJITO;
   }
   static void costMineral (int quantity, Drinks drinks){
      int sum = quantity * PRICE_MINERAL;
   }
   static void costCocaCola (int quantity, Drinks drinks){
      int sum = quantity * PRICE_COCA_COLA;
   }




















}
