package com.company;

public class Account {

    private static String name;
    private static int balance;

    public void deposit (int amount){
     int newBalance = amount + balance;
     setAmount(newBalance);
     // balance += amount
    }

    public String getName (){
        return name;
    }

    public int getBalance () {
        return balance;
    }

    public void setAmount (int amount){
        balance = amount;
    }

    public int getAmount() {
        return balance;
    }

    public void setName(String name){
        this.name = name ;
    }
}
