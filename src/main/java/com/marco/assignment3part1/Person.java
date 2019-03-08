package com.marco.assignment3part1;

public class Person {
    private String name;
    private String surname;
    private int age;
    private int matriculated;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String surname, int age, int matriculated) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.matriculated = matriculated;
    }

    public String nameSurname(String name, String surname){
        this.name = name;
        this.surname = surname;
        return name + " " + surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getMatriculated() {
        return matriculated;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMatriculated(int matriculated) {
        this.matriculated = matriculated;
    }
}

