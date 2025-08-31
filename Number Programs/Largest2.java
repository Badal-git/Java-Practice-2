// wap to find Largest of two numbers

import  java.util.Scanner;
public class Largest2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print(" Enter first number: ");
        int a =scn.nextInt();
        System.out.print("Enter second number: ");
        int b = scn.nextInt();


        if(a > b)
            System.out.println("The Largest number is : "+a);
        else if(b > a)
            System.out.println("The Largest number is : "+b);
        else
            System.out.println("Both are equal");
    }
}
