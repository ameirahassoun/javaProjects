package com.company;

public class Person {
    private static int counter = 0;
    private String  firstName;
    private String lastName;
    private int Age;
    private String address;
    private int dateOfBirth;
    private String nationality;
    private String city ;
    private int weight;
    private int height;
    private boolean isMale;

    public Person (){

    }

    public Person (String  firstName,String lastName, int Age, String address,int dateOfBirth,String nationality,String city,int weight,int height,boolean isMale ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.Age  = Age;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.nationality = nationality;
        this.city = city;
        this.weight = weight;
        this.height = height;
        this.isMale = isMale;
        this.counter++;
    }

    public String getFullName(){
        return this.firstName+" "+this.lastName;
    }

    public double getHeightInFeet(){
        return this.height/3.2;
    }

    public int getAge(){
        return this.Age;
    }

    public void eating(){
        System.out.println("I'm eating");
        this.weight++;
    }

    public int getCounter(){
        return this.counter;
    }

    public String getInfo(){
        String info = "Name: "          +getFullName()
                + "\nAge: "             + Age
                + "\nAddress"           + address
                + "\nDate of Birth: "   + dateOfBirth
                + "\nNationality: "     + nationality
                + "\nCity: "            + city
                + "\nWeight: "          + weight
                + "\nHeight: "          + height
                + "\nGendre: "          + ((isMale == true) ?("Male"):("Female"));
      return info;
    }


}
