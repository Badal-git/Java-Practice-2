// WAP to print Multiplication Table


import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scn.nextInt();


        for(int i = 1; i <= 10 ; i++)
        {
            int result = n*i; // we are just storing the result here to use the variable we can also directly write the expression in the print statement
            System.out.println(n+" * "+i+" = "+result);
        }
    }
}
