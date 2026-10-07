# Java Practice — Visual Learning Guide

This workspace contains Java learning examples and a working command-line calculator. The source is intentionally organized as study material rather than one large application.

> **Important:** Most examples in [Demo.java](Demo.java) are commented out. Read the examples and uncomment one block at a time. [Main.java](Main.java) is the active calculator program.

## 1. Project map

```text
Demo.java
├── Conditions       if / else, ternary, switch
├── Loops            while, do-while, for
├── Methods          Computer, AreaCalculator, method overloading
├── Arrays           1D, 2D, jagged, 3D
├── Classes          Student, Human, Person, Mobile, BankAccount
├── Constructors     ConstructorDemo, Default vs parameterized
├── Static fields     Mobile, Student
├── Inheritance       Calculator → AdvCalculator
│                   Animal → Dog → Puppy
│                   GrandParent → Parent → Child
│                   A → B
├── Encapsulation   Human, Person, BankAccount, Employee
├── Strings          String, StringBuffer, StringBuilder
└── Anonymous objects Calculator, Student

Main.java
└── Calculator
    ├── Reads two numbers and an operator
    ├── Performs the selected operation
    └── Reports invalid input or division by zero
```

---

## 2. Main and calculator

### Main.java

[Main.java](Main.java) is the active program. It reads two `double` values and one operator:

```text
Start
  │
  ├── Read num1
  ├── Read num2
  ├── Read operator
  │
  ├── '+'  ──> add
  ├── '-'  ──> subtract
  ├── '*'  ──> multiply
  ├── '/'  ──> divide
  │          └── if divisor == 0 → error
  └── other → invalid operator
```

```java
public class Main {
    public static void main(String[] args) {
        // The source contains the calculator logic.
    }
}
```

### Supported operations

| Operator | Meaning | Example |
|---|---|---|
| `+` | Addition | `10 + 5 = 15` |
| `-` | Subtraction | `10 - 5 = 5` |
| `*` | Multiplication | `10 * 5 = 50` |
| `/` | Division | `10 / 5 = 2` |

The calculator prevents division by zero and rejects unsupported operators.

### Run

```sh
JDK=./OpenJDK25U-jdk_x64_linux_hotspot_25.0.4.1_1/jdk-25.0.4.1+1/bin
"$JDK/javac" Main.java
"$JDK/java" Main
```

Input example:

```text
Enter the numbers:
8
2
Enter the operator (+, -, *, /):
/
The final result:
8.0 / 2.0 = 4.0
```

---

## 3. Conditional statements

### If / else

```text
if (condition)
    run first branch
else if (another condition)
    run second branch
else
    run final branch
```

```text
┌─────────────────────────────┐
│ Is x greater than y and z?  │
└──────────────┬──────────────┘
               │ yes          │ no
               ▼              ▼
          print x          Check y
                               │
                               ├── yes → print y
                               └── no  → print z
```

The source first checks whether `x` is the greatest value. If it is not, it checks `y`; otherwise, it prints `z`.

### Even or odd

```text
x % 2 == 0
    │
    ├── true  → x is even
    └── false → x is odd
```

The remainder operator `%` gives the remainder after division:

- `5 % 2 = 1`
- `6 % 2 = 0`

### Ternary operator

```text
condition ? value_if_true : value_if_false
```

```text
x is even ? 1 : 0
    │
    ├── true  → 1
    └── false → 0
```

Use the ternary operator when you need one value from two choices. Use `if / else` when the branches contain multiple statements.

### Switch statement

```text
switch (day)
    case 1 → Monday
    case 2 → Tuesday
    case 3 → Wednesday
    case 4 → Thursday
    case 5 → Friday
    case 6 → Saturday
    case 7 → Sunday
    default → invalid day
```

```text
                day
                 │
       ┌─────────┼─────────┐
       │         │         │
     case 1    case 2    case 3
       ▼         ▼         ▼
     Monday    Tuesday   Wednesday
```

The `break` keyword stops the switch after the matching case. The `default` case runs when no listed value matches.

---

## 4. Loops

### while loop

```text
start
  │
  ├── condition true? → execute body → repeat
  │                         │
  └─────────────────────────┘
                              false → end
```

```text
while (i < 5) {
    print(i);
    i++;
}
```

The condition is checked before the body. If `i < 5` is false from the beginning, the body never runs.

### do-while loop

```text
start
  │
  ├── execute body
  │
  ├── condition true? → execute body again
  │
  └── condition false → end
```

The body runs once before the condition is checked.

### for loop

```text
for (initialization; condition; update)
```

```text
for (int i = 5; i > 0; i--)
    print(i);
```

