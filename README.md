# Java Practice

A visual guide to the concepts explored in `Demo.java`, alongside a runnable command-line calculator in `Main.java`.

> Most examples in `Demo.java` are commented out as study notes. The active example is the `Human` class at the bottom, which demonstrates encapsulation.

## Quick map

```text
Java program
├── Decide       if/else, ternary, switch
├── Repeat       while, do-while, for
├── Organize     methods, overloading, overriding
├── Store        arrays, matrices, jagged and 3D arrays
├── Model        classes, objects, references
└── Work with    strings, mutable text, encapsulation
```

## Decisions

### If / else

```text
		     ┌───────────────┐
		     │ Is x greatest?│
		     └───────┬───────┘
			   yes │ no
		     ┌───────▼──┐  ┌──────────────────┐
		     │ print x  │  │ Is y greatest?   │
		     └──────────┘  └────────┬─────────┘
						yes │ no
					┌─────────▼──┐  ┌──────────┐
					│ print y    │  │ print z  │
					└────────────┘  └──────────┘
```

Conditions are checked in order. The first true branch runs; `else` handles what remains. The parity example uses `x % 2 == 0` to decide even versus odd.

### Ternary operator

```text
condition ? value_when_true : value_when_false
     │               │                 │
     └────── choose one value ─────────┘

a % 2 == 0 ? 1 : 0
even         1   odd 0
```

Use it for a short choice between two values; use `if / else` when the branches need multiple statements.

### Switch

```text
day ──┬── 1 ──> Monday
	├── 2 ──> Tuesday
	├── 3 ──> Wednesday
	├── 4 ──> Thursday
	├── ...
	├── 7 ──> Sunday
	└── other -> default message
```

Each `case` matches one value. In the example, `break` exits the switch after the matching day; `default` catches values outside 1 through 7.

## Repetition

```text
while:       check ──true──> body ──┐
		   ▲                    │
		   └────────────────────┘
		     false -> continue

do-while:    body ──> check ──true──┐
		   ▲                    │
		   └────────────────────┘
		     false -> continue

for:         initialize -> check -> body -> update ─┐
					▲                     │
					└─────────────────────┘
					false -> continue
```

- `while` checks before the body, so it may run zero times.
- `do-while` checks after the body, so it always runs at least once.
- `for` keeps initialization, condition, and update together. The example counts down from 5 to 1.

## Methods and object-oriented programming

### Methods: call, work, return

```text
main() ── calls ──> getMeApen(cost)
				 │
				 ├── cost > 10 ──> "Here is a pen"
				 └── otherwise ──> apology message
					   │
main() <──── returned String ────┘
```

A method packages work behind a name. It may accept parameters and return a value. The `Computer` examples also show `playMusic()`, `playVideo()`, and methods that set and display an object's fields.

### Classes and objects

```text
class Student                 objects made from that class
┌──────────────────┐          ┌──────────────┐  ┌──────────────┐
│ name             │ creates  │ Vikas        │  │ Rohit        │
│ age              ├─────────>│ age: 25      │  │ age: 26      │
│ marks            │          │ marks: 80    │  │ marks: 90    │
└──────────────────┘          └──────────────┘  └──────────────┘
```

A class describes fields and behavior; `new Student()` creates an object with its own field values. Variables such as `s1` refer to objects rather than containing the objects themselves.

### Method overloading

```text
area(5)       ──> area(int side)              ──> square area
area(5, 10)   ──> area(int length, int width) ──> rectangle area
area(5.0)     ──> area(double radius)         ──> circle area
			 same name, different parameter lists
```

The compiler selects an overloaded method from the argument count and types. Return type alone is not enough to create a separate overload.

### Method overriding

```text
Animal reference ── calls ──> sound()
					    │
		     actual object's class chooses implementation
					    ▼
			   Animal.sound() or subclass.sound()
```

Overriding lets a subclass provide its own implementation of an inherited instance method. The current `Animal` snippet demonstrates the base method; adding a subclass that overrides `sound()` would complete the dispatch example.

## Arrays

### One-dimensional array

```text
index:    0      1      2      3      4
	 ┌──────┬──────┬──────┬──────┬──────┐
value: │  10  │  20  │  30  │  40  │  50  │
	 └──────┴──────┴──────┴──────┴──────┘
		     arr[index]
```

