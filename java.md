## Java In VS Code:

1. Compile your code using the direct path
```bash

/home/vikas/Desktop/java-local/OpenJDK25U-jdk_x64_linux_hotspot_25.0.4.1_1/jdk-25.0.4.1+1/bin/javac Demo.java
```


2. Run your code using the direct path
```bash

/home/vikas/Desktop/java-local/OpenJDK25U-jdk_x64_linux_hotspot_25.0.4.1_1/jdk-25.0.4.1+1/bin/java Demo

```
3. Make it easier (Optional shortcut)
```bash

export PATH="/home/vikas/Desktop/java-local/OpenJDK25U-jdk_x64_linux_hotspot_25.0.4.1_1/jdk-25.0.4.1+1/bin:$PATH"


```

About -> JDK ==> JRE  ==> JVM

                
        1. Relationship Between JDK, JRE and JVM

        The relationship can be remembered as:

        ┌──────────────────────────────────────────────┐
        │                    JDK                       │
        │       Java Development Kit                  │
        │                                              │
        │  ┌────────────────────────────────────────┐  │
        │  │                  JRE                   │  │
        │  │       Java Runtime Environment        │  │
        │  │                                        │  │
        │  │  ┌──────────────────────────────────┐  │  │
        │  │  │              JVM                 │  │  │
        │  │  │     Java Virtual Machine         │  │  │
        │  │  │                                  │  │  │
        │  │  │   Executes Java Bytecode         │  │  │
        │  │  └──────────────────────────────────┘  │  │
        │  │                                        │  │
        │  │   + Java Class Libraries               │  │
        │  └────────────────────────────────────────┘  │
        │                                              │
        │  + Development Tools                         │
        │    (javac, java, javadoc, jar, etc.)         │
        └──────────────────────────────────────────────┘

        In short
        JDK
         └── JRE
              └── JVM


        Think of it as:

        JDK = JRE + Development Tools
        JRE = JVM + Java Libraries
        JVM = Executes Java Bytecode

        2. JVM — Java Virtual Machine

        JVM stands for Java Virtual Machine.

        It is the component responsible for executing Java bytecode.

        When we write a Java program:

        class Hello {
            public static void main(String[] args) {
                System.out.println("Hello World");
            }
        }


        The Java source code is first compiled into bytecode.

        Hello.java
            │
            │ javac
            ▼
        Hello.class
            │
            │ Bytecode
            ▼
           JVM
            │
            ▼
        Program Output


        The bytecode is stored in a .class file.

        Why is JVM important?

        Java follows the idea:

        Write Once, Run Anywhere (WORA)

        The same .class bytecode can run on different operating systems because each operating system has its own JVM implementation.

                     Java Bytecode
                      Hello.class
                          │
               ┌──────────┼──────────┐
               ▼          ▼          ▼
           JVM - Windows JVM - Linux JVM - macOS
               │          │          │
               ▼          ▼          ▼
           Windows      Linux       macOS

        Important JVM responsibilities

        Loads Java .class files.

        Verifies bytecode.

        Executes bytecode.

        Manages memory.

        Performs garbage collection.

        Provides runtime environment for Java programs.

        3. JRE — Java Runtime Environment

        JRE stands for Java Runtime Environment.

        It provides everything required to run a Java application.

        Conceptually:

        JRE
        │
        ├── JVM
        │
        └── Java Class Libraries


        For example, when your program uses:

        System.out.println();
        String
        ArrayList
        Scanner


        these Java APIs/classes are provided by the Java runtime libraries.

        Main purpose of JRE

        JRE is used to run Java applications.

        It is not intended to be a complete Java development environment.

        4. JDK — Java Development Kit

        JDK stands for Java Development Kit.

        It is used by developers to develop, compile, debug, package, and run Java applications.

        Conceptually:

        JDK
        │
        ├── JRE
        │   ├── JVM
        │   └── Java Libraries
        │
        └── Development Tools
            ├── javac
            ├── java
            ├── javadoc
            ├── jar
            └── jdb

        Important JDK tools
        Tool	    Purpose
        javac	Compiles .java source code into bytecode
        java	    Launches a Java application
        javadoc	Generates documentation
        jar	    Creates and manages JAR files
        jdb	    Java debugger
        
        
        5. How JDK, JRE and JVM Work Together

        Suppose we create:

        Hello.java

        with:

        class Hello {
            public static void main(String[] args) {
                System.out.println("Hello World");
            }
        }

        Step 1 — Write the source code
        Hello.java


        This is human-readable Java source code.

        Step 2 — Compile using JDK
        javac Hello.java


        The javac compiler converts:

        Hello.java


        into:

        Hello.class


        The .class file contains Java bytecode.

        Hello.java
            │
            │ javac
            ▼
        Hello.class
        (Bytecode)

        Step 3 — Run the program
        java Hello


        The Java runtime starts the JVM.

        Hello.class
            │
            ▼
           JVM
            │
            ▼
        Machine-specific execution
            │
            ▼
        Hello World

        6. Complete Flow
                         DEVELOPMENT
                              │
                              ▼
                      ┌───────────────┐
                      │  Hello.java   │
                      │ Source Code   │
                      └───────┬───────┘
                              │
                              │ javac
                              ▼
                      ┌───────────────┐
                      │  Hello.class  │
                      │    Bytecode   │
                      └───────┬───────┘
                              │
                              │ java
                              ▼
        ┌──────────────────────────────────────────┐
        │                   JDK                    │
        │                                          │
        │  ┌────────────────────────────────────┐  │
        │  │                 JRE                │  │
        │  │                                    │  │
        │  │  ┌──────────────────────────────┐  │  │
        │  │  │             JVM              │  │  │
        │  │  │                              │  │  │
        │  │  │    Executes Bytecode         │  │  │
        │  │  └──────────────────────────────┘  │  │
        │  │                                    │  │
        │  │       Java Class Libraries         │  │
        │  └────────────────────────────────────┘  │
        │                                          │
        │        Development Tools                 │
        └──────────────────────────────────────────┘
                              │
                              ▼
                      Program Execution

        7. Difference Between JDK, JRE and JVM
        Feature	JDK	JRE	JVM
        Full form	Java Development Kit 	Java Runtime Environment	 Java Virtual Machine
        
        Main purpose	 Develop Java applications	Run Java applications	Execute bytecode
        Contains JVM 	Yes	Yes	—
        Contains Java libraries	Yes	Yes	Uses them
        Contains development tools	Yes	No	No
        Compiles Java code	Yes	No	No
        Executes bytecode	Through its runtime	Through JVM	Yes
        
        8. Easy Way to Remember

        Think of a car factory:

        JDK = Complete workshop
               │
               ├── Tools for building the car
               │
               └── Everything needed to run the car


        JRE = Environment needed to run the car


        JVM = Engine that actually runs the car


        Or simply remember:

        JDK → Develop
        JRE → Run
        JVM → Execute

        One-line definitions

        JDK: A complete kit used to develop Java applications.

        JRE: The runtime environment required to run Java applications.

        JVM: The virtual machine that executes Java bytecode.

        9. Interview Point ⭐

        A common question is:

        "Why is Java platform independent?"

        Java source code is compiled into platform-independent bytecode.

        Java Source Code
              │
              │ javac
              ▼
          Bytecode
         (.class file)
              │
              ├───────────────┐
              ▼               ▼
         Windows JVM       Linux JVM
              │               │
              ▼               ▼
         Windows           Linux


        Therefore, the bytecode remains the same, while the JVM implementation is platform-specific.

        Java is platform independent because Java bytecode can run on different platforms using a JVM designed for that platform.

        Quick Revision
                            JDK
                             │
                  ┌──────────┴──────────┐
                  │                     │
                 JRE            Development Tools
                  │
             ┌────┴────┐
             │         │
            JVM    Java Libraries
             │
             ▼
        Executes Bytecode

        Remember
        JDK = JRE + Development Tools
        JRE = JVM + Java Libraries
        JVM = Bytecode Execution


