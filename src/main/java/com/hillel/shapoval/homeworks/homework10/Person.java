package com.hillel.shapoval.homeworks.homework10;

public class Person {
    public static void main(String[] args) {


        String address = personInfo("Dima", "Shapoval", "Kyiv", "345678");

        System.out.println(address);



    }

    static String personInfo(String name1, String surname1, String sity1, String number1){



        String address = "Зателефонувати громадянину " + name1 + " " + surname1 +
                " із міста " + sity1 + " можна за номером " + number1;
        return address;



    }
}
