//wap to check leap year or not

import java.util.Scanner;
public class LeapOrNot {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter an year: ");
        int y = scn.nextInt();

        if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))
            System.out.println("Its a Leap year");
        else
            System.out.println("Its not a Leap Year");

    }


}