Problem: 
- 
- Smart Console Calculator: Advanced Exercise: Build Your First Java Program That Thinks
- Create a minimal console-style calculator in Java that uses predefined values instead of reading input from the user.
- 
- Initialize two numbers (e.g., double num1 = 7;, double num2 = 3;) and an operator (e.g., char operator = '+').
- 
- Use a while loop controlled by a String again = "y". Inside the loop, perform exactly one calculation and then set again = "n" so the loop ends after the first run.
- 
- Use if-else statements to handle the operator: +, -, *, /.
- 
- For division, if num2 is 0, print Cannot divide by zero. and do not perform the division.
- 
- Print the result using the exact format:
- Result: <value>
- 
- After the loop ends, print a closing message:
- Thank you for using the calculator.
- 
- What this reinforces
- 
- Variable initialization
- 
- Arithmetic operators
- 
- Conditional logic with if-else
- 
- Loop control via a flag (again)
- 
- Defensive check for division by zero
- 
- Expected Output (with your current values)
- 
- Result: 10.0
- Thank you for using the calculator.


Solution:

```bash

public class SmartConsoleCalculator {
    public static void main(String[] args) {
        // Initialize the predefined values
        double num1 = 7.0;
        double num2 = 3.0;
        char operator = '+';

        // Control variable for the loop
        String again = "y";

        // Loop that simulates a console session
        while (again.equals("y")) {
            
            // Handle each operator using conditional logic
            if (operator == '+') {
                System.out.println("Result: " + (num1 + num2));
            } else if (operator == '-') {
                System.out.println("Result: " + (num1 - num2));
            } else if (operator == '*') {
                System.out.println("Result: " + (num1 * num2));
            } else if (operator == '/') {
                // Defensive check to prevent division by zero
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero.");
                } else {
                    System.out.println("Result: " + (num1 / num2));
                }
            } else {
                System.out.println("Invalid operator provided.");
            }

            // Update the loop control flag to exit after the first execution
            again = "n";
        }

        // Closing message outside the loop
        System.out.println("Thank you for using the calculator.");
    }
}

```


# ===================================================================================================Notes According to Udemy Telusko =================================================================================

# Core Java Revision Notes — Topics Practiced

> Beginner-friendly notes based on the Core Java topics we have studied together so far.
>
> Goal: understand the concept, write the code, and be able to explain why the code works.

---

# 1. Introduction to Java

Java is a high-level, class-based, object-oriented programming language.

Important characteristics:

- Platform independent: Java source code is compiled into bytecode.
- Object-oriented: programs can be organized using classes and objects.
- Strongly typed: variables have declared data types.
- Automatic memory management: the Java Virtual Machine (JVM) manages memory and garbage collection.

Basic flow:

```text
Java Source Code (.java)
        |
        v
     javac
        |
        v
Bytecode (.class)
        |
        v
Java Virtual Machine (JVM)
        |
        v
Program runs
```

---

# 2. First Code in Java

Basic program:

```java
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Java");
    }
}
```

Important:

```java
public static void main(String[] args)
```

is the main entry point used to start a Java application.

---

# 3. How Java Works

Main components:

- JDK — Java Development Kit: tools required to develop Java programs.
- JRE — Java Runtime Environment: environment needed to run Java applications.
- JVM — Java Virtual Machine: executes Java bytecode.

Simplified:

```text
.java file
   |
   | javac
   v
.class bytecode
   |
   | JVM
   v
Machine-specific execution
```

---

# 4. Variables

A variable is a named storage location used to hold a value.

Example:

```java
int age = 25;
String name = "Rahul";
```

Here:

- `age` is a variable of type `int`.
- `name` is a variable of type `String`.

A variable can be reassigned:

```java
int age = 25;
age = 30;
```

Final value:

```text
30
```

---

# 5. Data Types

Java data types are commonly divided into:

## Primitive Data Types

```text
byte
short
int
long
float
double
char
boolean
```

Example:

```java
int age = 25;
double price = 99.99;
char grade = 'A';
boolean active = true;
long population = 8000000000L;
float percentage = 95.5f;
```

## Reference Types

Examples:

```text
String
Array
Class/Object
```

A reference variable refers to an object.

Example:

```java
Student s = new Student();
```

---

# 6. Literals

A literal is a fixed value written directly in the source code.

Examples:

```java
10          // integer literal
10L         // long literal
10.5        // double literal
10.5f       // float literal
'A'         // char literal
"Java"      // String literal
true        // boolean literal
```

Important:

```text
10      -> int
10L     -> long
10.5    -> double
10.5f   -> float
'A'     -> char
"A"     -> String
```

---

# 7. Type Conversion

Type conversion means changing a value from one data type to another.

## Widening Conversion

Smaller range type to a wider type.

Example:

```java
int x = 10;
double y = x;
```

`int` is automatically converted to `double`.

Common widening chain:

```text
byte -> short -> int -> long -> float -> double
```

`char` can also widen to numeric types such as `int`, `long`, `float`, and `double`.

## Narrowing Conversion

A wider type is explicitly converted to a narrower type.

```java
double x = 10.5;
int y = (int) x;
```

Result:

```text
10
```

The decimal portion is removed.

Important overload example:

```java
void show(int x) {}
void show(double x) {}

show(10);     // int overload
show(10.5);   // double overload
show(10.5f);  // float can widen to double
show(7L);     // long can widen to double
```

A `long` cannot be automatically narrowed to `int`.

---

# 8. Arithmetic Operators

Common arithmetic operators:

