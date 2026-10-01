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

class Human{
    
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }
    public static void main(String[] args){
        Human obj = new Human();
        obj.setName("Vikas");
        obj.setAge(25);
        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}