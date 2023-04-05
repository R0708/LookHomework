import java.util.Scanner;

//Reverse a number using for Loop
public class ReverseNumber {

    public static void main(String[] args) {

        System.out.println("input your number and press enter");

        //create an object of scanner class
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int reversedNumber = 0;

        for (; number != 0; number /= 10) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
        }
        System.out.println("Reverses number:" + reversedNumber);
    }
}



