package com.core.javacodes.AbstractionConcept;

public class TestBank {
    public static void main(String[] args) {
        HDFCBank hb = new HDFCBank();
        hb.credit();
        hb.debit();
        hb.loan();
        hb.funds();

        Bank b = new  HDFCBank();
        b.loan();
        b.credit();
        b.debit();
//        b.funds(); --> can't be accessed

//        Bank b = new Bank() ; // cannot create object of abstract class

    }
}
