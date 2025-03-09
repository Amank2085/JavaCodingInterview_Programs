package com.core.javacodes;

public class TestStaticBlockQuestion {
    public static void main(String[] args) {

        /*
        Important: The following line in TestStaticBlockQuestion class
         will cause a compilation error due to private constructor access
         restriction:
        */

        //StaticBlockQuestions obj = new StaticBlockQuestions();

        //This line calls the createObject method to create an object,
        // set the age to 40, and print the age.
        int age = StaticBlockQuestions.createObject();
        System.out.println(age);


    }
}
