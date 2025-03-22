# Java Cheatsheet

Welcome to the Java Cheatsheet! This document contains essential notes and snippets that will help you quickly reference Java programming concepts.

Sure! Here's the Table of Contents in the right order with the subtopics nested under their respective topics:

## Table of Contents
1. [Basic Syntax](#basic-syntax)
2. [Java Data Types and Variables](#java-data-types-and-variables)
3. [Operators](#operators)
4. [Control Statements](#control-statements)
5. [Loops](#loops)
6. [Methods](#methods)
7. [Object-Oriented Programming (OOP) Concepts](#object-oriented-programming-oop-concepts)
   - [Classes and Objects](#classes-and-objects)
   - [Inheritance](#inheritance)
   - [Polymorphism](#polymorphism)
   - [Abstraction](#abstraction)
   - [Encapsulation](#encapsulation)
8. [Exception Handling in Java](#exception-handling-in-java)
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
public class com.core.javacodes.Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

# Java Data Types and Variables

Java is a statically-typed language, meaning every variable must be declared with a specific data type before use. Java categorizes data types into two main groups: **primitive** and **non-primitive (reference)** data types.

---

## Primitive Data Types
Primitive data types are the basic building blocks in Java, storing simple values directly in memory. They have predefined sizes and ranges:

- **`byte`**: 8-bit signed integer  
  - Range: `-128` to `127`  
  - Default: `0`  
  - Example: `byte b = 100;`

- **`short`**: 16-bit signed integer  
  - Range: `-32,768` to `32,767`  
  - Default: `0`  
  - Example: `short s = 1000;`

- **`int`**: 32-bit signed integer  
  - Range: `-2^31` to `2^31 - 1` (`-2,147,483,648` to `2,147,483,647`)  
  - Default: `0`  
  - Example: `int i = 50000;`

- **`long`**: 64-bit signed integer  
  - Range: `-2^63` to `2^63 - 1`  
  - Default: `0L` (suffix `L` required for literals)  
  - Example: `long l = 123456789L;`

- **`float`**: 32-bit single-precision floating-point (IEEE 754)  
  - Range: Approximately `±3.4E38` (6-7 decimal digits precision)  
  - Default: `0.0f` (suffix `f` required for literals)  
  - Example: `float f = 3.14f;`

- **`double`**: 64-bit double-precision floating-point (IEEE 754)  
  - Range: Approximately `±1.7E308` (15 decimal digits precision)  
  - Default: `0.0`  
  - Example: `double d = 3.14159;`

- **`char`**: 16-bit Unicode character  
  - Range: `'\u0000'` to `'\uffff'` (0 to 65,535)  
  - Default: `'\u0000'` (null character)  
  - Example: `char c = 'A';` or `char c = '\u0041';`

- **`boolean`**: Represents `true` or `false`  
  - Default: `false`  
  - Example: `boolean isActive = true;`

---

## Non-Primitive (Reference) Data Types
Non-primitive data types are objects and store references (memory addresses) to the actual data rather than the data itself. They are created using classes or interfaces and can be assigned `null`.

- **`String`**: A sequence of characters (immutable).  
  - Example: `String text = "Hello, Java!";`

- **`Arrays`**: Ordered collections of elements of the same type.  
  - Example: `int[] numbers = {1, 2, 3};` or `int[] numbers = new int[3];`

- **`Classes`**: User-defined or built-in types (e.g., `ArrayList`, `HashMap`).  
  - Example: `ArrayList<String> list = new ArrayList<>();`

- **`Interfaces`**: Abstract types defining behavior (e.g., `List`, `Map`).  
  - Example: `List<Integer> nums = new ArrayList<>();`

---

## Variables in Java
A **variable** is a named container that holds a value of a specific data type. Variables must be declared before use, specifying their type and name. They can be initialized at declaration or later.

### Syntax
```java
type variableName;           // Declaration only
type variableName = value;   // Declaration + Initialization
```
Examples
```java
int age = 25;              // Integer variable
double height = 5.9;       // Decimal variable
String name = "Alice";     // String variable
char initial = 'A';        // Character variable
```
### Naming Rules
  - Must start with a letter (a-z, A-Z), underscore (_), or dollar sign ($).
  - Can include letters, digits (0-9), _, or $.
  - Case-sensitive (e.g., age ≠ Age).
  - Cannot use Java reserved keywords (e.g., int, class, public).

### Type Casting
Type casting converts a value from one data type to another. It can be implicit (automatic) or explicit (manual).

## Implicit Casting
Smaller type to larger type (no data loss).  
Example: int to double
```java
int num = 10;
double d = num;  // d = 10.0
```
## Explicit Casting
Larger type to smaller type (possible data loss). Requires a cast operator.  
Example: double to int
```java
double d = 5.7;
int num = (int) d;  // num = 5 (fraction truncated)
```
### Variable Scope
The scope of a variable determines where it can be accessed in a program. Common scopes include:
### Local Variables: Declared inside a method or block; accessible only within that block.  
Must be initialized before use.  
Example:
```java
void method() {
    int x = 10;  // Local to method
    System.out.println(x);
}  // x is inaccessible outside method
```
### Instance Variables: Declared in a class but outside methods; belong to an object.  
Default values apply (e.g., 0 for int, null for objects).  
Example:
```java
class Person {
    String name;  // Instance variable
}
```
### Static Variables: Declared with static keyword; belong to the class, not instances.  
Example:
```java
class Example {
    static int count = 0;  // Static variable
}
```
#### Example Program
Here’s an expanded Java program demonstrating data types, variables, casting, and scope:
```java
public class Main {
    static int instanceCount = 0;  // Static variable

    public static void main(String[] args) {
        // Primitive types
        int age = 30;
        double salary = 75000.50;
        char grade = 'A';
        boolean isEmployed = true;

        // Reference type
        String name = "Bob";
        int[] scores = {85, 90, 95};

        // Type casting
        double temp = 98.6;
        int intTemp = (int) temp;  // Explicit casting

        // Wrapper class
        Integer wrappedAge = age;  // Autoboxing

        // Output
        System.out.println(name + " is " + age + ", earns $" + salary);
        System.out.println("Grade: " + grade + ", Employed: " + isEmployed);
        System.out.println("Scores: " + java.util.Arrays.toString(scores));
        System.out.println("Temperature (int): " + intTemp);
        System.out.println("Wrapped Age: " + wrappedAge);
    }
}
```
### Output
```java
Bob is 30, earns $75000.5
Grade: A, Employed: true
Scores: [85, 90, 95]
Temperature (int): 98
Wrapped Age: 30
```
## Key Points
   - Primitive vs. Reference: Primitives store values directly; reference types store memory addresses.
   - Default Values: Local variables require initialization; instance/static variables get defaults (e.g., 0 for int, null for String).
   - Memory: Primitives use fixed memory (e.g., int = 4 bytes); reference types’ size depends on the object.
   - Immutability: String is immutable; arrays are mutable.

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
- **Class**: A blueprint for creating objects. It defines properties and behaviors. It is set of rules that defines how an object will behave.
- **Object**: An instance of a class with specific values for it's propeties and access to it's behaviours. All real world entities are objects!
- * Memory Allocation * :
        -- **Class**: Loaded into the method area during runtime.
        -- **Object**: Created in the heap memory at runtime.

```java
// Outer class: Car
class Car {
    // Instance variables (Each object has its own copy, stored in heap memory)
    private String brand;
    private String model;
    private int year;
    private double price;

    // Static variable (Shared among all objects, stored in method area)
    private static int totalCars = 0;

    // Constructor (Local variables: `brand`, `model`, `year`, `price` stored in stack memory)
    public Car(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        totalCars++; // Increment static variable (stored in method area)
    }

    // Instance Method: Displays car details
    public void displayCarInfo() {
        // Local variables: `message`, `taxRate`, `finalPrice` (Stored in stack memory)
        String message = "Car Details:";
        double taxRate = 0.10; // 10% tax rate
        double finalPrice = price + (price * taxRate); // Price after tax

        System.out.println(message);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price (after tax): $" + finalPrice);
    }

    // Static Method: Returns the total number of cars created
    public static int getTotalCars() {
        return totalCars;
    }

    // ============================ //
    // Static Nested Class: Engine  //
    // ============================ //
    static class Engine {
        private int horsepower;
        private String type;

        // Constructor (Local variables: `horsepower`, `type` stored in stack memory)
        public Engine(int horsepower, String type) {
            this.horsepower = horsepower;
            this.type = type;
        }

        // Method to display engine details
        public void displayEngineInfo() {
            System.out.println("Engine Horsepower: " + horsepower);
            System.out.println("Engine Type: " + type);
        }
    }

    // ============================== //
    // Non-Static Inner Class: Battery //
    // ============================== //
    class Battery {
        private int capacity; // Capacity in kWh

        // Constructor (Local variable: `capacity` stored in stack memory)
        public Battery(int capacity) {
            this.capacity = capacity;
        }

        // Method to display battery details
        public void displayBatteryInfo() {
            System.out.println("Battery Capacity: " + capacity + " kWh");
            System.out.println("This battery belongs to: " + brand + " " + model);
        }
    }

    // Method with a Local Inner Class
    public void showCarWarranty() {
        // Local variable (Stored in stack memory)
        int warrantyYears = 5;

        // Local Inner Class (Stored in stack memory until the method executes)
        class Warranty {
            public void displayWarrantyInfo() {
                System.out.println("Warranty Period: " + warrantyYears + " years.");
            }
        }

        // Creating an object of the local inner class
        Warranty warranty = new Warranty();
        warranty.displayWarrantyInfo();
    }
}
```
** Creating Objects and Accessing Static Members **

``` java
public class Main {
    public static void main(String[] args) {
        // Local variables: `car1`, `car2` (Stored in stack memory)
        Car car1 = new Car("Tesla", "Model S", 2023, 79999.99);
        Car car2 = new Car("BMW", "X5", 2022, 60000.50);

        // Displaying car details
        System.out.println("Car 1 Details:");
        car1.displayCarInfo();

        System.out.println("\nCar 2 Details:");
        car2.displayCarInfo();

        // Accessing the Static Nested Class (Engine)
        System.out.println("\nCar 1 Engine Details:");
        Car.Engine engine1 = new Car.Engine(670, "Electric");
        engine1.displayEngineInfo();

        // Accessing the Non-Static Inner Class (Battery)
        System.out.println("\nCar 1 Battery Details:");
        Car.Battery battery1 = car1.new Battery(100);
        battery1.displayBatteryInfo();

        // Accessing the Local Inner Class (Defined in a method)
        System.out.println("\nCar 1 Warranty Details:");
        car1.showCarWarranty();

        // Displaying total cars created
        System.out.println("\nTotal Cars Created: " + Car.getTotalCars());
    }
}
```

## Key Differences Between Instance and Local Variables  

| Feature              | Instance Variables                          | Local Variables                           |
|----------------------|---------------------------------------------|-------------------------------------------|
| **Declared Inside**  | Class (outside methods)                     | Inside methods, constructors, or blocks   |
| **Scope**            | Available throughout the object's lifetime  | Available only within the method/block    |
| **Storage**          | Stored in **heap memory**                   | Stored in **stack memory**                |
| **Default Values**   | Yes (e.g., `0`, `false`, `null`)            | No (must be initialized before use)       |
| **Access Modifiers** | Can have (`private`, `public`, etc.)        | Cannot have access modifiers              |
| **Lifetime**         | Exists as long as the object exists         | Exists only during method execution       |

# **Constructors in Java**

A **constructor** in Java is a special method used to initialize objects. It is called automatically when an object is created.

## **Characteristics of a Constructor**
- Has the **same name as the class**.
- **No return type** (not even `void`).
- Can be **parameterized** or **non-parameterized**.
- Used to set **initial values** for object attributes.
- If no constructor is defined, **Java provides a default constructor**.

---

## **Types of Constructors in Java**

### **1. Default Constructor (No-Arg Constructor)**
A constructor **without parameters** that initializes default values.

#### **Example:**
```java
class Car {
    String brand;
    int speed;

    // Default Constructor
    public Car() {
        brand = "Unknown";
        speed = 0;
        System.out.println("Default Constructor Called");
    }

    public void display() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(); // Calls the default constructor
        car1.display();
    }
}
```
### **Output:**
```
Default Constructor Called
Brand: Unknown, Speed: 0 km/h
```

---

### **2. Parameterized Constructor**
A constructor that **accepts arguments** to initialize instance variables.

#### **Example:**
```java
class Car {
    String brand;
    int speed;

    // Parameterized Constructor
    public Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void display() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Tesla", 120);
        Car car2 = new Car("BMW", 150);

        car1.display();
        car2.display();
    }
}
```
### **Output:**
```
Brand: Tesla, Speed: 120 km/h
Brand: BMW, Speed: 150 km/h
```

---

### **3. Copy Constructor**
A constructor that **copies values from another object** of the same class.

#### **Example:**
```java
class Car {
    String brand;
    int speed;

    // Parameterized Constructor
    public Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Copy Constructor
    public Car(Car otherCar) {
        this.brand = otherCar.brand;
        this.speed = otherCar.speed;
    }

    public void display() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Audi", 180);
        Car car2 = new Car(car1); // Using copy constructor

        car1.display();
        car2.display();
    }
}
```
### **Output:**
```
Brand: Audi, Speed: 180 km/h
Brand: Audi, Speed: 180 km/h
```

---

## **4. Constructor Overloading**
Java allows **multiple constructors** in a class with different parameter lists.

#### **Example:**
```java
class Car {
    String brand;
    int speed;

    // Default Constructor
    public Car() {
        brand = "Unknown";
        speed = 0;
    }

    // Parameterized Constructor
    public Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void display() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(); // Calls default constructor
        Car car2 = new Car("Mercedes", 200); // Calls parameterized constructor

        car1.display();
        car2.display();
    }
}
```
### **Output:**
```
Brand: Unknown, Speed: 0 km/h
Brand: Mercedes, Speed: 200 km/h
```

---

## **5. Constructor Chaining**
**Constructor Chaining** is the process of calling one constructor from another within the same class using the `this` keyword.

### **Advantages of Constructor Chaining**
- Avoids **duplicate code** by reusing constructors.
- Allows **flexibility** in initializing objects.

#### **Example:**
```java
class Car {
    String brand;
    int speed;

    // Default Constructor
    public Car() {
        this("Unknown", 0); // Calls the parameterized constructor
        System.out.println("Default Constructor Called");
    }

    // Parameterized Constructor
    public Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void display() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(); // Calls default constructor -> which calls parameterized constructor
        car1.display();
    }
}
```
### **Output:**
```
Default Constructor Called
Brand: Unknown, Speed: 0 km/h
```

---

## **Key Differences Between Types of Constructors**

| Constructor Type              | Description                                     | Example                                             |
|-------------------------------|-------------------------------------------------|-----------------------------------------------------|
| **Default Constructor**       | No parameters, assigns default values           | `Car c = new Car();`                                |
| **Parameterized Constructor** | Takes parameters to initialize fields           | `Car c = new Car("Tesla", 120);`                    |
| **Copy Constructor**          | Copies values from another object               | `Car c2 = new Car(c1);`                             |
| **Overloaded Constructors**   | Multiple constructors with different parameters | `Car c1 = new Car(); Car c2 = new Car("BMW", 150);` |
| **Constructor Chaining**      | Calls another constructor using `this()`        | `Car c = new Car();` (calls another constructor)    |

---

## **Conclusion**
- **Constructors** are automatically called when an object is created.
- **Default constructors** initialize default values, while **parameterized constructors** allow custom initialization.
- **Copy constructors** copy data from another object.
- **Constructor overloading** allows multiple ways to initialize an object.
- **Constructor chaining** improves code reusability by calling one constructor from another.

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
