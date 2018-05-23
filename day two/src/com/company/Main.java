package com.company;

public class Main {

    public static void main(String[] args) {
	  Person Ameira = new Person("Ameira","Hassoun",24,"irbid",1994,"Syrian","Homs",66,164,false );
        System.out.println(Ameira.getInfo());
        Ameira.eating();
        System.out.println(Ameira.getInfo());
        System.out.println(Ameira.getCounter());
        Person mais = new Person("mais","muhtaseb",24,"irbid",1994,"Syrian","Homs",66,164,false );
        System.out.println(mais.getCounter());
    }


}
