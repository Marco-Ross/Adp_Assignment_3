package com.marco.assignment3part1;

public class MainDriver {
    private Person person = new Person();
    private Person person1;
    private Person person2;

    private void createPerson(){
        person1= new Person("marco","ross",25,2012);
        person2 = new Person("lee","ann",50,1986);
    }

    private String nameSurname(){
       return person1.getName() + " " + person1.getSurname() + "\n" +
              person2.getName() + " " + person2.getSurname();
    }

    public static void main(String[] args) {
        MainDriver mainDriver = new MainDriver();
        mainDriver.createPerson();
        System.out.println(mainDriver.nameSurname());
    }
}