```text
+   addition
-   subtraction
*   multiplication
/   division
%   remainder/modulus
```

Example:

```java
int a = 10;
int b = 3;

System.out.println(a + b); // 13
System.out.println(a - b); // 7
System.out.println(a * b); // 30
System.out.println(a / b); // 3
System.out.println(a % b); // 1
```

Integer division removes the fractional part.

---

# 9. Relational Operators

Used to compare values.

```text
> 
<
>=
<=
==
!=
```

Example:

```java
int age = 25;

System.out.println(age >= 18); // true
System.out.println(age == 25); // true
System.out.println(age != 30); // true
```

The result is a `boolean`.

---

# 10. Logical Operators

Common logical operators:

```text
&&   AND
||   OR
!    NOT
```

Example:

```java
int age = 25;

boolean result = age >= 18 && age <= 60;

System.out.println(result); // true
```

---

# 11. if

Used when a condition needs to be checked.

```java
int age = 20;

if (age >= 18) {
    System.out.println("Adult");
}
```

---

# 12. if-else

```java
int age = 16;

if (age >= 18) {
    System.out.println("Adult");
} else {
    System.out.println("Minor");
}
```

---

# 13. if-else-if

Used when there are multiple conditions.

```java
int marks = 75;

if (marks >= 90) {
    System.out.println("A");
} else if (marks >= 75) {
    System.out.println("B");
} else if (marks >= 60) {
    System.out.println("C");
} else {
    System.out.println("D");
}
```

---

# 14. Ternary Operator

Short form of simple if-else logic.

```java
int age = 20;

String result = age >= 18 ? "Adult" : "Minor";

System.out.println(result);
```

General form:

```java
condition ? valueIfTrue : valueIfFalse
```

---

# 15. switch

Used when one value is compared against multiple cases.

```java
int day = 2;

switch (day) {
    case 1:
        System.out.println("Monday");
        break;

    case 2:
        System.out.println("Tuesday");
        break;

    default:
        System.out.println("Invalid");
}
```

`break` prevents fall-through to the next case.

---

# 16. for Loop

Useful when the number of iterations is known or controlled by a counter.

```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

Output:

```text
0
1
2
3
4
```

---

# 17. while Loop

Condition is checked before each iteration.

```java
int i = 0;

while (i < 5) {
    System.out.println(i);
    i++;
}
```

---

# 18. do-while Loop

The body executes at least once because the condition is checked after the body.

```java
int i = 0;

do {
    System.out.println(i);
    i++;
} while (i < 5);
```

---

# 19. Class and Object

A class is a blueprint/template.

An object is an instance created from the class.

Example:

```java
class Employee {
    String name;
    int salary;
}
```

Create an object:

```java
Employee e1 = new Employee();
```

Conceptually:

```text
Class
  |
  +----> Object 1
  |
  +----> Object 2
```

Each object can have its own instance data.

---

# 20. Methods

A method is a block of code that performs an operation.

Example:

```java
class Calculator {

    int add(int a, int b) {
        return a + b;
    }
}
```

Calling it:

```java
Calculator calc = new Calculator();

int result = calc.add(10, 20);

System.out.println(result);
```

Output:

```text
30
```

---

# 21. Method Overloading

Method overloading means:

> Multiple methods have the same name but different parameter lists.

Example:

```java
class AreaCalculator {

    int area(int side) {
        return side * side;
    }

    int area(int length, int breadth) {
        return length * breadth;
    }

    double area(double radius) {
        return 3.14159 * radius * radius;
    }
}
```

Calls:

```java
AreaCalculator calc = new AreaCalculator();

System.out.println(calc.area(5));       // 25
System.out.println(calc.area(5, 10));    // 50
System.out.println(calc.area(5.0));      // 78.53975
```

Java selects an overload based on the arguments supplied.

Important:

```java
int area(int side)
double area(int side)
```

cannot coexist because changing only the return type does not create a different method signature.

Method signature is based on:

```text
method name + parameter types/order
```

Parameter names and return type are not used to distinguish overloads.

Method overloading is compile-time polymorphism.

---

# 22. Stack and Heap

## Stack

The call stack manages active method invocations.

A method call creates a stack frame.

Example:

```java
static void greet() {
    int x = 10;
}
```

When `greet()` executes, its stack frame contains its local execution information.

After the method returns, its frame is removed.

Conceptually:

```text
STACK
----------------
greet() frame
x = 10
----------------
main() frame
----------------
```

## Heap

The heap is where ordinary Java objects and arrays are allocated.

Example:

```java
Employee e = new Employee();
```

Conceptually:

```text
STACK                         HEAP

e ------------------------> Employee object
                             salary = 30000
```

`e` is a reference variable. It is not the object itself.

---

# 23. References and Multiple References

Example:

```java
Employee e1 = new Employee();
Employee e2 = e1;
```

There is one object but two references.

```text
e1 -----------┐
              |
              v
        Employee object
              ^
              |
e2 -----------┘
```

Therefore:

```java
e1.salary = 50000;
System.out.println(e2.salary);
```

also prints:

```text
50000
```

Both references point to the same object.

## Changing a reference vs changing an object field

These are different:

```java
e1.salary = 50000;
```

Changes the object's field.

This:

```java
e2 = new Employee();
```

makes `e2` refer to a different object.

---

# 24. Arrays — Need of an Array

Without an array:

```java
int mark1 = 80;
int mark2 = 75;
int mark3 = 90;
```

With an array:

```java
int[] marks = {80, 75, 90};
```

An array stores multiple values of the same type under one variable name.

---

# 25. 1D Array

Example:

```java
int[] nums = {10, 20, 30, 40, 50};
```

Conceptually:

```text
Index:   0   1   2   3   4
Value:  10  20  30  40  50
```

Access:

```java
nums[0] // 10
nums[2] // 30
```

Length:

```java
nums.length // 5
```

Last valid index:

```java
nums.length - 1
```

Arrays use zero-based indexing.

---

# 26. Creating an Array

When values are already known:

```java
int[] nums = {10, 20, 30, 40, 50};
```

When the size is known but values are not:

```java
int[] nums = new int[5];
```

Initial values:

```text
0 0 0 0 0
```

Other default array element values include:

```text
double  -> 0.0
boolean -> false
reference type -> null
```

---

# 27. Array Declaration and Creation

Declaration:

```java
int[] nums;
```

Creation:

```java
nums = new int[5];
```

Combined:

```java
int[] nums = new int[5];
```

---

# 28. Array + for Loop

```java
int[] nums = {10, 20, 30, 40, 50};

for (int i = 0; i < nums.length; i++) {
    System.out.println(nums[i]);
}
```

Important pattern:

```java
for (int i = 0; i < array.length; i++)
```

---

# 29. Sum of a 1D Array

```java
int[] nums = {10, 20, 30, 40, 50};

