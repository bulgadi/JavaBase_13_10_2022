package com.hillel.shapoval.homeworks.homework15;



public class Drinks{
   private static final int PRICE_COFFEE = 20;
   private static final int PRICE_TEA = 15;
   private static final int PRICE_LEMONADE = 30;
   private static final int PRICE_MOJITO = 35;
   private static final int PRICE_MINERAL = 10;
   private static final int PRICE_COCA_COLA = 25;




   public static void costCoffee (int number){
      int sum = number  * PRICE_COFFEE;
   }
   static void costTea (int number, Drinks drinks){
      int sum = number * PRICE_TEA;
   }
   static void costLemonade (int number, Drinks drinks){
      int sum = number * PRICE_LEMONADE;
   }
   static void costMojito (int number, Drinks drinks){
      int sum = number * PRICE_MOJITO;
   }
   static void costMineral (int number, Drinks drinks){
      int sum = number * PRICE_MINERAL;
   }
   static void costCocaCola (int number, Drinks drinks){
      int sum = number * PRICE_COCA_COLA;
   }



}
