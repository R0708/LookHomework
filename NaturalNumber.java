import java.util.Scanner;

public class NaturalNumber {
    public static void main(String[] args) {

        //object of scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");

        int n = scanner.nextInt();
        int i, sum = 0;

    //execute until the condition returns true
        for (i = 0; i <= n; i++)
        {
            //adding the value of i into sum variable
            sum = sum + i;
        }

        //prints the sum
        System.out.println("Sum of number: " + sum);
    }
}
