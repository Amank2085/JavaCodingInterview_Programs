# Java Cheatsheet

Welcome to the Java Cheatsheet! This document contains essential notes and snippets that will help you quickly reference Java programming concepts.

## Table of Contents
1. [Basic Syntax](#basic-syntax)
2. [Data Types](#data-types)
3. [Operators](#operators)
4. [Control Statements](#control-statements)
5. [Loops](#loops)
6. [Methods](#methods)
7. [Object-Oriented Programming (OOP)](#object-oriented-programming-oop)
8. [Exception Handling](#exception-handling)
9. [Collections](#collections)
10. [File I/O](#file-io)
11. [Concurrency](#concurrency)
12. [Lambda Expressions](#lambda-expressions)
13. [Streams](#streams)
14. [Generics](#generics)
15. [Annotations](#annotations)

## Basic Syntax
Java programs are composed of classes and methods. The `main` method is the entry point for any Java application.

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

## Data Types
Java has both primitive and non-primitive data types.

### Primitive Data Types
- **byte**: 8-bit integer
- **short**: 16-bit integer
- **int**: 32-bit integer
- **long**: 64-bit integer
- **float**: Single-precision floating-point
- **double**: Double-precision floating-point
- **char**: Single 16-bit Unicode character
- **boolean**: `true` or `false`

### Non-Primitive Data Types
- **String**
- **Arrays**
- **Classes**
- **Interfaces**

## Operators
### Arithmetic Operators
- Addition: `+`
- Subtraction: `-`
- Multiplication: `*`
- Division: `/`
- Modulus: `%`

### Relational Operators
- Equal to: `==`
- Not equal to: `!=`
- Greater than: `>`
- Less than: `<`
- Greater than or equal to: `>=`
- Less than or equal to: `<=`

### Logical Operators
- AND: `&&`
- OR: `||`
- NOT: `!`

### Assignment Operators
- Assignment: `=`
- Addition assignment: `+=`
- Subtraction assignment: `-=`
- Multiplication assignment: `*=`
- Division assignment: `/=`
- Modulus assignment: `%=`

## Control Statements
Control statements allow you to control the flow of execution in your programs.

### If-Else Statement
```java
if (condition) {
    // code block
} else if (anotherCondition) {
    // code block
} else {
    // code block
}
```

### Switch Statement
```java
switch (variable) {
    case value1:
        // code block
        break;
    case value2:
        // code block
        break;
    default:
        // code block
        break;
}
```

## Loops
Loops are used to execute a block of code repeatedly.

### For Loop
```java
for (int i = 0; i < 10; i++) {
    System.out.println(i);
}
```

### While Loop
```java
int i = 0;
while (i < 10) {
    System.out.println(i);
    i++;
}
```

### Do-While Loop
```java
int i = 0;
do {
    System.out.println(i);
    i++;
} while (i < 10);
```

## Methods
Methods are blocks of code that perform a specific task.

### Method Definition
```java
public int add(int a, int b) {
    return a + b;
}
```

### Method Call
```java
int result = add(5, 3);
```

## Object-Oriented Programming (OOP)
Java is an object-oriented programming language, which means it supports concepts like inheritance, encapsulation, and polymorphism.

### Class Definition
```java
public class Car {
    // Fields
    private String color;
    private String model;

    // Constructor
    public Car(String color, String model) {
        this.color = color;
        this.model = model;
    }

    // Method
    public void displayInfo() {
        System.out.println("Car color: " + color + ", model: " + model);
    }
}

// Object Creation
Car myCar = new Car("Red", "Toyota");
myCar.displayInfo();
```

## Exception Handling
Exception handling allows you to handle runtime errors in your programs.

```java
try {
    // code that may throw an exception
} catch (ExceptionType e) {
    // code to handle the exception
} finally {
    // code that will always execute
}
```

## Collections
Collections framework provides various classes and interfaces for working with groups of objects.

### List Example
```java
import java.util.*;

List<String> list = new ArrayList<>();
list.add("item1");
list.add("item2");
```

### Set Example
```java
import java.util.*;

Set<String> set = new HashSet<>();
set.add("item1");
set.add("item2");
```

### Map Example
```java
import java.util.*;

Map<String, String> map = new HashMap<>();
map.put("key1", "value1");
map.put("key2", "value2");
```

## File I/O
File I/O allows you to read from and write to files.

### Reading from a file
```java
import java.io.*;

try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
    String line;
    while ((line = reader.readLine()) != null) {
        System.out.println(line);
    }
} catch (IOException e) {
    e.printStackTrace();
}
```

### Writing to a file
```java
import java.io.*;

try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
    writer.write("Hello, World!");
} catch (IOException e) {
    e.printStackTrace();
}
```

## Concurrency
Concurrency allows you to execute multiple threads simultaneously.

### Creating a thread by extending Thread class
```java
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }
}
MyThread thread = new MyThread();
thread.start();
```

### Creating a thread by implementing Runnable interface
```java
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is running...");
    }
}
Thread thread = new Thread(new MyRunnable());
thread.start();
```

## Lambda Expressions
Lambda expressions provide a clear and concise way to implement single-method interfaces.

```java
interface MathOperation {
    int operation(int a, int b);
}

MathOperation addition = (int a, int b) -> a + b;
System.out.println("10 + 5 = " + addition.operation(10, 5));
```

## Streams
Streams provide a modern way to process sequences of elements.

### Creating a Stream
```java
import java.util.*;
import java.util.stream.*;

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
Stream<Integer> stream = numbers.stream();
```

### Filtering and Mapping
```java
List<String> strings = Arrays.asList("apple", "banana", "cherry");
List<String> filteredList = strings.stream()
                                    .filter(s -> s.startsWith("a"))
                                    .collect(Collectors.toList());
System.out.println(filteredList); // Output: [apple]
```

## Generics
Generics enable types (classes and interfaces) to be parameters when defining classes, interfaces, and methods.

### Generic Class
```java
public class Box<T> {
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}
Box<Integer> integerBox = new Box<>();
integerBox.set(10);
System.out.println(integerBox.get()); // Output: 10
```

## Annotations
Annotations provide metadata about the program.

### Built-in Annotations
- `@Override`
- `@Deprecated`
- `@SuppressWarnings`

### Custom Annotation
```java
@interface MyAnnotation {
    String value();
}

@MyAnnotation(value = "Hello")
public class MyClass {
    // Class body
}
```
```

### Topic-wise coding problems for interview preparation:

Table of Contents :

Arrays
Strings
Linked Lists
Stacks and Queues
Trees
Graphs
Sorting and Searching
Dynamic Programming
Recursion
Backtracking
Bit Manipulation

Arrays
Find the maximum subarray sum using Kadane's Algorithm.

Rotate an array by k positions.

Merge two sorted arrays without using extra space.

Find the missing number in an array of integers from 1 to n.

Find the longest consecutive subsequence in an array.

Strings
Reverse a string without using extra space.

Check if two strings are anagrams.

Find the longest common prefix among a set of strings.

Implement the KMP algorithm for pattern matching.

Find the longest palindromic substring in a string.

Linked Lists
Reverse a singly linked list.

Detect a cycle in a linked list and find the starting node.

Merge two sorted linked lists.

Find the intersection point of two linked lists.

Remove duplicates from an unsorted linked list.

Stacks and Queues
Implement a stack using two queues.

Implement a queue using two stacks.

Evaluate a postfix expression using a stack.

Find the next greater element for each element in an array.

Implement a circular queue.

Trees
Find the height of a binary tree.

Perform a level order traversal of a binary tree.

Check if two binary trees are identical.

Find the lowest common ancestor of two nodes in a binary tree.

Serialize and deserialize a binary tree.

Graphs
Perform a breadth-first search (BFS) of a graph.

Perform a depth-first search (DFS) of a graph.

Find the shortest path in an unweighted graph using BFS.

Detect a cycle in an undirected graph.

Implement Dijkstra's algorithm for finding the shortest path in a weighted graph.

Sorting and Searching
Implement the quicksort algorithm.

Implement the mergesort algorithm.

Find the k-th smallest element in an unsorted array.

Perform a binary search on a sorted array.

Count the number of inversions in an array using a modified mergesort.

Dynamic Programming
Find the nth Fibonacci number using dynamic programming.

Solve the 0/1 knapsack problem using dynamic programming.

Find the longest increasing subsequence in an array.

Solve the edit distance problem using dynamic programming.

Find the maximum profit in a stock buy and sell problem.

Recursion
Solve the Tower of Hanoi problem.

Generate all subsets of a given set.

Solve the N-Queens problem.

Find the nth Catalan number using recursion.

Generate all permutations of a string.

Backtracking
Solve the Sudoku puzzle.

Find all possible combinations of k numbers that add up to a target sum.

Solve the Rat in a Maze problem.

Generate all valid parenthesis combinations for a given number of pairs.

Find all Hamiltonian paths in a graph.

Bit Manipulation
Find the single non-repeating element in an array of pairs.

Count the number of set bits in an integer.

Find the two non-repeating elements in an array of pairs.

Reverse the bits of a given integer.

Check if a number is a power of two using bit manipulation.