```text
initialize i = 5
   │
   ├── check i > 0
   │
   ├── print i
   │
   └── update i = i - 1
            │
            └── repeat until false
```

The source uses this pattern to print `5, 4, 3, 2, 1`.

---

## 5. Computer

`Computer` demonstrates methods, fields, and method calls.

### Class and object flow

```text
Computer class
├── playMusic()
├── playVideo()
├── getMeApen(cost)
└── setData(ram, storage, processor)

c1 = new Computer()
  │
  ├── c1.playMusic()       → call method
  ├── c1.playVideo()       → call method
  └── c1.getMeApen(12)     → method returns a value
```

### Method call

```text
Computer c1 = new Computer();
String pen = c1.getMeApen(12);
```

The method checks its parameter:

```text
cost > 10
  ├── true  → "Here is a pen"
  └── false → "Sorry, it has come cost"
```

---

## 6. AreaCalculator and method overloading

`AreaCalculator` has methods with the same name but different parameter lists.

```text
area(int side)
    └── square = side × side

area(int length, int breadth)
    └── rectangle = length × breadth

area(double radius)
    └── circle = π × radius × radius
```

```text
area(5)
    └── calls area(int side)

area(5, 10)
    └── calls area(int length, int breadth)

area(5.0)
    └── calls area(double radius)
```

```java
int square = calculator.area(5);
int rectangle = calculator.area(5, 10);
double circle = calculator.area(5.0);
```

The compiler selects the method based on the number and type of arguments.

---

## 7. Method overriding

The `Animal` example contains a method called `sound()`.

```text
Animal
└── sound()
    └── prints "Animal makes a sound"

Animal reference
  │
  └── calls sound()
        │
        └── actual object's class decides the implementation
```

A subclass can replace an inherited method:

```text
Animal
└── sound()

Dog extends Animal
└── sound() → overrides Animal.sound()
```

```java
Animal animal = new Dog();
animal.sound();
```

The runtime object is a `Dog`, so the `Dog.sound()` implementation is used.

---

## 8. Arrays

### One-dimensional array

```text
int arr[] = new int[5];

index: 0  1  2  3  4
value: 10 20 30 40 50
```

```text
arr[0] → 10
arr[1] → 20
arr[2] → 30
arr[3] → 40
arr[4] → 50
```

```java
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
```

### Two-dimensional array

A two-dimensional array is an array of arrays.

```text
arr[row][column]

          column 0 column 1 column 2 column 3
row 0       1       2       3       4
row 1       5       6       7       8
row 2       9      10      11      12
```

```text
arr[0][0] → 1
arr[1][2] → 7
arr[2][3] → 12
```

```text
outer loop ──> row
    inner loop ──> column
```

### Matrix

A matrix is a rectangular array of values.

```text
3 rows × 4 columns

┌────┬────┬────┬────┐
│ 1  │ 2  │ 3  │ 4  │
├────┼────┼────┼────┤
│ 5  │ 6  │ 7  │ 8  │
├────┼────┼────┼────┤
│ 9  │10  │11  │12  │
└────┴────┴────┴────┘
```

### Jagged array

Rows can have different lengths.

```text
arr[0] → [2 values]
arr[1] → [4 values]
arr[2] → [3 values]
```

```text
arr[0] → [10, 20]
arr[1] → [30, 40, 50, 60]
arr[2] → [70, 80, 90]
```

Use `arr[row].length` to find the length of the current row.

### Three-dimensional array

```text
arr[depth][row][column]

arr[0] → first 2D layer
arr[1] → second 2D layer
```

```text
int arr[][][] = new int[2][3][4];

2 layers
└── each layer has 3 rows
      └── each row has 4 columns
```

This produces $2 \times 3 \times 4 = 24$ elements.

---

## 9. Object-oriented programming

### Classes and objects

```text
class Student
├── name
├── age
└── marks

s1 = new Student()
s2 = new Student()
```

```text
Student class             Object s1             Object s2
┌──────────────┐         ┌──────────────┐       ┌──────────────┐
│ fields        │         │ name = Vikas │       │ name = Rohit │
│ behavior      │         │ age = 25     │       │ age = 26     │
└──────────────┘         └──────────────┘       └──────────────┘
```

A class is a blueprint. An object is a created instance of that blueprint.

### Student

The `Student` examples store a student's name, age, and marks. A method such as `showDetails()` retrieves or prints the stored values.

### Human

`Human` demonstrates encapsulation.

```text
Human
├── private name
├── private age
├── getName()
├── setName(String)
├── getAge()
└── setAge(int)
```

