package com.core.javacodes;

public class StaticblockWithFinalKeyword {

    public static void main(String[] args) {
        System.out.println(Main.CONSTANT);  // Accessing com.core.javacodes.Main.CONSTANT
    }
}

class Main {
    static final int CONSTANT = 10;

    static {
        System.out.println("Static block executed with final variable: " + CONSTANT);
    }
}

/*
      When you run the main method in the Test class, it prints com.core.javacodes.Main.CONSTANT as a string,
      not as a reference to the com.core.javacodes.Main class' CONSTANT field.
      The com.core.javacodes.Main class is not loaded because its members are not actually being used.

      But if you remove final static block will be executed.
 */
