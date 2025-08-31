// WAP to swap 2 numbers Without using Third Variable

import java.util.Scanner;
public class SwapWithoutThird {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scn.nextInt();
        System.out.print("Enter second number: ");
        int b = scn.nextInt();


        System.out.println("Before Swap..");
        System.out.println("A = "+a);
        System.out.println("B = "+b);

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("After Swap..");
        System.out.println("A = "+a);
        System.out.println("B = "+b);

    }
}

//Explanation: When we are adding two numbers the result is larger than both the numbers a and b
// So when we subtract 'a' from total we get 'b' value which we assign to a
// Still Total is larger so now we will again subtract 'b' current value so we get 'a' value which we assin to b
//Simple