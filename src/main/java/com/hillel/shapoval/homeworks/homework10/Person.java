package com.hillel.shapoval.homeworks.homework10;

public class Person {
    public static void main(String[] args) {
        String address1 = personInfo("Dima", "Shapoval", "Kyiv", "345678");


        String address2 = personInfo("Rfdjhf", "Shapoval", "Kyiv", "345678");


        String address3 = personInfo("wgjedhfb", "Shapoval", "Kyiv", "345678");

        System.out.println(address1);
        System.out.println(address2);
        System.out.println(address3);

    }

    static String personInfo(String name1, String surname1, String сity1, String number1){
        String address1 = "Зателефонувати громадянину " + name1 + " " + surname1 +
                " із міста " + сity1 + " можна за номером " + number1;

//        String address2 = "Зателефонувати громадянину " + name1 + " " + surname1 +
//                " із міста " + сity1 + " можна за номером " + number1;
//
//        String address3 = "Зателефонувати громадянину " + name1 + " " + surname1 +
//                " із міста " + сity1 + " можна за номером " + number1;
        return address1;


    }
}
