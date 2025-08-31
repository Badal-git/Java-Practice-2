//wap to check given number is even or odd

import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Plesae Enter a Number: ");
        int n = scn.nextInt();

        if(n % 2 == 0)
            System.out.println("Number is Even");
        else
            System.out.println("Number is Odd");
    }

}
