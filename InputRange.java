import java.util.Scanner;

public class InputRange {

    //Print any 10 numbers between given/user input range
    public static void main(String[] args) {

        //print any number from start to end for eg. 15-25

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter input any first number:");
        int x1 = scanner.nextInt();

        System.out.println("Enter input any last number:");
       int x2= scanner.nextInt();

        for (x1 = x1 ; x1 <= x2; x1++) {
            System.out.println(x1);
        }
    }
}