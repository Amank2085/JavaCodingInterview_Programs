package com.core.javacodes.AbstractionConcept;

public interface Car {
    //only final and static variables
    int wheels = 4; // by default it is final and static

    //always define only abstract methods
    //no method body
    //only method declaration
    //we achieve 100% abstraction
    //cannot create object of interface

    public  void start();
    public void stop();
    public void refuel();
}
