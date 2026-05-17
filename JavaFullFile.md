```markdown
# 1. Programming Foundations

> Role: SDET Lead  
> Focus: Deep understanding that enables framework design, performance debugging, and architectural decision-making.

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

At the lowest level, the CPU performs a Fetch → Decode → Execute cycle:

1. Fetch the instruction from memory.
2. Decode what the instruction means.
3. Execute the operation.
4. Advance to the next instruction.

For Java:

· javac converts .java → .class
· JVM interprets or JIT-compiles bytecode
· CPU executes native instructions

CPU Execution Flow

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

SDET Lead Insight

Performance tests often run faster after initial execution because the JIT compiler optimizes “hot” code paths.

ClassNotFoundException, memory leaks, deadlocks, and flaky parallel tests all originate from this execution model.

---

2. Compiler vs Interpreter

Compiler Interpreter
Translates entire code before execution Translates during execution
Produces executable/bytecode No standalone output
Compile-time errors Runtime errors
Faster execution Slower but flexible

---

Java’s Hybrid Model

```text
.java
   ↓ javac
   ↓
.class (Bytecode)
   ↓
JVM Interpreter
   ↓
JIT Compiler
   ↓
Native Machine Code
```

Examples

Compiled Languages

· C
· C++
· Go
· Rust

Interpreted Languages

· Python
· JavaScript
· Ruby

SDET Lead Insight

Automation ecosystems usually combine multiple runtime models:

· Java → compiled
· Groovy → interpreted
· Python → interpreted

Understanding this helps with startup optimization, debugging, and CI/CD pipeline tuning.

---

3. Binary & Decimal Basics

Computers store everything as binary:

```text
0 and 1
```

Because transistors only have two physical states:

· ON → 1
· OFF → 0

---

Decimal to Binary Conversion

Convert 13 to binary:

```text
13 ÷ 2 = 6 remainder 1
6 ÷ 2 = 3 remainder 0
3 ÷ 2 = 1 remainder 1
1 ÷ 2 = 0 remainder 1
```

Read bottom-up:

```text
1101₂ = 13₁₀
```

---

Binary to Decimal

```text
1101₂  = (1 × 2³) + (1 × 2²) + (0 × 2¹) + (1 × 2⁰)
       = 8 + 4 + 0 + 1 = 13
```

---

Bits & Bytes

Unit Meaning
1 bit Single binary digit
1 byte 8 bits
1 KB 1024 bytes
1 MB 1024 KB

---

Two’s Complement (Signed Numbers)

Java integer types use two’s complement.

```text
Leftmost bit = sign bit
0 → positive
1 → negative
```

SDET Lead Insight

Binary understanding becomes critical for:

· Bitwise operations
· Memory optimization
· Encoding/decoding payloads
· File processing
· Performance tuning

---

4. Memory Basics

RAM is essentially a giant array of bytes.

Each byte has a unique memory address.

Programs primarily use:

· Stack Memory
· Heap Memory

---

Stack Memory

Used for:

· Method calls
· Local variables
· Execution frames

Characteristics:

· Fast
· Thread-specific
· Auto-cleaned
· LIFO structure

---

Heap Memory

Used for:

· Objects
· Arrays
· Dynamic allocations

Characteristics:

· Shared across threads
· Garbage collected
· Larger but slower

---

Stack vs Heap Visualization

```text
STACK                          HEAP
+-------------------+          +----------------------+
| age = 25          |          | User Object          |
| user = 0xA12F ----|--------->| name = "John"        |
+-------------------+          +----------------------+
```

SDET Lead Insight

Memory leaks in automation frameworks usually happen because references remain reachable through:

· static collections
· ThreadLocals
· cached driver objects

preventing garbage collection.

---

5. CPU vs RAM

CPU RAM
Executes instructions Stores data/instructions
Extremely fast Slower than CPU
Contains registers/cache Large storage capacity

---

CPU Processing Flow

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

CPU Cache Levels

Cache Speed
L1 Fastest
L2 Fast
L3 Shared but larger

---

Why Buffering Matters

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

SDET Lead Insight

Large test data processing, report generation, and log parsing depend heavily on efficient buffering strategies.

---

6. Variables in Memory

Primitive Variables

```java
int age = 25;
```

Stored directly in stack memory.

---

Reference Variables

```java
String name = "John";
```

· Reference stored in stack
· Actual object stored in heap

---

Memory Layout

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

Reassignment

```java
name = "Doe";
```

Now:

```text
name → new heap object
```

Old object becomes eligible for GC if unreferenced.

---

Primitive vs Reference Copy

Primitive Copy

```java
int x = 5;
int y = x;
```

y gets actual value copy.

---

Reference Copy

```java
int[] arr1 = {1,2,3};
int[] arr2 = arr1;
```

Both references point to SAME object.

---

Reference Visualization

```text
arr1 ───┐
        ├──→ SAME ARRAY OBJECT
arr2 ───┘
```

SDET Lead Insight

Shared mutable state is one of the biggest causes of flaky automation.

Understanding references explains:

· == vs .equals()
· deep copy vs shallow copy
· object pollution across tests
· thread-safety issues

---

7. Input / Output (I/O) Flow

Programs communicate with:

· Keyboard
· Files
· Network
· Console
· Devices

---

Java File Reading Example

```java
BufferedReader reader =
    new BufferedReader(
        new FileReader("data.txt")
    );

String line = reader.readLine();
```

---

Internal Flow

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

Standard Streams

Stream Purpose
System.in Input
System.out Output
System.err Errors

---

Blocking vs Non-Blocking I/O

Blocking I/O

Thread waits until operation completes.

```text
Thread blocked until data arrives
```

---

Non-Blocking I/O (NIO)

Thread can continue handling other tasks.

Useful for:

· scalable servers
· high-concurrency systems
· large automation infrastructures

---

Why BufferedReader Is Faster

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

SDET Lead Insight

Selenium driver.get(url) performs network I/O.

Slow responses block the test thread.

This is why:

· timeouts matter
· retries matter
· async APIs matter
· buffering matters

---

Final Engineering Perspective

Understanding these fundamentals transforms you from:

```text
Code Writer
```

into:

```text
Systems Engineer
```

You begin understanding:

· Why frameworks become slow
· Why memory leaks happen
· Why tests fail only in parallel
· Why CPU spikes occur
· Why garbage collection pauses happen
· Why buffering improves performance
· Why thread contention occurs

---

Summary

This chapter gives you the mental model required for:

· JVM understanding
· Framework architecture
· Multithreading
· Performance engineering
· Selenium optimization
· Memory debugging
· CI/CD troubleshooting
· Large-scale automation systems

Once these foundations become intuitive, Java and automation frameworks stop feeling like “magic.”

You start seeing the system beneath the code.

---

Next Section

2. Maths for Programming & DSA

We will cover:

· Number systems
· Prime numbers
· GCD & LCM
· Bit manipulation math
· Modular arithmetic
· Logarithms
· Fast exponentiation
· Mathematical thinking for DSA
· Interview-level optimization thinking

```
```