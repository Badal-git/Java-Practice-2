import java.util.Scanner;
public class PrintPrimeWithinRange {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Starting range: ");
        int start = scn.nextInt();
        System.out.print("Enter Ending range: ");
        int end = scn.nextInt();

        for(int i = start; i<= end; i++)
        {
            if(CheckPrimeNum(i))
                System.out.print(i+", ");
        }

    }

    static boolean CheckPrimeNum(int n)
    {
        boolean isPrime = true;
        for(int i = 2; i <= n/2 ; i++)
        {
            if(n % i == 0)
                isPrime=false;
            break;
        }
        return isPrime;
    }

}