```text
outside code → setName("Vikas") → private name
outside code → setAge(25)     → private age
outside code → getName()      → returns name
outside code → getAge()       → returns age
```

The private fields cannot be changed directly. The public getter and setter methods provide controlled access.

### Person

`Person` follows the same encapsulation pattern for `name` and `age`.

```text
Person
├── private name
├── private age
├── getName()
├── setName()
├── getAge()
└── setAge()
```

### BankAccount

`BankAccount` protects its balance.

```text
BankAccount
└── private balance

setBalance(5000) → balance = 5000
setBalance(-1000) → invalid balance → balance remains unchanged
```

The setter validates input before assigning it.

### Employee

`Employee` stores `name` and `salary` behind private fields. Public getter and setter methods provide controlled access.

```text
Employee
├── name
├── salary
├── getName()
├── setName()
├── getSalary()
└── setSalary()
```

---

## 10. Constructors

A constructor initializes an object when it is created.

```text
new ConstructorDemo()
        │
        ├── constructor runs
        ├── name = "Abhishek"
        └── age = 28
```

### ConstructorDemo

The source includes:

- A default constructor with no parameters
- A parameterized constructor with values
- Getter and setter methods

```text
new ConstructorDemo()
    └── ConstructorDemo(String name, int age)

new ConstructorDemo("Vikas", 25)
    └── initializes fields from arguments
```

### Default versus parameterized constructor

```text
new Default_VS_ParameterizedConstructor()
    └── default constructor → John, 12

new Default_VS_ParameterizedConstructor("Rahul", 25)
    └── parameterized constructor → supplied values
```

The Java compiler provides a default constructor only when no constructor is explicitly declared.

---

## 11. Static variables

A static variable belongs to the class, not to one object.

```text
Mobile class
├── static brand = "Apple"
├── int price
└── String name

obj1 → price = 110999, name = iPhone 13
obj2 → price = 129000, name = iPhone 16 Pro

Mobile.brand
    └── shared by obj1 and obj2
```

```text
Mobile.brand = "Apple"

obj1.brand → Apple
obj2.brand → Apple
```

Instance variables are copied per object. Static variables have one shared class-level value.

### Mobile

`Mobile` demonstrates:

- Static class variable `brand`
- Instance variables `price` and `name`
- Accessing `brand` through the class name

### Static Student example

The source also shows `Student.college`:

```text
Student class
├── static college = "LPU"
├── name
└── age

Student s1 → Rahul, 25
Student s2 → Amit, 22

s1.college → LPU
s2.college → LPU
```

```text
Student.college = "ABC University"

s1.college → ABC University
s2.college → ABC University
```

---

## 12. Inheritance

Inheritance lets a child class reuse methods and fields from a parent class.

### Calculator → AdvCalculator

```text
Calculator
├── add(int, int)
└── subtract(int, int)

AdvCalculator extends Calculator
├── inherited add()
├── inherited subtract()
├── multiply(int, int)
└── divide(int, int)
```

```text
AdvCalculator obj = new AdvCalculator()
  │
  ├── obj.add(10, 15)       → inherited method
  ├── obj.subtract(20, 5)   → inherited method
  ├── obj.multiply(5, 4)    → child method
  └── obj.divide(10, 5)     → child method
```

The child does not copy the parent's methods. It inherits accessible members through `extends`.

### Animal → Dog → Puppy

```text
Animal
└── eat()

Dog extends Animal
├── eat() inherited
└── bark()

Puppy extends Dog
├── eat() inherited
├── bark() inherited
└── cry()
```

```text
Puppy p = new Puppy();
p.eat();   → Animal method
p.bark();  → Dog method
p.cry();  → Puppy method
```

### GrandParent → Parent → Child

```text
GrandParent
└── eat()

Parent extends GrandParent
├── eat() inherited
└── walk()

Child extends Parent
├── eat() inherited
├── walk() inherited
└── talk()
```

```text
Child ch = new Child();
ch.eat();   → GrandParent
ch.walk();  → Parent
ch.talk();  → Child
```

### A → B

The source demonstrates constructor calls using `super()` and `this()`.

```text
A
└── no-argument constructor

B extends A
├── calls super() → A constructor
└── adds B behavior
```

```text
B constructor
  │
  ├── super() → A constructor runs
  └── B constructor finishes
```

`super()` calls the parent constructor. `this()` calls another constructor in the same class.

---

## 13. this and super

### this

`this` refers to the current object.

```text
class Student {
    private String name;

    void setName(String name) {
        this.name = name;
    }
}
```

`this.name` refers to the object's `name`, not the method parameter named `name`.

### super

`super` refers to the parent class.

