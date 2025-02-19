package com.core.javacodes.AbstractionConcept;

public abstract class Bank {

    int amt = 100;
    final  int rate = 10;
    static int loanRate = 5;

    // partial abstraction
    //hiding the implementation logic -- is called Abstraction
    //Abstract class can have abs methods as well non abs methods
    //cannot create object of abstract class

    public abstract  void loan(); //abstract method -- no method body

    //non abstract methods
    public void credit()
    {
        System.out.println("Bank -- Credit");
    }

    public void debit()
    {
        System.out.println("Bank -- debit");
    }
}
