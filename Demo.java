//===========================> If Else Statement: <========================

// public class Demo {
//     public static void main(String[] args){
//         int x = 10;
//         int y = 9;
//         int z = 11;
//         if(x>y && x>z)
//             System.out.println(x);
//         else if(y > x && y > z)
//             System.out.println(y);
//         else
//             System.out.println(z);
//     }
    
// }


//===========================> Even Odd Number: <========================

// public class Demo {
//     public static void main(String[] args){
//         int x = 5;
        
//         if (x%2==0)
//             System.out.println(x + " is an Even number");
//         else
//             System.out.println(x + " is an Odd number");
//     }
    
// }


//===========================> Ternary Operator <========================

// public class Demo{
//     public static void main(String[] args){
//         int a = 10;
//         int result = a % 2 == 0? 1 : 0;
//         System.out.println(result);
//     }
// }

//==============================>>> Switch Statement <<<==============================

// public class Demo{
//     public static void main(String[] args){
//         int day = 4;
//         switch(day){
//             case 1:
//                 System.out.println("Monday");
//                 break;
//             case 2:
//                 System.out.println("Tuesday");
//                 break;
//             case 3:
//                 System.out.println("Wednesday");
//                 break;
//             case 4:
//                 System.out.println("Thursday");
//                 break;
//             case 5:
//                 System.out.println("Friday");
//                 break;
//             case 6:
//                 System.out.println("Saturday");
//                 break;
//             case 7:
//                 System.out.println("Sunday");
//                 break;
//             default:
//                 System.out.println("Enter a valid day");

//         }
//     }
// }


//===========================> Loops <========================

//===========================>>> while Loop: <<<========================

// public class Demo{
//     public static void main(String[] args){
//         int i = 0;
//         while(i<5){
//             System.out.println(i);
//             i++;
//         }
//     }
// }


//===========================>>> do while Loop: <<<========================

// public class Demo{
//     public static void main(String[] args){
//         int i = 5;
//         do{
//             System.out.println(i);
//             i++;
//         }while(i<5);
//     }
// }


//======================>>> for Loop: <<<========================

// public class Demo{
//     public static void main(String[] args){
//         for(int i = 5; i > 0; i--){
//             System.out.println("Java " + i);
//         }
//     }
// }


//=================================>>>> Methods <<<==============================

//============>>> Little Simple Example: <<<===============================

// class Computer{
//     public void playMusic(){
//         System.out.println("Music is playing");
//     }
//     public void playVideo(){
//         System.out.println("Video is playing");
//     }

//     public String getMeApen(int cost){
//         if(cost > 10){
//             return "Here is a pen";
//         }
//         else{
//             return "Sorry, It has come cost, thats not in free of cost";
//         }
//     }
// }
// class Demo{
//     public static void main(String[] args){
//         Computer c1 = new Computer();
//         c1.playMusic();
//         c1.playVideo();
//         String pen = c1.getMeApen(12);
//         System.out.println(pen);
//     }
// }




//=================>>> Little Complex Example: <<<===============================

// class Computer{
//     int ram;
//     int storage;
//     String processor;

//     void setData(int r, int s, String p){
//         ram = r;
//         storage = s;
//         processor = p;
//     }

//     void showData(){
//         System.out.println("Ram: " + ram + "GB");
//         System.out.println("Storage: " + storage + "GB");
//         System.out.println("Processor: " + processor);
//     }
// }

// public class Demo{
//     public static void main(String[] args){
//         Computer c1 = new Computer();
//         c1.setData(8, 512, "Intel i5");
//         c1.showData();
//     }
// }


//=================>>> Method Overloading <<<===============================

// class AreaCalculator{
//     public int area(int side){
//         int Square = side * side;
//         return Square;
//     }
//     public int area(int length, int breadth){
//         int Rectangle = length * breadth;
//         return Rectangle;
//     }
//     public double area(double radius){
//         double Circle = 3.14159 * radius * radius;
//         return Circle;
//     }
// }
// public class Demo{
//     public static void main(String[] args){
//         AreaCalculator calc = new AreaCalculator();
//         int Square = calc.area(5);
//         int Rectangle = calc.area(5, 10);
//         double Circle = calc.area(5.0);
//         System.out.println("Square: " + Square);
//         System.out.println("Rectangle: " + Rectangle);
//         System.out.println("Circle: " + Circle);
//     }
// }


