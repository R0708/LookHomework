import java.util.Scanner;

//To factorial of a number entered by user
public class FactorialNumber {
    public static void main(String[] args) {

        int num, k = 1, i;

        //create an object of scanner class
        Scanner in = new Scanner(System.in);

        System.out.println("Enter an Integer");
        num = in.nextInt();

        for (i = 1; i <= num; i++){
            k = k * i;
        }

        System.out.println("Factorial number is: " + k);
    }
}
