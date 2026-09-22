import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        double num1, num2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers:");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();

        System.out.println("Enter the operator (+, -, *, /):");
        char op = sc.next().charAt(0);
        double o = 0;

        switch (op) {
        case '+':
            o = num1 + num2;
            break;
        case '-':
            o = num1 - num2;
            break;
        case '*':
            o = num1 * num2;
            break;
        case '/':
            if (num2 == 0) {
              System.out.println("Division by zero is not allowed.");
              return;
            }
            o = num1 / num2;
            break;
        default:
            System.out.println("Invalid operator.");
            return;
        }

        System.out.println("The final result:");
        System.out.println(num1 + " " + op + " " + num2 + " = " + o);
    }
}