// =============================== =>>>> Method Overriding <<<<==============================

// class Animal{
//     public void sound(){
//         System.out.println("Animal makes a sound");
//     }
//     public static void main(String[] args) {
//         Animal a = new Animal();
//         a.sound();
        
//     }
// }

// =========== Array =================
/* 
- What is an Array?

- An array is a collection of values of the same data type, 
stored under a single variable name and accessed using an index. */

// class Demo{
//     public static void main(String[] args){
//         int arr[] = new int[5];
//         arr[0] = 10;
//         arr[1] = 20;
//         arr[2] = 30;
//         arr[3] = 40;
//         arr[4] = 50;
//         for (int i = 0; i < arr.length; i++) {
//             System.out.println(arr[i]);
//         }
//     }
// }

// ================ Multi-dimensional Array ========================
/*
- The main idea is that a 
multidimensional array is an array whose elements are themselves arrays. 
In Java, a 2D array is essentially an array of 1D arrays, 
and a 3D array is an array of 2D arrays.

==> A 2D array is an array organized into rows and columns.

Here:
new int[3][4]
means:
    3 → number of rows
    4 → number of columns
    Total elements = 3 × 4 = 12

*/

// class Demo{
//     public static void main(String[] args){
//         int arr[][] = new int[3][4];
//         arr[0][0] = 1;
//         arr[0][1] = 2;
//         arr[0][2] = 3;
//         arr[0][3] = 4;  
//         arr[1][0] = 5;
//         arr[1][1] = 6;
//         arr[1][2] = 7;
//         arr[1][3] = 8;
//         arr[2][0] = 9;
//         arr[2][1] = 10;
//         arr[2][2] = 11; 
//         arr[2][3] = 12;
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

//      [1, 2, 3, 4]
//      [5, 6, 7, 8]
//      [9, 10, 11, 12]
// Its a matrix of 3 rows and 4 columns. The outer loop iterates through the rows, and the inner loop iterates through the columns of each row, printing the elements in a matrix format.


// ============ Matrix {Multi-dimensional Array} =====================
/* 
- Matrix
A matrix is a rectangular arrangement of values in rows and columns.
*/

// class Demo{
//     public static void main(String[] args){
//         int arr[][] = new int[3][4];
//         for (int i = 0; i < 3; i++){
//             for(int j = 0; j < 4; j++){
//                 arr[i][j] = (int)(Math.random()*10);
//             }
//         }
//         for(int n[] : arr){
//             for(int m : n){
//                 System.out.print(m + " ");
//             }
//             System.out.println();
//         }
//     }
// }


// ===========================> Jagged Array <===========================

/* 

- A jagged array is a 2D array in which each row can have a different number of columns.
 
*/

// class Demo{
//     public static void main(String[] args) {
//         int arr[][] = new int[3][];
//         arr[0] = new int[2];
//         arr[1] = new int[4];
//         arr[2] = new int[3];
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 arr[i][j] = (int)(Math.random()*10);
//             }
//         }
//         for(int n[] : arr){
//             for(int m : n){
//                 System.out.print(m + " ");
//             }
//             System.out.println();
//         }
//     }
// }


//=======================> Three Dimensional Array <========================

// class Demo{
//     public static void main(String[] args) {
//         int arr[][][] = new int[2][3][4];
//         for (int i = 0; i < 2; i++) {
//             for (int j = 0; j < 3; j++) {
//                 for (int k = 0; k < 4; k++) {
//                     arr[i][j][k] = (int)(Math.random()*10);
//                 }
//             }
//         }
//         for(int n[][] : arr){
//             for(int m[] : n){
//                 for(int p : m){
//                     System.out.print(p + " ");
//                 }
//                 System.out.println();
//             }
//             System.out.println();
//         }
//     }
// }

//====================> Object Oriented Programming <========================
//=======================> Practice <==================================

// class Student{
//     String name;
//     int age;
//     int marks;
//     public static void main(String[] args) {
//         Student s1 = new Student();
//         s1.name = "vikas";
//         s1.age = 25;
//         s1.marks = 80;

//         Student s2 = new Student();
//         s2.name = "Rohit";
//         s2.age = 26;
//         s2.marks = 90;

//         Student s3 = new Student();
//         s3.name = "Ramesh";
//         s3.age = 27;
//         s3.marks = 70;

//         Student students[] = new Student[3];
//         students[0] = s1;
//         students[1] = s2;
//         students[2] = s3;

