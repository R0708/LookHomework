import java.util.Scanner;

//To Print Multiplication Table for any Number
public class MultiplicationTable {
    public static void main(String[] args)
    {
        //create an object of scanner class

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");

        int a = scanner.nextInt();

        for (int i = 1; i <= 12; i++)
        {
            System.out.println(a + "*" + i + "=" + a*i);

        }
    }
}
