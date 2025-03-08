public class StaticblockWithFinalKeyword {

    public static void main(String[] args) {
        System.out.println(Main.CONSTANT);  // Accessing Main.CONSTANT
    }
}

class Main {
    static final int CONSTANT = 10;

    static {
        System.out.println("Static block executed with final variable: " + CONSTANT);
    }
}

/*
      When you run the main method in the Test class, it prints Main.CONSTANT as a string,
      not as a reference to the Main class' CONSTANT field.
      The Main class is not loaded because its members are not actually being used.

      But if you remove final static block will be executed.
 */