//         for(int i = 0; i<students.length; i++){
//             System.out.println("Name: " + students[i].name);
//             System.out.println("Age: " + students[i].age);
//             System.out.println("Marks: " + students[i].marks);
//             System.out.println();
//         }
//     }
// }    

/* 
- Explanation:
Student s1 = new Student(); // This creates a Student object.
                s1
                ↓
        ┌─────────────────┐
        │ Student object  │
        │                 │
        │ name  = "vikas" │
        │ age   = 25      │
        │ marks = 80      │
        └─────────────────┘

- The entire concept in one picture:

                  Student class
             ┌────────────────────┐
             │ String name        │
             │ int age             │
             │ int marks           │
             └────────────────────┘
                       │
              creates objects
                       ↓

       s1                 s2                 s3
        ↓                  ↓                  ↓
 ┌─────────────┐    ┌─────────────┐    ┌─────────────┐
 │ Vikas       │    │ Rohit       │    │ Ramesh      │
 │ 25          │    │ 26          │    │ 27          │
 │ 80          │    │ 90          │    │ 70          │
 └─────────────┘    └─────────────┘    └─────────────┘
        ↑                  ↑                  ↑
        │                  │                  │
        └────────┬─────────┴─────────┬────────┘
                 │                   │
                 ↓                   ↓
             students[] array
        ┌────────┬────────┬────────┐
        │ [0]    │ [1]    │ [2]    │
        │  s1    │  s2    │  s3    │
        └────────┴────────┴────────┘

Code 	            Meaning

class Student  	    Creates a blueprint for Student objects
new Student()  	    Creates a Student object
Student s1     	    Declares a reference to a Student
Student students[]	Declares an array of Student references
students[i].name  	Gets the name from the Student at index i

*/

//=======================> String <==================================

/* A String is an object that represents a sequence of characters. 
Unlike primitive data types (like int or char), 
String is a full class defined in the java.lang package

#------------Key Characteristics -----------------------

• Immutability: String objects are immutable, 
                meaning their values cannot be changed once they are created. 
                Any operation that appears to modify a string (like concatenation) 
                actually creates a brand-new String object.

• Memory Management: Java optimizes memory by storing string literals in 
                     a special region of the heap called the String Constant Pool.

        
#-- Core Mental model:

String
│
├── is a class
├── stores a sequence of characters
├── uses indexes starting at 0
├── length() gives number of characters
├── charAt(index) gets a character
└── String objects are immutable
*/

//#~~~ Let's test whether I've actually understood it:
/* 
Question 1
String str = "JAVA";
System.out.println(str.length());

- What is the output?

Question 2
String str = "JAVA";
System.out.println(str.charAt(2));

- What is the output?

Question 3
String str = "Java";
System.out.println(str.toUpperCase());

- What is the output?

Question 4
System.out.println(10 + 20);
System.out.println("10" + 20);

- What will both lines print, and why are they different?

Question 5 — slightly tricky
String str = "JAVA";
for (int i = 0; i < str.length(); i++) {
    System.out.print(str.charAt(i) + " ");
}

- What is the output?

# Task: Small coding task:

Write a Java program:

String name = "Java Programming";

Then:

Print the length.
Print the first character.
Print the last character.
Convert it to uppercase.
Convert it to lowercase.
Print every character using a for loop.

For the last character, don't hard-code the index 15 or whatever you calculate manually. Use the length:

str.length() - 1

That's an important programming habit.
*/



// public class Demo {
//     public static void main(String[] args) {

//         String name = "Java Programming";

//         // 1. Length
//         System.out.println(name.length());

//         // 2. First character
//         System.out.println(name.charAt(0));

//         // 3. Last character
//         System.out.println(name.charAt(name.length() - 1));

//         // 4. Uppercase
//         System.out.println(name.toUpperCase());

//         // 5. Lowercase
//         System.out.println(name.toLowerCase());

//         // 6. Print every character
//         for (int i = 0; i < name.length(); i++) {
//             System.out.println(name.charAt(i));
//         }
//     }
// }



//========================> String Buffer & String Builder <========================
/*
- StringBuffer and StringBuilder are classes in Java 
that are used to create mutable (modifiable) strings.


| Feature                     | String              | StringBuffer                           | StringBuilder           |
| --------------------------- | ------------------- | -------------------------------------- | ----------------------- |
| Mutable?                    | No                  | Yes                                    | Yes                     |
| Can append/change contents? | Not directly        | Yes                                    | Yes                     |
| Synchronization             | Not applicable      | Synchronized                           | Not synchronized        |
| Common use                  | General text values | Shared text with synchronization needs | Efficient text building |


*/
// class Demo{
    
