# 1. Programming Foundations

> **Role**: SDET Lead  
> **Focus**: Deep understanding that enables framework design, performance debugging, and architectural decision-making.

---

# 1.1 Computer Fundamentals

This section builds your mental model of what actually happens when code executes.

Every flaky test, memory leak, CI slowness, and concurrency bug traces back to these foundations.

---

# 1. How Programs Work

A program is a set of instructions that the CPU executes step by step.

## Full Java Execution Pipeline

```text
Source Code (.java)
         ↓
Compiler (javac)
         ↓
Bytecode (.class)
         ↓
JVM
         ↓
Machine Code
         ↓
CPU
```

At the lowest level, the CPU performs a:

Fetch → Decode → Execute cycle

- Fetch the instruction from memory
- Decode what the instruction means
- Execute the operation
- Advance to the next instruction

For Java:

- `javac` converts source code into bytecode
- JVM interprets or JIT-compiles bytecode
- CPU executes native machine instructions

## CPU Execution Flow

```text
Write Java Code
         ↓
Compile to Bytecode
         ↓
JVM Loads Classes
         ↓
Bytecode Verification
         ↓
JIT Compilation
         ↓
Machine Code Execution
         ↓
CPU Operations
```

### SDET Lead Insight

Performance tests often run faster after initial execution because the JIT compiler optimizes hot code paths.

Common issues like:

- `ClassNotFoundException`
- memory leaks
- deadlocks
- flaky parallel tests

all originate from this execution model.

---

# Compiler vs Interpreter

| **Compiler** | **Interpreter** |
|---|---|
| Translates entire code before execution | Translates during execution |
| Produces executable/bytecode | No standalone output |
| Compile-time errors | Runtime errors |
| Faster execution | Slower but flexible |

---

# Java’s Hybrid Model

```text
.java
   ↓ javac
.class (Bytecode)
   ↓
JVM Interpreter
   ↓
JIT Compiler
   ↓
Native Machine Code
```

### Examples

Compiled Languages:
- C
- C++
- Go
- Rust

Interpreted Languages:
- Python
- JavaScript
- Ruby

### SDET Lead Insight

Automation ecosystems usually combine multiple runtime models:

- Java → compiled + JIT optimized
- Groovy → interpreted
- Python → interpreted

Understanding this helps with:
- startup optimization
- debugging
- CI/CD pipeline tuning

---

# Binary & Decimal Basics

Computers store everything as binary:

- `0`
- `1`

Because transistors only have two physical states:

- ON → `1`
- OFF → `0`

---

## Decimal to Binary Conversion

Convert `13` to binary:

```text
13 ÷ 2 = 6 remainder 1
6  ÷ 2 = 3 remainder 0
3  ÷ 2 = 1 remainder 1
1  ÷ 2 = 0 remainder 1
```

Read bottom-up:

```text
1101
```

---

## Binary to Decimal

```text
1101₂ = (1 × 2³) + (1 × 2²) + (0 × 2¹) + (1 × 2⁰)

      = 8 + 4 + 0 + 1

      = 13
```

---

# Bits & Bytes

| **Unit** | **Meaning** |
|---|---|
| 1 bit | Single binary digit |
| 1 byte | 8 bits |
| 1 KB | 1024 bytes |
| 1 MB | 1024 KB |

---

# Two’s Complement (Signed Numbers)

Leftmost bit = sign bit

- `0` → positive
- `1` → negative

### SDET Lead Insight

Binary understanding becomes critical for:

- bitwise operations
- memory optimization
- encoding/decoding payloads
- file processing
- performance tuning

---

# Memory Basics

RAM is essentially a giant array of bytes.

Each byte has a unique memory address.

Programs primarily use:
- Stack Memory
- Heap Memory

---

## Stack Memory

Used for:
- method calls
- local variables
- execution frames

Characteristics:
- fast
- thread-specific
- auto-cleaned
- LIFO structure

---

## Heap Memory

Used for:
- objects
- arrays
- dynamic allocations

Characteristics:
- shared across threads
- garbage collected
- larger but slower

---

# Stack vs Heap Visualization

```text
STACK                          HEAP
+-------------------+          +----------------------+
| age = 25          |          | User Object          |
| user = 0xA12F ----|--------->| name = "John"        |
+-------------------+          +----------------------+
```

### SDET Lead Insight

Memory leaks in automation frameworks usually happen because references remain reachable through:

- static collections
- `ThreadLocal`
- cached driver objects

preventing garbage collection.

