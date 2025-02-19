package com.core.javacodes.AbstractionConcept;

public class HDFCBank extends Bank{
    @Override
    public void loan() {
        System.out.println("HDFC -- LOAN METHOD");
    }

    public void funds()
    {
        System.out.println("HDFC -- Funds");
    }
}