//     public static void main(String[] args) {
//         StringBuffer sb = new StringBuffer("Hello");
//         sb.append(" World");
//         System.out.println(sb); // Output: Hello World

//         StringBuilder sbd = new StringBuilder("Java");
//         sbd.append(" Programming");
//         System.out.println(sbd); // Output: Java Programming
//     }
// }



// ==========================> Encapsulation <=======================================

// class Human{
    
//     private String name;
//     private int age;

//     public String getName() {
//         return name;
//     }

//     public void setName(String n) {
//         name = n;
//     }

//     public int getAge() {
//         return age;
//     }

//     public void setAge(int a) {
//         age = a;
//     }
//     public static void main(String[] args){
//         Human obj = new Human();
//         obj.setName("Vikas");
//         obj.setAge(25);
//         System.out.println(obj.getName() + " : " + obj.getAge());
//     }
// }

// ====================== Getters and Setters ==========================
/*
- Getters and Setters are methods that allow controlled access to the private fields 
of a class.

- Getters (also known as accessors) are methods that retrieve the value of a private field.
- Setters (also known as mutators) are methods that set or update the value of a private field.
- this keyword is used to refer to the current instance of the class.

*/

// class Person{
//     private int age;
//     private String name;

//     public int getAge() {
//         return age;
//     }

//     public void setAge(int age) {
//         this.age = age;
//     }

//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public static void main(String[] args) {
//         Person obj = new Person();
//         obj.setName("Vikas");
//         obj.setAge(30);
//         System.out.println(obj.getName() + " : " + obj.getAge());
//     }
// }

// ===========================> Encapsulation(Setter + Getter) <=========================

/*
- Encapsulation is a fundamental concept in object-oriented programming (OOP) 
that involves bundling data (attributes) and methods (functions) 
that operate on that data into a single unit, typically a class. 
It restricts direct access to some of the object's components, 
which can prevent the accidental modification of data.

- The below example demonstrates encapsulation by keeping the balance field private 
and providing public methods to set and get its value.
The setter method includes validation to ensure that the balance 
cannot be set to a negative value, thus protecting the integrity of the data.

*/

// class BankAccount {

//     private double balance;

//     public void setBalance(double balance) {

//         if (balance >= 0) {
//             this.balance = balance;
//         } else {
//             System.out.println("Invalid balance");
//         }
//     }

//     public double getBalance() {
//         return balance;
//     }
// }

// public class Main {
//     public static void main(String[] args) {

//         BankAccount account = new BankAccount();

//         account.setBalance(5000);
//         System.out.println(account.getBalance());

//         account.setBalance(-1000);
//         System.out.println(account.getBalance());
//     }
// }


//================> Example-2 {Encapsulation(Setter + Getter) } <========================

// class Employee {

//     private String name;
//     private double salary;

//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public double getSalary() {
//         return salary;
//     }

//     public void setSalary(double salary) {
//         if (salary >= 0) {
//             this.salary = salary;
//         }
//     }
// }

// public class Main {

//     public static void main(String[] args) {

//         Employee emp = new Employee();

//         emp.setName("Rahul");
//         emp.setSalary(50000);

//         System.out.println(emp.getName());
//         System.out.println(emp.getSalary());
//     }
// }

//===================================> Constructor <========================================
/* 
- A constructor is a special method in Java that is used to initialize objects.
- It has the same name as the class and does not have a return type, not even void.
- Constructors are called when an object of a class is created.

*/

// class ConstructorDemo{
    
//     private String name;
//     private int age;

//     // Constructor
//     public ConstructorDemo() {          // default constructor
//         name = "Abhishek";
//         age = 28;
//     }

//     public ConstructorDemo(String name, int age) {      // parameterized constructor
//         this.name = name;
//         this.age = age;
//     }

//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public int getAge() {
//         return age;
//     }

//     public void setAge(int age) {
//         this.age = age;
//     }

//     public static void main(String[] args) {
//         ConstructorDemo obj = new ConstructorDemo();
//         ConstructorDemo obj1 = new ConstructorDemo("Vikas", 25);
//         System.out.println(obj.getName() + " : " + obj.getAge());
//         System.out.println(obj1.getName() + " : " + obj1.getAge());
//     }
// }