An array stores a fixed-length sequence of values of one type. Indexes start at zero, and `arr.length` gives the number of elements.

### Two-dimensional array / matrix

```text
arr[row][column]

		 column 0  column 1  column 2  column 3
	     ┌─────────┬─────────┬─────────┬─────────┐
row 0      │    1    │    2    │    3    │    4    │
	     ├─────────┼─────────┼─────────┼─────────┤
row 1      │    5    │    6    │    7    │    8    │
	     ├─────────┼─────────┼─────────┼─────────┤
row 2      │    9    │   10    │   11    │   12    │
	     └─────────┴─────────┴─────────┴─────────┘
```

A 2D array is an array of row arrays. The outer loop visits rows; the inner loop visits each row's columns. A matrix is a rectangular arrangement of values, commonly represented this way.

### Jagged array

```text
arr[0] ──> [  ][  ]                 2 columns
arr[1] ──> [  ][  ][  ][  ]          4 columns
arr[2] ──> [  ][  ][  ]              3 columns
```

Rows are separate arrays, so they can have different lengths. Always use `arr[row].length` when iterating across a row.

### Three-dimensional array

```text
arr[depth][row][column]

		  depth 0                  depth 1
	    ┌───────────────┐         ┌───────────────┐
	    │ 2D layer      │         │ 2D layer      │
	    │ 3 rows        │         │ 3 rows        │
	    │ 4 columns/row │         │ 4 columns/row │
	    └───────────────┘         └───────────────┘
		   arr[0]                    arr[1]
```

The example's `new int[2][3][4]` creates 2 layers, each with 3 rows of 4 integers.

## Strings

### String basics

```text
String name = "JAVA"
		  ┌───┬───┬───┬───┐
index         │ 0 │ 1 │ 2 │ 3 │
character     │ J │ A │ V │ A │
		  └───┴───┴───┴───┘
length() = 4                 last index = length() - 1
charAt(2) = 'V'
```

Strings are immutable: an operation such as `toUpperCase()` returns a string value; it does not change the original object. A loop from `0` to `name.length() - 1` visits every character.

```text
"Java Programming"
	│
	├── length()       -> number of characters
	├── charAt(0)      -> first character
	├── charAt(length - 1) -> last character
	├── toUpperCase()  -> "JAVA PROGRAMMING"
	└── toLowerCase()  -> "java programming"
```

`+` behaves differently depending on the values: `10 + 20` is numeric addition (`30`), while `"10" + 20` concatenates text (`"1020"`).

### StringBuilder and StringBuffer

```text
String (immutable)             StringBuilder / StringBuffer (mutable)
"Hello"                        "Hello"
   │ append(" World")             │ append(" World")
   ▼                               ▼
new value: "Hello World"       same buffer: "Hello World"
original remains "Hello"      contents changed in place
```

Both buffer classes support editable text. `StringBuilder` is generally preferred for single-threaded work; `StringBuffer` synchronizes its methods for thread-safe use.

## Encapsulation

```text
outside code                         Human object
obj.setName("Vikas") ──────────────> ┌────────────────────┐
obj.setAge(25) ────────────────────> │ private name, age  │
						 │                    │
obj.getName() <───────────────────── │ controlled access  │
obj.getAge()  <───────────────────── │ through methods    │
						 └────────────────────┘
```

Private fields hide the object's internal state. Public getters and setters provide a controlled way to read or update it. The active `Human` example sets and then prints the name and age.

## Runnable calculator

`Main.java` reads two numbers and an operator, then follows this path:

```text
read number 1, number 2, operator
		     │
	 ┌─────────┼──────────┐
	 +         -          * or /
	 │         │             │
    add them  subtract     calculate
					│
				 divisor is zero?
				 yes       no
				  │         │
			     report    divide
				  └────┬────┘
					 ▼
				 print result

unknown operator ──> report invalid operator
```

## Run the calculator

Use an installed JDK from the workspace root:

```sh
javac Main.java
java Main
```

Or use the bundled JDK 25:

```sh
JDK=./OpenJDK25U-jdk_x64_linux_hotspot_25.0.4.1_1/jdk-25.0.4.1+1/bin
"$JDK/javac" Main.java
"$JDK/java" Main
```

Enter two numbers, then one of `+`, `-`, `*`, or `/`. Division by zero and unsupported operators are reported instead of producing a result.