package com.company;

public class CheckingAccount extends Account {

    public CheckingAccount(int val){
     setAmount(val);
    }

    public void withdraw (int amount){
        int newBalance = (int) (getBalance() - amount);
        setAmount(newBalance);
    }
}