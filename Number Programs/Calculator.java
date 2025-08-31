// WAP to create a Calculator using Switch Statement is Java

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter first Number: ");
        int a = scn.nextInt();
        System.out.print("Enter Second Number: ");
        int b = scn.nextInt();
        System.out.print("Choose one (+,-,/,*,%) : ");
        char operator = scn.next().charAt(0);

        double result;
        switch(operator)
        {
            case '+':
                result = a + b;
                System.out.println("Result is "+result);
                break;
            case '-':
                result = a - b;
                System.out.println("Result is "+result);
                break;
            case '*':
                result = a * b;
                System.out.println("Result is "+result);
                break;
            case '/':
                if(b != 0)
                {
                    result = a / b;
                    System.out.println("Result is "+result);
                }
                else
                {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case '%':
                if(b != 0)
                {
                    result = a % b;
                    System.out.println("Result is "+result);
                }
                else
                {
                    System.out.println("Error: Modulus by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator, Please choose a valid operator...");
        }
    }
}
