import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);
        // Principal
        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        // Annual Interest Rate
        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyIR = annualInterest / PERCENT / MONTHS_IN_YEAR;

        // Period in Years
        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal
                * (monthlyIR * Math.pow(1 + monthlyIR, numberOfPayments))
                / (Math.pow(1 + monthlyIR, numberOfPayments) - 1);

        String mortgageCurrency = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageCurrency);

    }
}