// ========================> Default vs Parameterized Constructor <====================

/*

- Default Constructor: A default constructor is a constructor that takes no arguments. 
- It is automatically provided by the Java compiler if no constructors are explicitly defined in the class. 
- Its primary purpose is to initialize objects with default values.

*/


// class Default_VS_ParameterizedConstructor{
//     String name;
//     int age;
//     public String getName() {
//         return name;
//     }
//     public void setName(String name) {
//         this.name = name;
//     }
//     public int getAge() {
//         return age;
//     }
//     public void setAge(int age) {
//         this.age = age;
//     }
//     public Default_VS_ParameterizedConstructor(){
//         name = "John";
//         age = 12;
//     }

//     public Default_VS_ParameterizedConstructor(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }
//     public static void main(String[] args) {
//         Default_VS_ParameterizedConstructor obj = new Default_VS_ParameterizedConstructor();
//         System.out.println(obj.name + " : " + obj.age);
//     }   
// }

//========================> Example-2 {Default vs Parameterized Constructor} <========================

/* 
class Student {
    private String name;  // name is private, so it can only be accessed within the Student class
    private int age;      // age is private, so it can only be accessed within the Student class

    public Student() {
        name = "Unknown";
        age = 0;
    }
    
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void showDetails(){ // This method is public, so it can be called from outside the Student class
        System.out.println(name + " : "+ age);
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student("Rahul", 25);
        s1.showDetails(); // This will print "Unknown : 0" because s1 was created using the default constructor
        s2.showDetails(); // This will print "Rahul : 25" because s2 was created using the parameterized constructor
    }
}

*/

//=========================> Static Variables <==============================

/*

- Static variables, also known as class variables, 
are shared among all instances of a class.
- They are declared using the static keyword and belong to the class 
rather than any specific object.

*/


// class Mobile{
//     static String brand;   //These are instance variables
//     int price;      // Every object of the class will have its own copy of these variables
//     String name;

//     public void show(){
//         System.out.println(brand + " : " + name + " : " + price);
//     }

//     public static void main(String[] args) {

//         Mobile obj = new Mobile(); // Creating an object of the Mobile class

//         Mobile.brand = "Apple"; // Accessing static variable through class name
//         obj.price = 110999;
//         obj.name = "iPhone 13";

//         Mobile obj2 = new Mobile(); // Creating another object of the Mobile class

//         Mobile.brand = "Apple"; // Accessing static variable through class name
//         obj2.price = 129000;
//         obj2.name = "iPhone 16 Pro";

//         obj.show();
//         obj2.show();
//     }
// }


// ===================> Example-2 {Static Variables} <========================

/*

- What is the difference between an instance variable and a static variable?
1. Start with a Student example

Suppose we have:
        class Student {

            String name;
            int age;
        }

Then we create:

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

Each object has its own name and age.
Conceptually:
        Student #1
        name = Rahul
        age  = 25

        Student #2
        name = Amit
        age  = 22

        Student #3
        name = Priya
        age  = 24
That's what an instance variable means.

2. But what about a value shared by ALL students?
  =>  Suppose every Student belongs to the same college:
            College = LPU

Do we really need:
        Student #1 → college = LPU
        Student #2 → college = LPU
        Student #3 → college = LPU
    as separate instance fields?
Conceptually, no.

- The college value belongs to the class as a whole, not to one particular Student object.

That's where static comes in.

        class Student {
            String name;
            int age;
            static String college = "LPU";
        }

Instance variables
→ belong to each object

Static variable
→ belongs to the class

3. Visualize the difference:

                 Student class
                       │
          ┌────────────┴────────────┐
          │                         │
      static college            instance data
          │                         │
        "LPU"                  ┌────┼────┐
                               ↓    ↓    ↓
                             s1   s2   s3

More concretely:

Student class

static college = "LPU"
       │
       ├──────── shared by s1
       ├──────── shared by s2
       └──────── shared by s3


s1 → Student object
     name = Rahul
     age = 25

s2 → Student object
     name = Amit
     age = 22

s3 → Student object
     name = Priya
     age = 24

The key idea is:
    One static variable is associated with the class, 
    while each object has its own instance variables.

*/

// Example program:

// class Student {

//     String name;
//     int age;

//     static String college = "LPU";
// }

