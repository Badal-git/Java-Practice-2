// WAP to swap 2 numbers with using Third Variable

import java.util.Scanner;
public class SwapWithThird {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scn.nextInt();
        System.out.print("Enter second number: ");
        int b = scn.nextInt();


        System.out.println("Before Swap..");
        System.out.println("A = "+a);
        System.out.println("B = "+b);

        int temp;

        temp=a;
        a=b;
        b=temp;

        System.out.println("After Swap..");
        System.out.println("A = "+a);
        System.out.println("B = "+b);

    }
}
