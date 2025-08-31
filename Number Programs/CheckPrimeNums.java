import java.util.Scanner;
public class CheckPrimeNums {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = scn.nextInt();

        if(n <= 1)
            {
                System.out.println(n+" is not a Prime number");
                return;
            }

        boolean isPrime=true;
        for(int i = 2; i < n/2; i++)
        {
            if(n % i == 0)
            {
                isPrime = false;
                break;
            }
        }

        if(isPrime)
            System.out.println("Its a prime number");
        else
            System.out.println("Its not a Prime Number");
    }
}
