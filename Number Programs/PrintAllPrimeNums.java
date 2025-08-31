import java.util.Scanner;
public class PrintAllPrimeNums {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int num = scn.nextInt();
        for(int n = 2;  n <= num; n++)
        {
            boolean isPrime= true;
            for(int i = 2; i < n/2; i++)
            {
                if (n % i == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
                System.out.print(n+", ");
        }


    }
}