---

# CPU vs RAM

| **CPU** | **RAM** |
|---|---|
| Executes instructions | Stores data/instructions |
| Extremely fast | Slower than CPU |
| Contains registers/cache | Large storage capacity |

---

# CPU Processing Flow

```text
RAM
 ↓
CPU Cache
 ↓
Registers
 ↓
ALU Operations
 ↓
Result Back to RAM
```

---

# CPU Cache Levels

| **Cache** | **Speed** |
|---|---|
| L1 | Fastest |
| L2 | Fast |
| L3 | Shared but larger |

---

# Why Buffering Matters

Without buffering:

```text
Read byte → system call → read byte → system call
```

Very expensive.

With buffering:

```text
Read large chunk once
         ↓
Serve data from memory buffer
```

Much faster.

### SDET Lead Insight

Large test data processing, report generation, and log parsing depend heavily on efficient buffering strategies.

---

# Variables in Memory

## Primitive Variables

```java
int age = 25;
```

Stored directly in stack memory.

---

## Reference Variables

```java
String name = "John";
```

- Reference stored in stack
- Actual object stored in heap

---

# Memory Layout

```text
STACK (main frame)

+------+-------------+
| age  | 25          |
+------+-------------+
| name | ref0x1a2b3c | --------+
+------+-------------+         |
                               ↓
HEAP
+----------------------------+
| String Object "John"       |
| char[]                     |
+----------------------------+
```

---

# Primitive vs Reference Copy

## Primitive Copy

```java
int x = 5;
int y = x;
```

`y` gets an actual value copy.

---

## Reference Copy

```java
int[] arr1 = {1,2,3};
int[] arr2 = arr1;
```

Both references point to the SAME object.

```text
arr1 ───┐
        ├──→ SAME ARRAY OBJECT
arr2 ───┘
```

### SDET Lead Insight

Shared mutable state is one of the biggest causes of flaky automation.

Understanding references explains:
- `==` vs `.equals()`
- deep copy vs shallow copy
- object pollution across tests
- thread-safety issues

---

# Input / Output (I/O) Flow

Programs communicate with:
- keyboard
- files
- network
- console
- devices

---

# Java File Reading Example

```java
BufferedReader reader =
    new BufferedReader(
        new FileReader("data.txt")
    );

String line = reader.readLine();
```

---

# Internal Flow

```text
Java Program
      ↓
OS System Call
      ↓
Kernel Accesses Disk
      ↓
Bytes Loaded into Buffer
      ↓
Decoded into Characters
      ↓
Returned as String
```

---

# Standard Streams

| **Stream** | **Purpose** |
|---|---|
| `System.in` | Input |
| `System.out` | Output |
| `System.err` | Errors |

---

# Blocking vs Non-Blocking I/O

## Blocking I/O

Thread waits until operation completes.

```text
Thread blocked until data arrives
```

---

## Non-Blocking I/O (NIO)

Thread can continue handling other tasks.

Useful for:
- scalable servers
- high concurrency systems
- large automation infrastructures

---

# Why BufferedReader Is Faster

Without buffering:

```text
1 byte read → system call → repeat
```

With buffering:

```text
Large chunk read once
         ↓
Served from memory
```

Huge performance gain.

### SDET Lead Insight

Selenium performs network I/O.

Slow responses block the test thread.

This is why:
- timeouts
- retries
- async APIs
- buffering

matter.

---

# Final Engineering Perspective

Understanding these fundamentals transforms you from:

```text
Code Writer
```

into:

```text
Systems Engineer
```

You begin understanding:

- why frameworks become slow
- why memory leaks happen
- why tests fail only in parallel
- why CPU spikes occur
- why garbage collection pauses happen
- why buffering improves performance
- why thread contention occurs

---

# Summary

This chapter gives you the mental model required for:

- JVM understanding
- framework architecture
- multithreading
- performance engineering
- Selenium optimization
- memory debugging
- CI/CD troubleshooting
- large-scale automation systems

Once these foundations become intuitive, Java and automation frameworks stop feeling like magic.

You start seeing the system beneath the code.

---

# Next Section

## Maths for Programming & DSA

We will cover:

- number systems
- prime numbers
- GCD & LCM
- bit manipulation math
- modular arithmetic
- logarithms
- fast exponentiation
- mathematical thinking for DSA
- interview-level optimization thinking

---

# Rule to Remember for GitHub Markdown

Always put an empty line before and after every code block.

That prevents text from getting stuck inside the block.