import java.util.Scanner;

//fibonacci series based on the user input
public class FibonacciNumber {
    public static void main(String[] args) {

        int minNumber = 0;
        int previousNumber = 1;
        int nextNumber = 1;

        System.out.println("How many numbers you want in Fibonacci:");

        //create an object of scanner class
        Scanner scanner = new Scanner(System.in);
        minNumber = scanner.nextInt();

        System.out.println("Fibonacci Series of "+minNumber+" numbers:");

        for (int i = 1; i <= minNumber; ++i)
        {
            System.out.println(previousNumber+" ");
            //On each iteration, we are assigning second number

            int sum = previousNumber + nextNumber;
                      previousNumber = nextNumber;
                      nextNumber = sum;
        }
    }
}

