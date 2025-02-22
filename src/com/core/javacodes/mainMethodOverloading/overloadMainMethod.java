package com.core.javacodes.mainMethodOverloading;

public class overloadMainMethod {

    // JVM will fetch -- main (String args[]) -- public static void
    public static void main(String[] args) {
        System.out.println("main method");

        //ways to call overloaded method
        main(2);
        main("testing");
    }

    public static void main(int a) {
        System.out.println("Main method overloaded");
    }

    public static void main(String args) {
        System.out.println("Main method overloaded again");
    }

//    t2()
//    t2(int a)
//    t2(int a , int b)
}

