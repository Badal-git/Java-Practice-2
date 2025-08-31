// wap to find Largest of three numbers

import java.util.Scanner;
public class Largest3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter first Number: ");
        int a = scn.nextInt();
        System.out.print("Enter second Number: ");
        int b = scn.nextInt();
        System.out.print("Enter third Number: ");
        int c = scn.nextInt();

        if(a > b && a > c)
            System.out.println("The Largest is : "+a);
        else if(b > a && b > c)
            System.out.println("The largest is : "+b);
        else
            System.out.println("The largest is: "+c);

    }
}
