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
   - [Classes and Objects](#classes-and-objects)
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

# Object-Oriented Programming (OOP) Concepts

## Classes and Objects
- **Class**: A blueprint for creating objects. It defines properties and behaviors.
- **Object**: An instance of a class. It has state and behavior.

```java
class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void makeSound() {
        System.out.println("Some sound");
    }
}

Animal dog = new Animal("Buddy", 5);
dog.makeSound();
```

## Inheritance
- **Inheritance**: A mechanism where one class acquires the properties and behaviors of a parent class.

```java
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}

Dog dog = new Dog();
dog.eat();
dog.bark();
```

## Polymorphism
- **Polymorphism**: The ability of different objects to respond to the same method in different ways.

```java
class Animal {
    void makeSound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark");
    }
}

Animal myDog = new Dog();
myDog.makeSound();  // Outputs: Bark
```

## Abstraction
- **Abstraction**: Hiding the implementation details and showing only the functionality.

```java
abstract class Animal {
    abstract void makeSound();

    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark");
    }
}

Dog dog = new Dog();
dog.makeSound();
dog.eat();
```

## Encapsulation
- **Encapsulation**: Wrapping data (variables) and code (methods) together as a single unit. It restricts direct access to some of an object's components.

```java
class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

Person person = new Person();
person.setName("Alice");
System.out.println(person.getName());
```

## Exception Handling in Java

#### What is Exception Handling?
- **Exception:** An event that disrupts the normal flow of a program.
- **Exception Handling:** Mechanism to handle runtime errors to maintain normal program flow.

#### Why Do We Need Exception Handling?
- **Error Detection:** Identifies errors during execution.
- **Error Handling:** Provides a way to respond to various error conditions.
- **Program Continuity:** Ensures the program doesn’t crash and continues to operate smoothly.
- **Resource Management:** Helps in proper resource management like closing files, releasing memory, etc.

#### Try-Catch Block
- **Try Block:** Encloses code that might throw exceptions.
- **Catch Block:** Handles exceptions thrown by the try block.
```java
try {
    // Code that may throw an exception
} catch (ExceptionType e) {
    // Handle exception
}
```

#### Throw and Throws
- **Throw:** Used to explicitly throw an exception.
- **Throws:** Declares exceptions that a method can throw.
```java
// Throw example
if (someCondition) {
    throw new ExceptionType("Error message");
}

// Throws example
public void myMethod() throws ExceptionType {
    // Method logic
}
```

#### Custom Exceptions
- Create user-defined exceptions by extending the `Exception` class.
```java
class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}

public class TestCustomException {
    public static void main(String[] args) {
        try {
            throw new MyCustomException("Custom error message");
        } catch (MyCustomException e) {
            System.out.println(e.getMessage());
        }
    }
}
```

## Collections

### List
- **List**: An ordered collection that allows duplicate elements.

```java
List<String> list = new ArrayList<>();
list.add("A");
list.add("B");
list.add("C");
for (String s : list) {
    System.out.println(s);
}
```

### Set
- **Set**: An unordered collection that does not allow duplicate elements.

```java
Set<String> set = new HashSet<>();
set.add("A");
set.add("B");
set.add("C");
for (String s : set) {
    System.out.println(s);
}
```

### Queue
- **Queue**: A collection that follows the First-In-First-Out (FIFO) principle.

```java
Queue<String> queue = new LinkedList<>();
queue.add("A");
queue.add("B");
queue.add("C");
while (!queue.isEmpty()) {
    System.out.println(queue.poll());
}
```

### Map
- **Map**: A collection of key-value pairs, where each key is unique.

```java
Map<String, String> map = new HashMap<>();
map.put("key1", "value1");
map.put("key2", "value2");
map.put("key3", "value3");
for (Map.Entry<String, String> entry : map.entrySet()) {
    System.out.println(entry.getKey() + ": " + entry.getValue());
}
```

### Collections Utility Class
- **Collections Utility Class**: A utility class that provides static methods for operating on collections.

```java
List<String> list = new ArrayList<>();
list.add("C");
list.add("A");
list.add("B");

Collections.sort(list);
System.out.println("Sorted List: " + list);

Collections.shuffle(list);
System.out.println("Shuffled List: " + list);

Collections.reverse(list);
System.out.println("Reversed List: " + list);

List<String> synchronizedList = Collections.synchronizedList(list);
```

## Custom Exceptions
- **Custom Exceptions**: User-defined exceptions for handling specific error conditions.

```java
class CustomException extends Exception {
    CustomException(String message) {
        super(message);
    }
}

try {
    throw new CustomException("This is a custom exception");
} catch (CustomException e) {
    System.out.println(e.getMessage());
}
```

## CopyOnWriteArrayList
- **CopyOnWriteArrayList**: A thread-safe variant of `ArrayList`.

```java
CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
list.add("A");
list.add("B");
for (String s : list) {
    System.out.println(s);
}
```

## CopyOnWriteArraySet
- **CopyOnWriteArraySet**: A thread-safe variant of `HashSet`.

```java
CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>();
set.add("A");
set.add("B");
for (String s : set) {
    System.out.println(s);
}
```

## ConcurrentSkipListMap
- **ConcurrentSkipListMap**: A thread-safe variant of `TreeMap`.

```java
ConcurrentSkipListMap<String, String> map = new ConcurrentSkipListMap<>();
map.put("key1", "value1");
map.put("key2", "value2");
for (Map.Entry<String, String> entry : map.entrySet()) {
    System.out.println(entry.getKey() + ": " + entry.getValue());
}
```

## SortedMap and NavigableMap

### SortedMap Interface
- **SortedMap**: A Map that maintains its elements in ascending order.

```java
SortedMap<String, String> sortedMap = new TreeMap<>();
sortedMap.put("key1", "value1");
sortedMap.put("key2", "value2");
for (Map.Entry<String, String> entry : sortedMap.entrySet()) {
    System.out.println(entry.getKey() + ": " + entry.getValue());
}
```

### NavigableMap Interface
- **NavigableMap**: A SortedMap that provides methods to navigate through the map.

```java
NavigableMap<String, String> navigableMap = new TreeMap<>();
navigableMap.put("key1", "value1");
navigableMap.put("key2", "value2");
for (Map.Entry<String, String> entry : navigableMap.entrySet()) {
    System.out.println(entry.getKey() + ": " + entry.getValue());
}
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