```text
class B extends A {
    B(int value) {
        super(value);
    }
}
```

The parent constructor runs before the child constructor finishes.

---

## 14. Anonymous objects

An anonymous object is created without storing it in a named variable.

```text
Named object
Calculator calc = new Calculator();
calc.add(10, 5);
```

```text
Anonymous object
new Calculator().add(10, 5);
```

```text
new Calculator().add(10, 5)
        │
        ├── creates Calculator object
        ├── calls add(10, 5)
        └── result is used immediately
```

The object does not have a reference variable after the expression finishes. The result is still available to the calling expression.

### Anonymous object with constructor

```text
new Student("Rahul").show();
```

```text
create Student("Rahul")
        │
        ├── constructor runs
        ├── name receives Rahul
        └── show() prints Rahul
```

---

## 15. Object versus anonymous object

```text
Named object
Calculator calc = new Calculator();
int result = calc.add(15, 10);
System.out.println(result);
```

```text
Anonymous object
System.out.println(new Calculator().add(15, 10));
```

| Feature | Named object | Anonymous object |
|---|---|---|
| Reference | Stored in a variable | No named reference |
| Reuse | Possible | Usually one-time use |
| Memory lifetime | Can continue after the statement | Usually temporary |
| Example | `Calculator calc` | `new Calculator()` |

---

## 16. String operations

### String basics

```text
String name = "JAVA";

index: 0  1  2  3
value: J  A  V  A
```

```text
name.length()        → 4
name.charAt(0)       → J
name.charAt(2)       → V
name.charAt(3)       → A
name.toUpperCase()   → JAVA
name.toLowerCase()   → java
```

Strings are immutable. A method such as `toUpperCase()` creates a new string instead of changing the original value.

### String task

```text
String name = "Java Programming";

name.length() - 1
    └── obtains the final index
```

```java
System.out.println(name.charAt(name.length() - 1));
```

The built-in `length()` method is used instead of hard-coding a value such as `15`.

### String concatenation

```text
10 + 20          → 30
"10" + 20        → "1020"
"Java" + " " + "Programming" → "Java Programming"
```

If either operand is a `String`, the `+` operator performs concatenation.

### StringBuffer and StringBuilder

```text
String        immutable
StringBuffer  mutable and synchronized
StringBuilder mutable and faster
```

```text
StringBuffer sb = new StringBuffer("Hello");
sb.append(" World");
```

```text
Hello
  │ append(" World")
  ▼
Hello World
```

`StringBuilder` is usually preferred when synchronization is not required. `StringBuffer` is useful when multiple threads need synchronized access.

---

## 17. Important topic summary

```text
Java learning path
├── Write a class and object
│   └── class → object → fields → methods
├── Use conditions and loops
│   └── choose and repeat
├── Create methods
│   └── parameters → return value
├── Use arrays
│   └── store multiple values
├── Protect data
│   └── private fields + getters/setters
├── Build objects
│   └── constructor → initialization
├── Reuse code
│   └── inheritance
├── Share class-scoped values
│   └── static fields
└── Create temporary objects
    └── anonymous objects
```

---

## 18. Run and inspect the examples

1. Uncomment one Java example block in [Demo.java](Demo.java).
2. Compile the source with the bundled JDK.
3. Run the relevant example when it contains a `main()` method.

### Sample compilation

```sh
JDK=./OpenJDK25U-jdk_x64_linux_hotspot_25.0.4.1_1/jdk-25.0.4.1+1/bin
"$JDK/javac" -d /tmp/java-practice Main.java Demo.java
```

Because many source examples contain separate `Main` classes, uncommenting a block may require compiling only the intended file or a small separate snippet. Run the active calculator with:

```sh
printf '8\n2\n/\n' | "$JDK/java" -cp /tmp/java-practice Main
```

---

## 19. Topic checklist

- [x] `Main` calculator
- [x] `Computer`
- [x] `AreaCalculator`
- [x] `Animal`
- [x] `Dog`
- [x] `Puppy`
- [x] `GrandParent`
- [x] `Parent`
- [x] `Child`
- [x] `Human`
- [x] `Person`
- [x] `ConstructorDemo`
- [x] `Mobile`
- [x] `Student`
- [x] `BankAccount`
- [x] `Employee`
- [x] `Calculator`
- [x] `AdvCalculator`
- [x] `A` and `B`
- [x] Conditionals and loops
- [x] Methods and overloading
- [x] Arrays and matrices
- [x] Strings and buffers
- [x] Encapsulation
- [x] Constructors
- [x] Static variables
- [x] Inheritance
- [x] `this` and `super`
- [x] Anonymous objects