int sum = 0;

for (int i = 0; i < nums.length; i++) {
    sum = sum + nums[i];
}

System.out.println(sum);
```

Output:

```text
150
```

---

# 30. Finding the Largest Value

Safer general approach:

```java
int[] nums = {-10, -20, -5, -30};

int largest = nums[0];

for (int i = 1; i < nums.length; i++) {
    if (nums[i] > largest) {
        largest = nums[i];
    }
}

System.out.println(largest);
```

Output:

```text
-5
```

Why not always:

```java
int largest = 0;
```

Because an array may contain only negative values.

---

# 31. 2D Array

A 2D array can be thought of as rows and columns.

```java
int[][] nums = {
    {10, 20, 30},
    {40, 50, 60},
    {70, 80, 90}
};
```

Structure:

```text
       0    1    2
0     10   20   30
1     40   50   60
2     70   80   90
```

Access:

```java
nums[0][0] // 10
nums[1][2] // 60
nums[2][1] // 80
```

General form:

```text
array[row][column]
```

---

# 32. 2D Array with Nested Loops

```java
for (int i = 0; i < nums.length; i++) {

    for (int j = 0; j < nums[i].length; j++) {
        System.out.print(nums[i][j] + " ");
    }

    System.out.println();
}
```

Outer loop:

```text
row
```

Inner loop:

```text
column
```

---

# 33. Jagged Array

A jagged array is an array whose inner arrays can have different lengths.

Example:

```java
int[][] nums = new int[3][];

nums[0] = new int[2];
nums[1] = new int[3];
nums[2] = new int[1];
```

Structure:

```text
Row 0 -> [10, 20]
Row 1 -> [30, 40, 50]
Row 2 -> [60]
```

Nested loops work because each row uses its own length:

```java
for (int i = 0; i < nums.length; i++) {
    for (int j = 0; j < nums[i].length; j++) {
        System.out.print(nums[i][j] + " ");
    }
    System.out.println();
}
```

---

# 34. 3D Array

A 3D array can be viewed as:

```text
layer -> row -> column
```

Example:

```java
int[][][] nums = {
    {
        {10, 20},
        {30, 40}
    },
    {
        {50, 60},
        {70, 80}
    }
};
```

Access:

```java
nums[0][0][0] // 10
nums[0][1][1] // 40
nums[1][0][0] // 50
nums[1][1][1] // 80
```

General form:

```java
array[layer][row][column]
```

Usually three nested loops are used to traverse a 3D array.

---

# 35. String — What is String?

`String` is a class, not a primitive data type.

Example:

```java
String name = "Rahul";
```

A String stores a sequence of characters.

Compare:

```java
char ch = 'A';
String s = "A";
```

```text
'A' -> char
"A" -> String
```

Single quotes are used for `char`.

Double quotes are used for String literals.

---

# 36. String Indexing

Example:

```java
String name = "JAVA";
```

Conceptually:

```text
Character: J   A   V   A
Index:     0   1   2   3
```

Access a character:

```java
name.charAt(0) // J
name.charAt(2) // V
```

---

# 37. String `length()`

For a String:

```java
String name = "Java";

name.length(); // 4
```

Important difference:

```java
array.length       // array property
string.length()    // String method
```

---

# 38. Common String Methods

```java
String s = "Java Programming";
```

Examples:

```java
s.length();
s.charAt(0);
s.toUpperCase();
s.toLowerCase();
s.contains("Java");
s.startsWith("Java");
s.endsWith("Programming");
```

Example:

```java
System.out.println(s.toUpperCase());
```

Output:

```text
JAVA PROGRAMMING
```

---

# 39. String and `+`

Numeric addition:

```java
System.out.println(10 + 20);
```

Output:

```text
30
```

String concatenation:

```java
System.out.println("10" + 20);
```

Output:

```text
1020
```

Once a String participates in `+`, the operation can become String concatenation.

Example:

```java
System.out.println("Age: " + 25);
```

Output:

```text
Age: 25
```

---

# 40. String + Loop

```java
String name = "JAVA";

for (int i = 0; i < name.length(); i++) {
    System.out.println(name.charAt(i));
}
```

Output:

```text
J
A
V
A
```

---

# 41. Mutable vs Immutable String

A String object is immutable.

Meaning:

> Once a String object is created, its character sequence cannot be modified.

Example:

```java
String s = "Java";

s.toUpperCase();

System.out.println(s);
```

Output:

```text
Java
```

The result of `toUpperCase()` was not assigned back to `s`.

Correct way to keep the returned String:

```java
s = s.toUpperCase();
```

Now:

```text
JAVA
```

---

# 42. String References

Example:

```java
String s1 = "Java";
String s2 = s1;

s1 = "Python";
```

After reassignment:

```text
s1 -> "Python"
s2 -> "Java"
```

`s1 = "Python"` changes the reference held by `s1`; it does not modify the existing `"Java"` String.

---

# 43. String Pool Basics

String literals can be stored in the String Constant Pool.

Example:

```java
String s1 = "Java";
String s2 = "Java";
```

Conceptually, both can refer to the same pooled String literal:

```text
s1 ----\
        > "Java"
s2 ----/
```

This is safe because String is immutable.

Important correction:

```java
String s = "Hello";
s = s.concat(" World");
```

The result `"Hello World"` is not automatically guaranteed to be a pooled String literal.

The `intern()` method is used when explicit String-pool interning is needed.

---

# 44. String Concatenation and Immutability

Example:

```java
String s = "Hello";

String result = s.concat(" World");
```

Conceptually:

```text
s      -> "Hello"
result -> "Hello World"
```

The original `"Hello"` is not modified.

---

# 45. StringBuilder

`StringBuilder` is mutable.

Example:

```java
StringBuilder sb = new StringBuilder("Hello");

sb.append(" World");

System.out.println(sb);
```

Output:

```text
Hello World
```

The same `StringBuilder` object can be modified through operations such as `append()`.

---

# 46. StringBuffer

`StringBuffer` is also mutable.

Example:

```java
StringBuffer sb = new StringBuffer("Hello");

sb.append(" World");

System.out.println(sb);
```

Output:

```text
Hello World
```

Common comparison:

```text
String        -> immutable
StringBuilder -> mutable, not synchronized
StringBuffer  -> mutable, synchronized
```

`StringBuilder` is commonly preferred for repeated text building when synchronization is not required.

---

# 47. Converting StringBuilder to String

```java
StringBuilder sb = new StringBuilder("Java");

sb.append(" Programming");

String result = sb.toString();
```

Now `result` is a `String`.

---

# 48. Encapsulation

Encapsulation means bundling data and related behavior inside a class while restricting direct access to internal state where appropriate.

A common pattern:

```java
class Employee {

