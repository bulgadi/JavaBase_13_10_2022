package com.hillel.shapoval.homeworks.homework10;

public class Person {
    public static void main(String[] args) {
        String person1 = personInfo("Dima", "Shapoval", "Kyiv", "345678");
        String person2 = personInfo("Kate", "Bortson", "Miami", "456789567");
        String person3 = personInfo("Bob", "Partson", "Washington", "23456789");

        System.out.println("a." + person1 + "\n" + "b." + person2 + "\n" + "c." + person3);

    }

    static String personInfo(String name, String surname, String сity, String number){
        String result = "Зателефонувати громадянину " + name + " " + surname +
                " із міста " + сity + " можна за номером " + number;
        return result;
    }
}
