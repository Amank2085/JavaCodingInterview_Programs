package com.core.javacodes;

public class StaticBlockQuestions {

    /*
    * Java Static Block Interview Questions:
      Q1. Explain static blocks in Java ?
           ->> A static block (also known as a static initialization block) is a block of code inside a Java class that is executed when the class is first loaded into memory. It's typically used to perform static initializations for the class, such as initializing static variables or executing code that needs to run once regardless of object creation.
      Q2. Similarity and Difference between static block and static method ?
          ->> Similarity:
               * Both static blocks and static methods belong to the class rather than any instance of the class.
               * Both can access static variables directly.
          ->> Difference:
               * Execution Timing: Static blocks execute when the class is loaded, before any object is created and before the main method is called. Static methods can be called explicitly by the user and execute when invoked.
               * Syntax: Static blocks do not have any method signature, while static methods must have a signature (method name and parameters).
      Q3. How can we run a Java program without making any object ?
          ->> You can run a Java program without creating any objects by using static methods. The main method in Java is static, which allows the JVM to call it without instantiating the class.
      Q4. How can we create objects if we make the constructor private ?
          ->> We can create objects with a private constructor using a static block for initialization and a static method for controlled object creation.
      Q5. Is it possible to run a Java program without writing main() method ?
          --> the static block can execute code when the class is loaded, but it does not replace the main() method as the official entry point
      Q6. Can we initialize member variables within static block ?
          --> Static blocks in Java are used to initialize static variables and
              execute code when the class is loaded. However, we cannot directly
              initialize non-static (instance) member variables within a static
              block, because static blocks cannot directly access
              instance-specific data.
           --> Static blocks can only be used to initialize static variables or
               perform static initializations. To initialize non-static member
               variables, we typically use constructors or instance initializer
               blocks.
     */
    

    int age;  //This is an instance variable to store the age.

    //Private constructor
    private StaticBlockQuestions()
    {
        age = 30;
    }

    /*
    Key Points
    Static Block: The static block is used to create an object when
     the class is loaded. However, this is a one-time execution, and
     typically used for initialization.

    Static Method: The createObject method provides a controlled way
    to create an object using the private constructor. It bypasses the
    restriction by creating and returning the object from within the class.
    */

    /*
    This block executes when the class is loaded. It creates an object of
    StaticBlockQuestions using the private constructor and prints
    "static block".
     */
    static {
        StaticBlockQuestions obj1 = new StaticBlockQuestions();
        System.out.println("static block");
        System.exit(0);
    }

    /*
    This method creates an object of StaticBlockQuestions using the
    private constructor, sets the age to 40, and returns the age.
     */
    public static int createObject()
    {
        StaticBlockQuestions obj1 = new StaticBlockQuestions();
        obj1.age = 40;
        return  obj1.age;
    }

    public static void test()
    {
        System.out.println("testing method");
    }
    public static  void  cover()
    {
        System.out.println("cover method");
    }

    public static void main(String[] args) {
        System.out.println("main method");
        test();
        cover();
    }
}