// class Demo {
//     public static void main(String[] args) {

//         Student s1 = new Student();
//         s1.name = "Rahul";
//         s1.age = 25;

//         Student s2 = new Student();
//         s2.name = "Amit";
//         s2.age = 22;

//         System.out.println(s1.name);
//         System.out.println(s1.age);
//         System.out.println(s1.college);

//         System.out.println(s2.name);
//         System.out.println(s2.age);
//         System.out.println(s2.college);
//     }
// }



/* Output:

        Rahul
        25
        LPU
        Amit
        22
        LPU

Both objects can access the same static variable.

Change the static variable:

    - This is where you'll really see the difference.

Student.college = "ABC University";

Now:
    s1.college → ABC University
    s2.college → ABC University

Why?

Because there is one shared static variable.

Conceptually:

        Student.college
            ↓
        "ABC University"

        s1 ────┐
            │
        s2 ────┤
            │
        s3 ────┘
            │
            └──> same static value


- Compare instance vs static

This is the table I want you to understand:

| Variable         | Belongs to  | Number of copies |
| ---------------- | ----------- | ---------------: |
| `name`           | Each object |   One per object |
| `age`            | Each object |   One per object |
| `static college` | Class       |           Shared |


*/

// ====================> Inheritance <========================
/*
~ Inheritance is a fundamental concept in object-oriented programming (OOP) 
that allows a class (called the child or subclass) 
to inherit properties and behaviors (fields and methods) 
from another class (called the parent or superclass).

~ Calling the parent class's methods and fields from the child class is done using the `extends` keyword in Java.
*/

// class Demo{
//     public static void main(String[] args){
//         advcalculator obj = new advcalculator(); // Creating an object of the advcalculator class, which inherits from Calc
//         int result1 = obj.add(10, 15);
//         int result2 = obj.subtract(20, 5);
//         int result3 = obj.multiply(5, 4);
//         int result4 = obj.divide(10, 5);
//         System.out.println(result1 + " " + result2 + " " + result3 + " " + result4);
//     }
// }
// ========================> Inheritance in deep <========================

/* 

- Suppose we have:

class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }
}

Now suppose we want an Advanced Calculator.

It should have:

        add()
        subtract()
        multiply()
        divide()

We could write everything again:

class AdvCalculator {

    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    int divide(int a, int b) {
        return a / b;
    }
}

But notice the problem.

We duplicated:
        add()
        subtract()

That's unnecessary code.

Could AdvCalculator reuse the functionality already written in Calculator?

Yes.

That's inheritance.

- Calculator is the parent class, also called the superclass.
- AdvCalculator is the child class, also called the subclass.

- Visualize It

Think of Calculator as the base:

        Calculator
        ├── add()
        └── subtract()

Then AdvCalculator extends it:

        AdvCalculator
        ├── inherited add()
        ├── inherited subtract()
        ├── multiply()
        └── divide()

So the child gets the parent's accessible behavior and can add its own.

- Is inheritance copying the methods?

Don't think:

"AdvCalculator physically copies the methods into itself."

For learning, say:

"AdvCalculator inherits the accessible members of Calculator and can use them."

The exact JVM/object-model details are more nuanced.



*/

// class Calculator {

//     int add(int a, int b) {
//         return a + b;
//     }

//     int subtract(int a, int b) {
//         return a - b;
//     }
// }

// class AdvCalculator extends Calculator {

//     int multiply(int a, int b) {
//         return a * b;
//     }

//     int divide(int a, int b) {
//         return a / b;
//     }
// }

// public class Demo {

//     public static void main(String[] args) {

//         AdvCalculator obj = new AdvCalculator();

//         System.out.println("Addition from Parent : "+obj.add(10, 15));
//         System.out.println("Subtraction from Parent : "+obj.subtract(20, 5));
//         System.out.println("Multiplication from Child : "+obj.multiply(5, 4));
//         System.out.println("Division from Child : "+obj.divide(10, 5));
//     }
// }

//=========================> Multilevel Inheritance <========================

/*
Grandparent
    ↑
    |
  Parent
    ↑
    |
   Child
*/

// class Animal {

//     void eat() {
//         System.out.println("Eating");
//     }
// }

// class Dog extends Animal {

//     void bark() {
//         System.out.println("Barking");
//     }
// }

// class Puppy extends Dog {

