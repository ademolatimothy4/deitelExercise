package Chapter4;

import java.util.Scanner;

public class taxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = input.nextLine();

        System.out.println("Enter amount earned: ");
        double amountEarned = input.nextDouble();

        if (amountEarned > 30_000) {
            System.out.println("Tax is: " + "$" + 0.2 * amountEarned);
        } else {
            System.out.println("Tax is: " + "$" + 0.15 * amountEarned);

        }
    }
}
