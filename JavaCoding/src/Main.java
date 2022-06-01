import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the Input from console
        System.out.print("Number: ");
        int num = scanner.nextInt();

        // Determine the output
        if ((num % 5 == 0) && (num % 3 == 0))
            System.out.println("FizzBuzz");
        else if (num % 5 == 0)
            System.out.print("Fizz");
        else if (num % 3 == 0)
            System.out.print("Buzz");
        else
            System.out.println(num);

    }
}