# Java Cheatsheet

Welcome to the Java Cheatsheet! This document contains essential notes and snippets that will help you quickly reference Java programming concepts.

Sure! Here's the Table of Contents in the right order with the subtopics nested under their respective topics:

## Table of Contents
1. [Basic Syntax](#basic-syntax)
2. [Data Types](#data-types)
3. [Operators](#operators)
4. [Control Statements](#control-statements)
5. [Loops](#loops)
6. [Methods](#methods)
7. [Object-Oriented Programming (OOP)](#object-oriented-programming-oop)
   - [Classes](#classes)
   - [Objects](#objects)
   - [Inheritance](#inheritance)
   - [Polymorphism](#polymorphism)
   - [Abstraction](#abstraction)
   - [Encapsulation](#encapsulation)
8. [Exception Handling](#exception-handling)
   - [Try-Catch Block](#try-catch-block)
   - [Throw and Throws](#throw-and-throws)
   - [Custom Exceptions](#custom-exceptions)
9. [Collections](#collections)
   - [Introduction to Collections](#introduction-to-collections)
   - [List](#list)
     - [ArrayList](#arraylist)
     - [LinkedList](#linkedlist)
     - [Vector](#vector)
     - [Stack](#stack)
   - [Set](#set)
     - [HashSet](#hashset)
     - [LinkedHashSet](#linkedhashset)
     - [TreeSet](#treeset)
   - [Queue](#queue)
     - [PriorityQueue](#priorityqueue)
     - [Deque](#deque)
       - [ArrayDeque](#arraydeque)
       - [LinkedList](#linkedlist-queue)
   - [Map](#map)
     - [HashMap](#hashmap)
     - [LinkedHashMap](#linkedhashmap)
     - [TreeMap](#treemap)
     - [Hashtable](#hashtable)
   - [CopyOnWriteArrayList](#copyonwritearraylist)
   - [CopyOnWriteArraySet](#copyonwritearrayset)
   - [ConcurrentSkipListMap](#concurrentskiplistmap)
   - [SortedMap and NavigableMap](#sortedmap-and-navigablemap)
     - [SortedMap Interface](#sortedmap-interface)
     - [NavigableMap Interface](#navigablemap-interface)
   - [Collections Utility Class](#collections-utility-class)
     - [Sorting](#sorting)
     - [Shuffling](#shuffling)
     - [Reverse](#reverse)
     - [Synchronized Collections](#synchronized-collections)
10. [File I/O](#file-io)
   - [Reading Files](#reading-files)
   - [Writing Files](#writing-files)
11. [Concurrency](#concurrency)
   - [Threads](#threads)
   - [Synchronization](#synchronization)
   - [Executor Service](#executor-service)
   - [Concurrent Collections](#concurrent-collections)
12. [Lambda Expressions](#lambda-expressions)
   - [Syntax](#syntax)
   - [Functional Interfaces](#functional-interfaces)
13. [Streams](#streams)
   - [Stream Operations](#stream-operations)
   - [Intermediate Operations](#intermediate-operations)
   - [Terminal Operations](#terminal-operations)
14. [Parallel Stream](#parallel-stream)
15. [Collectors](#collectors)
   - [Collectors Methods](#collectors-methods)
   - [Joining](#joining)
   - [GroupingBy](#groupingby)
   - [PartitioningBy](#partitioningby)
17. [Primitive Streams](#primitive-streams)
   - [IntStream](#intstream)
   - [LongStream](#longstream)
   - [DoubleStream](#doublestream)
18. [Generics](#generics)
   - [Generic Classes](#generic-classes)
   - [Bounded Types](#bounded-types)
   - [Wildcard](#wildcard)
19. [Annotations](#annotations)
   - [Built-in Annotations](#built-in-annotations)
   - [Custom Annotations](#custom-annotations)
20. [Wrapper Classes](#wrapper-classes)
21. [Comparator and Comparable](#comparator-and-comparable)
   - [Comparator Interface](#comparator-interface)
   - [Comparable Interface](#comparable-interface)
22. [Functional Interfaces](#functional-interfaces)
   - [Predicate](#predicate)
   - [Function](#function)
   - [Consumer](#consumer)
   - [Supplier](#supplier)

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

## Wrapper Classes
Wrapper classes provide a way to use primitive data types (such as `int`, `boolean`, etc.) as objects. These classes are part of the `java.lang` package.

### Primitive Data Types and Their Corresponding Wrapper Classes
- **byte** -> **Byte**
- **short** -> **Short**
- **int** -> **Integer**
- **long** -> **Long**
- **float** -> **Float**
- **double** -> **Double**
- **char** -> **Character**
- **boolean** -> **Boolean**

### Autoboxing and Unboxing
Autoboxing is the automatic conversion of primitive types to their corresponding wrapper classes. Unboxing is the reverse process.

#### Example
```java
public class WrapperExample {
    public static void main(String[] args) {
        // Autoboxing
        int num = 5;
        Integer wrappedNum = num; // Primitive int to Integer object

        // Unboxing
        Integer anotherNum = new Integer(10);
        int unwrappedNum = anotherNum; // Integer object to primitive int

        System.out.println("Wrapped Number:
