import java.util.Scanner;

public class CurrencyExchange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example exchange rates (you can update these as per real-time rates)
        double usdRate = 0.012;  // 1 INR = 0.012 USD
        double eurRate = 0.011;  // 1 INR = 0.011 EUR
        double gbpRate = 0.0095; // 1 INR = 0.0095 GBP
        double jpyRate = 1.70;   // 1 INR = 1.70 JPY

        // Input from user
        System.out.print("Enter amount in INR: ");
        double inr = sc.nextDouble();

        System.out.println("Convert INR to:");
        System.out.println("1. USD");
        System.out.println("2. EUR");
        System.out.println("3. GBP");
        System.out.println("4. JPY");
        System.out.print("Choose option: ");
        int choice = sc.nextInt();

        double convertedAmount;

        switch (choice) {
            case 1:
                convertedAmount = inr * usdRate;
                System.out.println(inr + " INR = " + convertedAmount + " USD");
                break;
            case 2:
                convertedAmount = inr * eurRate;
                System.out.println(inr + " INR = " + convertedAmount + " EUR");
                break;
            case 3:
                convertedAmount = inr * gbpRate;
                System.out.println(inr + " INR = " + convertedAmount + " GBP");
                break;
            case 4:
                convertedAmount = inr * jpyRate;
                System.out.println(inr + " INR = " + convertedAmount + " JPY");
                break;
            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
