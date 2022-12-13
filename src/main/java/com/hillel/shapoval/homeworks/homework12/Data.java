package com.hillel.shapoval.homeworks.homework12;

public class Data {
    private String name;
    private int dayBirth;
    private int monthBirth;
    private int yearBirth;
    private String email;
    private String phone;
    private String surname;
    private int weight;
    private int pressure;
    private int numberSteps;
    private int year = 2020;
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
        this.age = year - yearBirth;
    }

    public void printAccountInfo() {
        System.out.println(toString());
        System.out.println("Вік: " + getAge() + "р.");
    }

    @Override
    public String toString() {
        return "Data{" +
                "name='" + name + '\'' +
                ", dayBirth=" + dayBirth +
                ", monthBirth=" + monthBirth +
                ", yearBirth=" + yearBirth +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", surname='" + surname + '\'' +
                ", weight=" + weight +
                ", pressure=" + pressure +
                ", numberSteps=" + numberSteps +
                ", year=" + year +
                '}';
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
