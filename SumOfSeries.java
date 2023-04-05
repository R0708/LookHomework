import java.util.Scanner;

//where n is a positive integer and input by user
public class SumOfSeries {
    public static void main(String[] args) {

        //create an object of scanner class

        Scanner scanner = new Scanner(System.in);

        // To hold number of terms

        int number;
        double sum = 0;

        System.out.println("Enter number of terms of series : ");

        number = scanner.nextInt();

        for (int i = 1; i <= number ; i++)
        {
            sum += 1.0/i;

        }
        System.out.println("sum :" + sum);
    }
}
