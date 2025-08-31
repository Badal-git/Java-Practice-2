// How to take user Input form a user

import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scn.nextLine();
        System.out.print("Please enter your age: ");
        int age = scn.nextInt();
        System.out.print("Enter your favorite decimal number: ");
        double favNum = scn.nextDouble();

        System.out.println("\nThank You so much for providing your details");
        System.out.println("Name: "+ name);
        System.out.println("Age: " + age);
        System.out.println("Favourite Number: " + favNum);

    }
}
