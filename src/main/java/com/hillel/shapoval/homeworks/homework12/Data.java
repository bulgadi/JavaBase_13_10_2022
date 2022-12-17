package com.hillel.shapoval.homeworks.homework12;

public class Data {
    private static final int YEAR = 2020;
    private final String name;
    private final int dayBirth;
    private final int monthBirth;
    private final int yearBirth;
    private final String email;
    private final String phone;
    private String surname;
    private int weight;
    private int pressure;
    private int numberSteps;
    private int age;

    public Data(String name, int dayBirth, int monthBirth, int yearBirth, String email, String phone, String surname,
                int weight, int pressure, int numberSteps) {
        this.name = name;
        this.dayBirth = dayBirth;
        this.monthBirth = monthBirth;
        this.yearBirth = yearBirth;
        this.email = email;
        this.phone = phone;
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.numberSteps = numberSteps;
        this.age = YEAR - yearBirth;
    }

    public void printAccountInfo() {
        System.out.println("Iмʼя: " + getName() + " " +
                "Прізвище: " + surname + "\n" +
                "Дата народження: " + getDayBirth() + "." + getMonthBirth() + "." + getYearBirth() + "\n" +
                "Емейл: " + getEmail() + "\n" +
                "Телефон: " + getPhone() + "\n" +
                "Вага: " + weight + "\n" +
                "Тиск: " + pressure + "\n" +
                "К-ть кроів за день: " + numberSteps);
        System.out.println("Вік: " + getAge() + "р.");
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public int getDayBirth() {
        return dayBirth;
    }

    public int getMonthBirth() {
        return monthBirth;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public void setNumberSteps(int numberSteps) {
        this.numberSteps = numberSteps;
    }
}
