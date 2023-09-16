import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CurrencyConverter converter = new CurrencyConverter();

        System.out.println("Welcome to the currency exchange.");

        while (true) {
            try {
                System.out.print("Enter the amount: ");
                double amount = scanner.nextDouble();
                scanner.nextLine();

                System.out.print("Enter the source currency (e.g., USD): ");
                String fromCurrency = scanner.nextLine().toUpperCase();

                System.out.print("Enter the target currency (e.g., EUR): ");
                String toCurrency = scanner.nextLine().toUpperCase();

                double convertedAmount = converter.convert(amount, fromCurrency, toCurrency);

                if (convertedAmount >= 0) {
                    System.out.println(amount + " " + fromCurrency + " is equivalent to " + convertedAmount + " " + toCurrency);
                } else {
                    System.out.println("Conversion failed. Please check your input.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter valid numeric values and currency codes.");
            }

            System.out.print("Do you want to convert another currency? (yes/no): ");
            String choice = scanner.next().toLowerCase();
            if (!choice.equals("yes")) {
                System.out.println("Thank you for using Currency Converter \nSL");
                break;
            }
        }

        scanner.close();
    }
}
