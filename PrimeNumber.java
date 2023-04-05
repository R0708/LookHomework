import java.util.Scanner;

//To check whether input number is prime or not
public class PrimeNumber {
    public static void main(String[] args) {
        int a;
        boolean isPrime = true;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number:");

        //capture the input in an integer

        int n = scanner.nextInt();
        for (int i = 2; i <= n/2; i++) {
            a = n%i;
            if (a == 0)
            {
                isPrime = false;
                break;
            }
        }
        //If isPrime is true then the number is prime else not

        if (isPrime)
            System.out.println(n + " is a Prime Number: ");
        else
            System.out.println(n + " is not a Prime Number: ");
    }
}
