//WAP to check whether a number is Palindrome or not

import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = scn.nextInt();
        int originalnum=n;

        int rev=0;
        while(n > 0)
        {
            int d = n % 10;
            rev = rev * 10 + d;
            n = n/10;
        }
        if(rev == originalnum)
        {
            System.out.println("Palindrome Number");
        }else
            System.out.println("Not a Palindrome Number");
    }
}
