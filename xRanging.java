import java.util.Scanner;

//the sum of x ranging from 1 to 20.
public class xRanging {
    public static void main(String[] args) {

        //create an object of scanner class
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        int sum = 0;

        for (int i = a; i <= 20; i++)
            sum = sum + i;
        System.out.println ("The sum of x range is" + sum);

    }
}