    private double salary;

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        }
    }

    public double getSalary() {
        return salary;
    }
}
```

Important idea:

```text
private field
     |
     v
controlled access through methods
     |
     +--> getter: read
     |
     +--> setter: modify/validate
```

---

# 49. Why `private`?

Without `private`:

```java
class Employee {
    public double salary;
}
```

outside code could do:

```java
emp.salary = -50000;
```

With:

```java
private double salary;
```

outside code cannot directly access the field.

The class can control how its state changes.

---

# 50. Getters

A getter reads/returns a field value.

Example:

```java
public double getSalary() {
    return salary;
}
```

Usage:

```java
System.out.println(emp.getSalary());
```

Mental model:

```text
getter -> read
```

---

# 51. Setters

A setter changes a field, often with validation.

Example:

```java
public void setSalary(double salary) {
    if (salary >= 0) {
        this.salary = salary;
    }
}
```

Mental model:

```text
setter -> controlled modification
```

A class does not always need both a getter and a setter.

Example:

```text
getter only -> readable property
setter only -> writable property
neither     -> fully hidden through that interface
```

---

# 52. Encapsulation Example — Bank Account

A better design can avoid arbitrary balance replacement:

```java
class BankAccount {

    private double balance;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
        }
    }
}
```

This gives the object controlled operations rather than allowing:

```java
setBalance(10000);
```

to replace the balance arbitrarily.

---

# 53. `this` Keyword

Core definition:

> `this` is a reference to the current object.

Example:

```java
class Student {

    private String name;

    public void setName(String name) {
        this.name = name;
    }
}
```

Here:

```text
this.name -> instance variable belonging to current object
name      -> method parameter
```

---

# 54. Why `this` is useful

Without `this`:

```java
public void setName(String name) {
    name = name;
}
```

Both names refer to the parameter because the parameter shadows the instance variable.

This does not update the object's field.

Correct:

```java
this.name = name;
```

---

# 55. `this` and Multiple Objects

```java
Student s1 = new Student();
Student s2 = new Student();

s1.setName("Rahul");
s2.setName("Amit");
```

During:

```java
s1.setName("Rahul");
```

`this` refers to the `s1` object.

During:

```java
s2.setName("Amit");
```

`this` refers to the `s2` object.

So:

```text
this = current object for the current method invocation
```

---

# 56. Constructor

A constructor is a special member of a class that runs during object creation and is primarily used to initialize the object.

Example:

```java
class Student {

    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

Create an object:

```java
Student s = new Student("Rahul", 25);
```

Flow:

```text
new Student("Rahul", 25)
          |
          v
      object created
          |
          v
      constructor runs
          |
          v
      fields initialized
```

---

# 57. Constructor Rules

A constructor:

- has the same name as the class
- has no return type
- can have parameters
- can be overloaded

Example:

```java
class Student {

    Student() {
    }

    Student(String name) {
    }
}
```

These are overloaded constructors.

Important:

```java
void Student(String name)
```

is a method, not a constructor, because `void` is a return type.

---

# 58. Constructor vs Method

| Constructor | Method |
|---|---|
| Same name as class | Any valid method name |
| No return type | Has a return type or `void` |
| Runs as part of object creation | Runs when called |
| Primarily initializes object | Performs an operation |

---

# 59. No-Argument Constructor

A constructor taking zero parameters:

```java
Student() {
    name = "Unknown";
    age = 0;
}
```

Call:

```java
Student s = new Student();
```

A no-argument constructor can be compiler-provided or explicitly written.

---

# 60. Default Constructor

A compiler-provided default constructor is supplied only when you declare no constructors.

Example:

```java
class Student {

    String name;
    int age;
}
```

Java provides a no-argument default constructor conceptually so that:

```java
Student s = new Student();
```

can compile.

The fields have normal default values:

```text
String -> null
int    -> 0
```

---

# 61. Explicit No-Argument Constructor

You can write one yourself:

```java
class Student {

    String name;
    int age;

    Student() {
        name = "Unknown";
        age = 0;
    }
}
```

This is a no-argument constructor, but it is not the compiler-provided default constructor.

The important distinction:

```text
Default constructor
-> compiler-provided when you declare no constructor

No-argument constructor
-> any constructor with zero parameters
```

---

# 62. Parameterized Constructor

A constructor with parameters:

```java
class Student {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

Call:

```java
Student s = new Student("Rahul", 25);
```

---

# 63. Important Constructor Rule

If you declare:

```java
class Student {

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

then:

```java
Student s = new Student();
```

does not compile because you did not declare a no-argument constructor.

The compiler does not add the default constructor after you have declared another constructor.

---

# 64. Constructor Overloading

You can have multiple constructors with different parameter lists.

```java
class Student {

    String name;
    int age;

    Student() {
        name = "Unknown";
        age = 0;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

Both work:

```java
Student s1 = new Student();
Student s2 = new Student("Rahul", 25);
```

---

# 65. Static Variable

An instance variable belongs to each object.

Example:

```java
class Student {

    String name;
    int age;
}
```

If three objects exist, each has its own `name` and `age`.

A static variable belongs to the class and is shared.

Example:

```java
class Student {

    String name;
    int age;

    static String college = "LPU";
}
```

Conceptually:

```text
s1 -> name, age
s2 -> name, age
s3 -> name, age

Student class -> one shared college
```

---

# 66. Instance vs Static Variable

```text
Instance variable
-> belongs to each object
-> one conceptual copy per object

Static variable
-> belongs to the class
-> one shared class-level variable
```

Example:

```java
Student s1 = new Student();
Student s2 = new Student();

s1.name = "Rahul";
s2.name = "Amit";

Student.college = "ABC";
```

Then:

```text
s1.name       -> Rahul
s2.name       -> Amit
s1.college    -> ABC
s2.college    -> ABC
Student.college -> ABC
```

Prefer:

```java
Student.college
```

for accessing a static field because it makes the class-level nature obvious.

---

# 67. Static Does Not Mean Constant

This:

```java
static int count = 0;
```

can be changed.

`static` means the member is associated with the class.

`final` is related to preventing reassignment and will be studied separately.

---

# 68. Static Variable Example — Counting Objects

```java
class Student {

    private String name;
    private int age;

    static int count = 0;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }
}
```

Create three objects:

```java
Student s1 = new Student("Rahul", 25);
Student s2 = new Student("Amit", 22);
Student s3 = new Student("Priya", 24);

System.out.println(Student.count);
```

Output:

```text
3
```

Why?

Because there is one shared `count`, and each constructor increments it.

---

# 69. Static Method

A static method belongs to the class rather than to an individual object.

Example:

```java
class Calculator {