//     void cry() {
//         System.out.println("Crying");
//     }
// }
// class Demo{
//         public static void main(String[] args){
//             Puppy p = new Puppy();
//             p.eat();
//             p.bark();
//             p.cry();
//         } // Puppy inherits from Dog, and Dog inherits from Animal.
//     } // This is multilevel inheritance.


// =================> Example-2 {Multilevel Inheritance} <========================


// class GrandParent {
//     void eat() {
//         System.out.println("Eating");
//     }
// }

// class Parent extends GrandParent {
//     void walk() {
//         System.out.println("Walking");
//     }
// }

// class Child extends Parent {
//     void talk() {
//         System.out.println("Talking");
//     }
// }

// public class Demo {

//     public static void main(String[] args) {

//         Child ch = new Child();
//         ch.eat();
//         ch.walk();
//         ch.talk();
//     }
// }


//================ this and super method =================================

// class A{
//     public A()
//     {
//         super(); // Calls Object's constructor
//         System.out.println("This is class A");
//     }
//     public A(int a)
//     {
//         super(); // Calls Object's parameterized constructor
//         System.out.println("This is class A with parameter: " + a);
//     }
// }
// class B extends A{
//     public B()
//     {
//         super(); // Calls A's no-argument constructor
//         System.out.println("This is class B");
//     }
//     public B(int b)
//     {
//         super(b); // Calls A's parameterized constructor
//         System.out.println("This is class B with parameter: " + b);
//     }
// }
// public class Demo{
//     public static void main(String[] args){
//         B obj = new B();
//     }
// }


// =========================> Example-2 {this and super class} <========================


// class A{
//     public A()
//     {
//         super(); // Calls Object's constructor
//         System.out.println("This is class A");
//     }
//     public A(int a)
//     {
//         super(); // Calls Object's parameterized constructor
//         System.out.println("This is class A with parameter: " + a);
//     }
// }
// class B extends A{
//     public B()
//     {
//         super(); // Calls A's no-argument constructor
//         System.out.println("This is class B");
//     }
//     public B(int b)
//     {
//         this(); // Calls A's parameterized constructor
//         System.out.println("This is class B with parameter: " + b);
//     }
// }
// public class Demo{
//     public static void main(String[] args){
//         B obj = new B(5);
//     }
// }

// ==================> Anonymous Object <========================

/* 
- An anonymous object is an object that is created without being assigned to a reference variable.
- It is typically used when you want to create an object and use it immediately, without needing to refer to it later in the code.
- Anonymous objects are often used for one-time operations, such as passing an object to a method or constructor, or for creating temporary objects in expressions.

~> Now imagine you need an object only once.
    You don't need to keep a reference to it.
==> You can create it like:
    new Calculator().add(10, 20);
*/

// class Calculator {

//     int add(int a, int b) {
//         return a + b;
//     }
// }

// public class Demo {
//     public static void main(String[] args) {

//         //new Calculator().add(10, 15); // Anonymous object, but the result is not stored or printed
//         System.out.println(new Calculator().add(10, 15)); // Anonymous object, result is printed directly
//     }
// }

// ========================> Anonymous Object with Constructor <========================

/*

    new Student("Rahul")
            ↓
    object created
            ↓
    constructor runs
            ↓
      name = Rahul
            ↓
         show()
            ↓
          Rahul

- So the purpose is not "always use anonymous objects." It's:
- Use an anonymous object when you don't need to retain and reuse the object through a named reference.

*/


// class Student {

//     String name;

//     Student(String name) {
//         this.name = name;
//     }

//     void show() {
//         System.out.println(name);
//     }
// }

// public class Demo {
//     public static void main(String[] args) {

//         new Student("Rahul").show(); // This creates an object and immediately invokes the constructor.
//     }
// }


//=============================> Object vs Anonymous Object <========================

// class Calculator {

//     int add(int a, int b) {
//         return a + b;
//     }

//     int multiply(int a, int b) {
//         return a * b;
//     }
// }

// public class Demo {

//     public static void main(String[] args) {

//         // Anonymous object
//         System.out.println(
//             "Addition with Anonymous Object: "
//             + new Calculator().add(10, 5)
//         );

//         // Named object
//         Calculator calc = new Calculator();

//         int addition = calc.add(15, 10);
//         int multiplication = calc.multiply(7, 8);

//         System.out.println("Addition through calc: " + addition);
//         System.out.println("Multiplication through calc: " + multiplication);
//     }
// }


