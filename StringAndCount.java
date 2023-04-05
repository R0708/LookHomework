import java.util.Scanner;

//Run this class and write any String and count total number of in that string
public class StringAndCount {
    public static void main(String[] args) {

        //create an object of scanner class

        Scanner scanner = new Scanner(System.in);

        String hello = scanner.nextLine();

        int charCount = hello.length() - hello.replaceAll("a", "").length();

        System.out.println(charCount);

    }
}
