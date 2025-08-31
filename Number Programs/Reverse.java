// WAP to reverse a given number

import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number to be reversed: ");
        int n = scn.nextInt();
        //int n = 123;

        int rev=0;
        while(n > 0)
        {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }

        System.out.println("Result is: "+rev);
    }
}