    static int add(int a, int b) {
        return a + b;
    }
}
```

Call:

```java
int result = Calculator.add(10, 20);
```

No Calculator object is required.

---

# 70. Instance Method vs Static Method

Instance method:

```java
Calculator calc = new Calculator();

calc.add(10, 20);
```

Static method:

```java
Calculator.add(10, 20);
```

Mental model:

```text
instance method -> called through an object

static method   -> called through a class
```

---

# 71. Why `main()` is Static

```java
public static void main(String[] args)
```

The JVM needs to invoke the entry-point method without first creating a `Main` object.

Therefore `main()` is declared static.

---

# 72. Static Method and Instance Members

A static method has no implicit current object (`this`).

Therefore this is not allowed directly:

```java
class Demo {

    int x = 10;

    static void show() {
        System.out.println(x); // error
    }
}
```

Typical compiler message:

```text
non-static variable x cannot be referenced from a static context
```

Why?

Because `x` belongs to an object, but the static method does not have a particular object associated with it.

---

# 73. Static Method Can Access Static Data

This works:

```java
class Demo {

    static int x = 10;

    static void show() {
        System.out.println(x);
    }
}
```

Both are class-level members.

---

# 74. `this` Is Not Available in a Static Method

This is invalid:

```java
static void show() {
    System.out.println(this);
}
```

Reason:

```text
this -> current object
static method -> no implicit current object
```

A static method can work with an object if an object reference is explicitly supplied.

Example:

```java
class Student {

    String name;

    static void showStudent(Student s) {
        System.out.println(s.name);
    }
}
```

Here the object is explicitly provided through `s`.

---

# 75. Enhanced For Loop / For-Each Loop

For an array:

```java
int[] nums = {10, 20, 30, 40, 50};

for (int value : nums) {
    System.out.println(value);
}
```

This is useful when you need each element but do not need the index.

Compare:

```java
for (int i = 0; i < nums.length; i++) {
    System.out.println(nums[i]);
}
```

Use the normal `for` loop when the index is needed.

---

# 76. Important Syntax Patterns

## Array

```java
int[] nums = {10, 20, 30};
nums.length;
nums[0];
```

## String

```java
String s = "Java";
s.length();
s.charAt(0);
```

## Method

```java
object.method(arguments);
```

## Static method

```java
ClassName.method(arguments);
```

## Constructor

```java
new ClassName(arguments);
```

## Getter

```java
object.getName();
```

## Setter

```java
object.setName("Rahul");
```

---

# 77. Common Mistakes We Corrected

## Mistake 1 — Largest value

Avoid:

```java
int largest = 0;
```

for a general maximum problem.

Prefer:

```java
int largest = nums[0];
```

---

## Mistake 2 — String `length`

Wrong:

```java
name.length
```

Correct:

```java
name.length()
```

Array:

```java
nums.length
```

---

## Mistake 3 — Last String character

Correct:

```java
name.charAt(name.length() - 1)
```

---

## Mistake 4 — Method call parentheses

Wrong:

```java
name.toUpperCase
```

Correct:

```java
name.toUpperCase()
```

---

## Mistake 5 — `this` in a setter

Wrong:

```java
name = name;
```

Correct:

```java
this.name = name;
```

---

## Mistake 6 — Constructor return type

Wrong:

```java
void Student(String name) {
}
```

This is a method.

Correct:

```java
Student(String name) {
}
```

---

## Mistake 7 — Static vs instance

Wrong answer:

```text
static variable belongs to each object
```

Correct:

```text
instance variable -> individual object
static variable   -> class/shared
```

---

# 78. Quick Mental Map

Keep this picture in your head:

```text
CORE JAVA
│
├── Basics
│   ├── Variables
│   ├── Data Types
│   ├── Literals
│   ├── Type Conversion
│   └── Operators
│
├── Control Flow
│   ├── if
│   ├── if-else
│   ├── if-else-if
│   ├── ternary
│   ├── switch
│   └── loops
│
├── OOP Basics
│   ├── Class
│   ├── Object
│   ├── Methods
│   ├── Method Overloading
│   ├── Encapsulation
│   ├── Getters / Setters
│   ├── this
│   └── Constructors
│
├── Memory
│   ├── Stack
│   ├── Heap
│   └── References
│
├── Arrays
│   ├── 1D
│   ├── 2D
│   ├── Jagged
│   ├── 3D
│   └── for-each
│
├── Strings
│   ├── String basics
│   ├── Immutability
│   ├── String Pool
│   ├── StringBuffer
│   └── StringBuilder
│
└── Static
    ├── Static Variable
    └── Static Method
```

---

# 79. Key Rules to Memorize

```text
1. Array indexing starts at 0.

2. Array uses:
   array.length

3. String uses:
   string.length()

4. String is a class, not a primitive.

5. String is immutable.

6. StringBuilder and StringBuffer are mutable.

7. Method overloading requires different parameter lists.

8. Changing only a method's return type does not overload it.

9. private fields are accessed through controlled methods when appropriate.

10. Getter -> read.

11. Setter -> modify/validate.

12. this -> current object.

13. Constructor -> same name as class and no return type.

14. Compiler-provided default constructor appears only when no constructor is declared.

15. Instance variable -> belongs to an object.

16. Static variable -> belongs to the class/shared.

17. Instance method -> object-based call.

18. Static method -> class-based call.

19. Static method has no implicit this.

20. new ClassName(...) creates an object and invokes a matching constructor.
```

---

# 80. Recommended Study Order From Here

Based on the topics you have already covered, continue your course in sequence, but use these notes as your revision base.

The immediate next area is the rest of the `static` topic if your course has additional static lessons, followed by the next Object-Oriented Programming topics in the Telusko sequence.

For each new topic:

```text
Watch Telusko video
        ↓
Come here
        ↓
Understand the concept
        ↓
See a small example
        ↓
Dry run
        ↓
Write code yourself
        ↓
Answer MCQs
        ↓
Add the topic to these notes
```

This way, you are not just watching Java videos — you are building your own Core Java revision material while learning.



-----

# 1. Static Method

A static method belongs to the **class**, rather than to an individual object.

```java
class Calculator {

    static int add(int a, int b) {
        return a + b;
    }
}
```

Call it using the class name:

```java
int result = Calculator.add(10, 20);
System.out.println(result);
```

Output:

```text
30
```

No `Calculator` object is required.

## Instance vs Static Method

Instance method:

```java
Calculator calc = new Calculator();
calc.add(10, 20);
```

Static method:

```java
Calculator.add(10, 20);
```

Mental model:

```text
instance method -> object-level behavior
static method   -> class-level behavior
```

Java can allow a static member to be accessed through an instance reference, but the class-qualified form is clearer and preferred.

---

# 2. What Can a Static Method Access?

A static method can directly access static members:

```java
class Student {

