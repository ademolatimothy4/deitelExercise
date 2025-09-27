package Chapter6;

import java.util.Scanner;

public class RoundingNumbers {
    public static final double constant = 0.5;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter double value: ");
        double doubVal = input.nextDouble();
        double roundedVal = Math.floor(constant + doubVal);

        if(doubVal != -1) {
            System.out.printf("Original value is %.1f, rounded value is %.1f.%n", doubVal, roundedVal);
        }
        else {
            System.out.println("program ends");
        }

        while (doubVal != -1) {
            System.out.print("Enter double value: ");
            doubVal = input.nextDouble();
            roundedVal = Math.floor(constant + doubVal);

            if(doubVal != -1) {
                System.out.printf("Original value is %.1f, rounded value is %.1f.%n", doubVal, roundedVal);
            }
            else {
                System.out.println("program ends");
            }

        }

    }
}
