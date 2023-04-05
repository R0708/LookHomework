import java.util.Scanner;

//Print numbers separately as divided by 3 and 5
public class Divided {

    public static void main(String[] args) {

        //create an object of scanner class
        Scanner scanner = new Scanner(System.in);

        //Want numbers between from 1 to 100 which is divided by 3
        System.out.println("Enter 3 number: ");
        int a = scanner.nextInt();

        //Want numbers between from 1 to 100 which is divided by 5
        System.out.println("Enter 5 number: ");
        int b = scanner.nextInt();

        System.out.println("\nDivided by 3: ");
        for (int i=1; i<100; i++) {
            if (i%a == 0)
                System.out.print(i +", ");
        }

        System.out.println("\n\nDivided by 5: ");
        for (int i=1; i<100; i++)
        {
            if (i%b == 0) System.out.print(i+",");
        }

    }
}