    static int count = 0;

    static void showCount() {
        System.out.println(count);
    }
}
```

A static method cannot directly access an instance variable:

```java
class Student {

    String name = "Rahul";

    static void showName() {
        System.out.println(name); // ERROR
    }
}
```

Typical error:

```text
non-static variable name cannot be referenced from a static context
```

Reason:

```text
name       -> belongs to an object
showName() -> belongs to the class
```

---

# 3. Static Method Can Use an Object Explicitly

A static method can work with instance data when an object reference is supplied.

```java
class Student {

    String name;

    static void showName(Student s) {
        System.out.println(s.name);
    }
}
```

Usage:

```java
Student s1 = new Student();
s1.name = "Rahul";

Student.showName(s1);
```

Important:

> A static method has no implicit current object (`this`), but it can work with an explicitly supplied object reference.

---

# 4. `this` Is Not Available in a Static Method

`this` means the **current object**.

A static method has no implicit current object.

Therefore:

```java
static void show() {
    System.out.println(this); // ERROR
}
```

Remember:

```text
Instance method -> current object exists -> this available
Static method   -> no implicit current object -> this unavailable
```

---

# 5. Why Is `main()` Static?

```java
public static void main(String[] args)
```

is the program entry point.

It is static so the Java Virtual Machine (JVM) can invoke it through the class without first creating a `Main` object.

No:

```java
Main m = new Main();
```

is needed just to start the program.

---

# 6. Static Block

A static initialization block is:

```java
static {
    // code
}
```

It is used for class-level initialization.

Example:

```java
class Demo {

    static {
        System.out.println("Static block");
    }

    public static void main(String[] args) {
        System.out.println("Main method");
    }
}
```

Output:

```text
Static block
Main method
```

The static block executes during class initialization, before `main()` in this example.

---

# 7. Multiple Static Blocks

A class can contain multiple static blocks.

```java
class Demo {

    static {
        System.out.println("Block 1");
    }

    static {
        System.out.println("Block 2");
    }

    public static void main(String[] args) {
        System.out.println("Main");
    }
}
```

Output:

```text
Block 1
Block 2
Main
```

They execute in source order.

---

# 8. Static Block vs Constructor

Static block:

```java
static {
    System.out.println("Static block");
}
```

- Related to class initialization.
- Runs once for a class initialization.

Constructor:

```java
Student() {
    System.out.println("Constructor");
}
```

- Runs when an object is created.
- Runs once for each object creation.

Example:

```java
class Student {

    static {
        System.out.println("Static");
    }

    Student() {
        System.out.println("Constructor");
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
    }
}
```

Output:

```text
Static
Constructor
Constructor
```

---

# 9. Static Variable + Static Method + Constructor

```java
class Student {

    String name;

    static int count = 0;

    Student(String name) {
        this.name = name;
        count++;
    }

    static void showCount() {
        System.out.println("Students: " + count);
    }
}
```

Usage:

```java
Student s1 = new Student("Rahul");
Student s2 = new Student("Amit");
Student s3 = new Student("Priya");

Student.showCount();
```

Output:

```text
Students: 3
```

Interpretation:

```text
name  -> instance variable -> separate per object
count -> static variable   -> one shared class-level value
showCount() -> static method -> class-level behavior
```

---

# 10. Anonymous Object

An anonymous object is an object created without storing its reference in a named variable.

Normal object:

```java
Calculator calc = new Calculator();

calc.add(10, 20);
```

Anonymous object:

```java
new Calculator().add(10, 20);
```

Important:

> An anonymous object is still a real object. It simply has no named reference variable retained in your code.

---

# 11. Anonymous Object Example

```java
class Student {

    void show() {
        System.out.println("Student details");
    }
}

public class Main {
    public static void main(String[] args) {

        Student s = new Student();
        s.show();

        new Student().show();
    }
}
```

The first call uses a named reference. The second uses an anonymous object.

---

# 12. When to Use an Anonymous Object

Use it when you need an object for an immediate, limited use and do not need to reuse that same object later.

For repeated use:

```java
Calculator calc = new Calculator();

calc.add(10, 20);
calc.multiply(5, 4);
```

is clearer.

Do not think anonymous objects automatically save memory. The object still has to be created.

---

# 13. Inheritance — What Is It?

Inheritance is an Object-Oriented Programming (OOP) mechanism where a child class inherits accessible members from a parent class.

```java
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }
}

class AdvCalculator extends Calculator {

    int multiply(int a, int b) {
        return a * b;
    }

    int divide(int a, int b) {
        return a / b;
    }
}
```

Here:

```text
Calculator
    ^
    |
AdvCalculator
```

`Calculator` is the parent/superclass.

`AdvCalculator` is the child/subclass.

`extends` establishes class inheritance.

---

# 14. Using Inherited Methods

```java
AdvCalculator obj = new AdvCalculator();

System.out.println(obj.add(10, 15));
System.out.println(obj.subtract(20, 5));
System.out.println(obj.multiply(5, 4));
System.out.println(obj.divide(10, 5));
```

Output:

```text
25
15
20
2
```

`add()` and `subtract()` come from the parent; `multiply()` and `divide()` are declared in the child.

---

# 15. Need of Inheritance

Major benefits include:

```text
code reuse
less duplication
better organization
easier maintenance
specialization of child classes
```

Without inheritance, common functionality may need to be duplicated.

With inheritance:

```text
Parent
  |
  +-- common functionality
        |
        v
      Child
```

Important design rule:

> Do not use inheritance only because you want to reuse code. The relationship should make semantic sense.

---

# 16. IS-A Relationship

Inheritance should generally represent an IS-A relationship.

Examples:

```text
Dog IS-A Animal
Car IS-A Vehicle
Manager IS-A Employee
```

Example:

```java
class Dog extends Animal {
}
```

A Car is not an Engine:

```text
Car IS-A Engine  -> wrong
Car HAS-A Engine -> meaningful
```

---

# 17. HAS-A vs IS-A

IS-A:

```java
class Car extends Vehicle {
}
```

HAS-A:

```java
class Engine {
}

class Car {
    Engine engine;
}
```

Use inheritance for meaningful IS-A relationships. A HAS-A relationship is generally represented through composition/association rather than inheritance.

---

# 18. Single Inheritance

One parent and one child:

```text
Parent
   ^
   |
 Child
```

Example:

```java
class Animal {

    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Barking");
    }
}
```

Usage:

```java
Dog d = new Dog();

d.eat();
d.bark();
```

Output:

```text
Eating
Barking
```

---

# 19. Multilevel Inheritance

A chain of inheritance:

```text
GrandParent
    ^
    |
  Parent
    ^
    |
   Child
```

Example:

```java
class Animal {

    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Barking");
    }
}

class Puppy extends Dog {

