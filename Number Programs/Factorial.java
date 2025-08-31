//WAP to find Factorial of a number

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a Number to find its factorial: ");
        int n = scn.nextInt();

        long fact =1;                  // as factorial very easily becomes huge number so storing in long
        for(int i = 1 ; i <= n ; i++)
        {
           fact = fact * i;
        }
        System.out.println(" Factorial of "+ n + " is " + fact);

    }
}
