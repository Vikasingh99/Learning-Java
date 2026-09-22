// If Else Statement:

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


// Even Odd Number:

// public class Demo {
//     public static void main(String[] args){
//         int x = 5;
        
//         if (x%2==0)
//             System.out.println(x + " is an Even number");
//         else
//             System.out.println(x + " is an Odd number");
//     }
    
// }


// Ternary Operator:

// public class Demo{
//     public static void main(String[] args){
//         int a = 10;
//         int result = a % 2 == 0? 1 : 0;
//         System.out.println(result);
//     }
// }

// Switch Statement:

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


// Loops:
//while Loop:

// public class Demo{
//     public static void main(String[] args){
//         int i = 0;
//         while(i<5){
//             System.out.println(i);
//             i++;
//         }
//     }
// }


// do while Loop:

// public class Demo{
//     public static void main(String[] args){
//         int i = 5;
//         do{
//             System.out.println(i);
//             i++;
//         }while(i<5);
//     }
// }


// for Loop:

public class Demo{
    public static void main(String[] args){
        for(int i = 5; i > 0; i--){
            System.out.println("Java " + i);
        }
    }
}