    void cry() {
        System.out.println("Crying");
    }
}
```

Usage:

```java
Puppy p = new Puppy();

p.eat();
p.bark();
p.cry();
```

Output:

```text
Eating
Barking
Crying
```

---

# 20. Multiple Inheritance

Multiple inheritance means one child has more than one parent.

Java does not allow a class to extend multiple classes:

```java
class Child extends A, B { // ERROR
}
```

A Java class can have only one direct superclass.

---

# 21. Diamond Problem

The classic ambiguous structure is:

```text
        A
       /       B   C
       \ /
        D
```

If B and C inherit or provide conflicting behavior, D could have ambiguity about which implementation to use.

For example:

```text
D -> B -> A
D -> C -> A
```

The ambiguity is called the **Diamond Problem**.

This is one reason Java does not support multiple inheritance of classes.

---

# 22. Multiple Interfaces

Java allows a class to implement multiple interfaces.

```java
interface Camera {
    void takePhoto();
}

interface GPS {
    void navigate();
}

class Smartphone implements Camera, GPS {

    public void takePhoto() {
        System.out.println("Taking photo");
    }

    public void navigate() {
        System.out.println("Navigating");
    }
}
```

Usage:

```java
Smartphone phone = new Smartphone();

phone.takePhoto();
phone.navigate();
```

Output:

```text
Taking photo
Navigating
```

Important:

```text
extends
    -> class inheritance
    -> one direct superclass

implements
    -> interface implementation
    -> multiple interfaces possible
```

---

# 23. `this` and `super`

Core meanings:

```text
this  -> current object/current class context
super -> parent-class context
```

---

# 24. `this.variable`

Example:

```java
class A {
    int x = 10;
}

class B extends A {

    int x = 20;

    void show() {
        System.out.println(this.x);
    }
}
```

Output:

```text
20
```

`this.x` refers to the field of the current object, which here is the field declared in `B`.

---

# 25. `super.variable`

```java
System.out.println(super.x);
```

prints:

```text
10
```

because `super.x` explicitly refers to the parent class field.

Complete example:

```java
class A {

    int x = 10;
}

class B extends A {

    int x = 20;

    void show() {
        System.out.println(this.x);
        System.out.println(super.x);
    }
}
```

Output:

```text
20
10
```

---

# 26. `super.method()`

A child can explicitly invoke the parent implementation of a method.

```java
class A {

    void show() {
        System.out.println("A show");
    }
}

class B extends A {

    void show() {
        System.out.println("B show");
        super.show();
    }
}
```

Usage:

```java
B obj = new B();
obj.show();
```

Output:

```text
B show
A show
```

---

# 27. `this()` in a Constructor

`this()` invokes another constructor in the **same class**.

```java
class B {

    B() {
        System.out.println("B()");
    }

    B(int x) {
        this();
        System.out.println("B(int)");
    }
}
```

Usage:

```java
B obj = new B(5);
```

Flow:

```text
B(int)
  |
  | this()
  v
B()
  |
  v
back to B(int)
```

Output:

```text
B()
B(int)
```

---

# 28. `super()` in a Constructor

`super()` invokes a constructor in the parent class.

```java
class A {

    A() {
        System.out.println("A()");
    }
}

class B extends A {

    B() {
        super();
        System.out.println("B()");
    }
}
```

Usage:

```java
B obj = new B();
```

Output:

```text
A()
B()
```

---

# 29. Constructor Chaining

Example:

```java
class A {

    A() {
        System.out.println("A");
    }
}

class B extends A {

    B() {
        super();
        System.out.println("B");
    }

    B(int x) {
        this();
        System.out.println("B int");
    }
}
```

Usage:

```java
B obj = new B(5);
```

Execution:

```text
B(int)
  |
  | this()
  v
B()
  |
  | super()
  v
A()
  |
  | returns
  v
B()
  |
  | returns
  v
B(int)
```

Output:

```text
A
B
B int
```

Constructor calls are nested; the calls return outward after the invoked constructor finishes.

---

# 30. `this()` vs `super()`

Memorize:

```text
this()
    -> another constructor in the same class

super()
    -> parent-class constructor
```

Likewise:

```text
this.variable
    -> current object's field

super.variable
    -> parent-class field
```

And:

```text
this.method()
    -> current object/current class method

super.method()
    -> parent-class method
```

A constructor can directly chain to another constructor in the same class OR to a superclass constructor. `this(...)` and `super(...)` must be the first constructor invocation statement when used.

---

# 31. Constructors Are Not Inherited

If:

```java
class A {

    A() {
    }
}

class B extends A {
}
```

`B` does not inherit `A()` as a normal inherited member.

However, when a `B` object is created, the parent constructor participates in initialization through constructor chaining.

This is why `super()` matters.

---

# 32. Parent Private Members

A child class cannot directly access a parent's private field.

```java
class Parent {

    private int secret = 100;
}

class Child extends Parent {

    void show() {
        // System.out.println(secret); // ERROR
    }
}
```

Access to such data needs an appropriate public/protected method or another design.

Access modifiers will be covered later.

---

# 33. Complete Static + OOP Mental Model

```text
CLASS LEVEL
    |
    +-- static variable
    +-- static method
    +-- static block


OBJECT LEVEL
    |
    +-- instance variable
    +-- instance method
    +-- constructor
    +-- this


INHERITANCE
    |
    +-- parent/superclass
    +-- child/subclass
    +-- extends
    +-- super
```

Key distinction:

```text
static  -> class-level
instance -> object-level
```

---

# 34. Key Rules

```text
1. Static method -> class-level method.
2. Static method has no implicit this.
3. Static method can directly access static members.
4. Static method cannot directly access instance members.
5. Static block -> class initialization.
6. Constructor -> object creation/initialization.
7. Anonymous object -> object without a named reference variable.
8. extends -> class inheritance.
9. A Java class can extend only one direct class.
10. implements -> interface implementation.
11. A class can implement multiple interfaces.
12. Inheritance should represent a meaningful IS-A relationship.
13. this -> current object.
14. super -> parent-class context.
15. this() -> same-class constructor.
16. super() -> parent-class constructor.
17. super.method() -> parent implementation of a method.
18. Constructors are not inherited.
19. Compiler-provided default constructor appears only when no constructor is declared.
20. Constructor chaining explains parent/child constructor execution order.
```

---

# Next Topic

The next topic in the Telusko sequence is:

```text
52. Method Overriding
    ↓
53. Packages
    ↓
54. Access Modifiers
    ↓
55. Polymorphism
    ↓
56. Dynamic Method Dispatch
    ↓
57. final keyword
```

Method Overriding builds directly on:

```text
Inheritance
    +
same method in parent and child
    +
super.method()
    ↓
Method Overriding
```
