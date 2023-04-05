import java.util.Scanner;

//To display n limit of natural numbers and their sum
public class NaturalAndSum {
    public static void main(String[] args)
    {
        //object of scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number");

        int n = scanner.nextInt();
        int i, sum=0;
        System.out.println("The first natural number are : " +n);

      //execute until the condition returns true
        for (i = 0; i <= n; i++)
        {
            System.out.println(i);
            //adding the value of i into sum variable
            sum = sum + i;
        }

        //prints the sum
        System.out.println("The Sum of number upto "+n+" terms : " + sum);
    }
}
