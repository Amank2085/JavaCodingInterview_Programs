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

# Topic-wise Coding Problems for Interview Preparation

## Table of Contents
1. [Arrays](#arrays)
2. [Strings](#strings)
3. [Linked Lists](#linked-lists)
4. [Stacks and Queues](#stacks-and-queues)
5. [Trees](#trees)
6. [Graphs](#graphs)
7. [Sorting and Searching](#sorting-and-searching)
8. [Dynamic Programming](#dynamic-programming)
9. [Recursion](#recursion)
10. [Backtracking](#backtracking)
11. [Bit Manipulation](#bit-manipulation)

## Arrays
1. [Find the maximum subarray sum using Kadane's Algorithm.](#)
2. [Rotate an array by k positions.](#)
3. [Merge two sorted arrays without using extra space.](#)
4. [Find the missing number in an array of integers from 1 to n.](#)
5. [Find the longest consecutive subsequence in an array.](#)

## Strings
1. [Reverse a string without using extra space.](#)
2. [Check if two strings are anagrams.](#)
3. [Find the longest common prefix among a set of strings.](#)
4. [Implement the KMP algorithm for pattern matching.](#)
5. [Find the longest palindromic substring in a string.](#)

## Linked Lists
1. [Reverse a singly linked list.](#)
2. [Detect a cycle in a linked list and find the starting node.](#)
3. [Merge two sorted linked lists.](#)
4. [Find the intersection point of two linked lists.](#)
5. [Remove duplicates from an unsorted linked list.](#)

## Stacks and Queues
1. [Implement a stack using two queues.](#)
2. [Implement a queue using two stacks.](#)
3. [Evaluate a postfix expression using a stack.](#)
4. [Find the next greater element for each element in an array.](#)
5. [Implement a circular queue.](#)

## Trees
1. [Find the height of a binary tree.](#)
2. [Perform a level order traversal of a binary tree.](#)
3. [Check if two binary trees are identical.](#)
4. [Find the lowest common ancestor of two nodes in a binary tree.](#)
5. [Serialize and deserialize a binary tree.](#)

## Graphs
1. [Perform a breadth-first search (BFS) of a graph.](#)
2. [Perform a depth-first search (DFS) of a graph.](#)
3. [Find the shortest path in an unweighted graph using BFS.](#)
4. [Detect a cycle in an undirected graph.](#)
5. [Implement Dijkstra's algorithm for finding the shortest path in a weighted graph.](#)

## Sorting and Searching
1. [Implement the quicksort algorithm.](#)
2. [Implement the mergesort algorithm.](#)
3. [Find the k-th smallest element in an unsorted array.](#)
4. [Perform a binary search on a sorted array.](#)
5. [Count the number of inversions in an array using a modified mergesort.](#)

## Dynamic Programming
1. [Find the nth Fibonacci number using dynamic programming.](#)
2. [Solve the 0/1 knapsack problem using dynamic programming.](#)
3. [Find the longest increasing subsequence in an array.](#)
4. [Solve the edit distance problem using dynamic programming.](#)
5. [Find the maximum profit in a stock buy and sell problem.](#)

## Recursion
1. [Solve the Tower of Hanoi problem.](#)
2. [Generate all subsets of a given set.](#)
3. [Solve the N-Queens problem.](#)
4. [Find the nth Catalan number using recursion.](#)
5. [Generate all permutations of a string.](#)

## Backtracking
1. [Solve the Sudoku puzzle.](#)
2. [Find all possible combinations of k numbers that add up to a target sum.](#)
3. [Solve the Rat in a Maze problem.](#)
4. [Generate all valid parenthesis combinations for a given number of pairs.](#)
5. [Find all Hamiltonian paths in a graph.](#)

## Bit Manipulation
1. [Find the single non-repeating element in an array of pairs.](#)
2. [Count the number of set bits in an integer.](#)
3. [Find the two non-repeating elements in an array of pairs.](#)
4. [Reverse the bits of a given integer.](#)
5. [Check if a number is a power of two using bit manipulation.](#)
