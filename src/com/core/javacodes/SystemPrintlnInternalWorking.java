package com.core.javacodes;

public class SystemPrintlnInternalWorking {

    /*
    `System.out.println` works in following Steps internally in Java:

     1.) Out is the static variable of type PrintStream
        class present in the System class.
          public static final PrintStream out = null;
           (but it is not giving null pointer exception when called because it gets re-assigned later)
     2.) During the JVM initialization process, the setOut method is
         called. This method internally calls setOut0(out).
     3.) "setOut0" is a native method .Native methods are implemented
         in a language other than Java, typically C or C++.It will go
         to System.C(part of JRE)
         and with the help of JNICALL(Java Native interface api),
         this "out" variable will be initialized.
      4.) println() is the method present in the PrintStream class
      5.) So, we need to call the println() method that was present in
          PrintStream class. And we can call this using the output object
          that is present in the System class.

          +---------------------+        +---------------------+
          | System Class        |        | PrintStream Class   |
          |---------------------|        |---------------------|
          | public static final |        | +-------------+     |
          | PrintStream out =   |        | | println()   |     |
          | null;               |        | +-------------+     |
          +---------------------+        +-------+-------------+
                 |                            |
                 v                            v
          +-------------------------------------------+
          | JVM Initialization                        |
          | 1. JVM calls setOut()                     |
          | 2. setOut() calls setOut0(out)            |
          | 3. setOut0(out) initializes 'out'         |
          |    using JNICALL (JNI)                    |
          |                                           |
          +-------------------------------------------+
                 |                            |
                 v                            v
          +-------+-----------------------------+
          | System.out                          |
          | (PrintStream initialized to console)|
          +-------+-----------------------------+
                 |
                 v
          +-------------+
          | Console     |
          +-------------+


    */
    public static void main(String[] args) {
        System.out.println("Hello World!!");
    }
}
