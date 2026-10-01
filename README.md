# Java Practice

A small Java learning workspace containing a console calculator and Java practice notes.

## Contents

- `Main.java` is a command-line calculator for addition, subtraction, multiplication, and division.
- `Demo.java` contains commented examples and notes covering Java basics, including conditionals, loops, methods, arrays, objects, and strings. The examples are study material and are not currently an active program.

## Requirements

Use a JDK to compile and run the programs. A JDK 25 distribution is included in this workspace; an installed JDK also works.

## Run the calculator

From the workspace root, using an installed JDK:

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