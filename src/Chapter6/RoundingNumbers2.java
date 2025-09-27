package Chapter6;

import java.util.Scanner;

public class RoundingNumbers2 {
    static Scanner input = new Scanner(System.in);
    public static double y = 0.0;
    public static final double constant = 0.5;

    public static void main(String[] args) {
        System.out.println("Input double number: ");
        double number = input.nextDouble();

while (number != -1) {
    System.out.printf("Original value is: %f%n", number);
    System.out.printf("Original value rounded up to the nearest integer is: %d%n", (int) roundToInteger(number));
    System.out.printf("Original value rounded up to the nearest tenth is: %.1f%n", roundToTenths(number));
    System.out.printf("Original value rounded up to the nearest hundredth is: %.2f%n", roundToHundredths(number));
    System.out.printf("Original value rounded up to the nearest thousandth is: %.3f%n", roundToThousandths(number));

    System.out.print("Input another double number: ");
    number = input.nextDouble();
}
    }

    public static double roundToInteger(double number) {
        y = Math.floor(number + constant);
        return y;
    }

    public static double roundToTenths(double number) {
        y = Math.floor(number * 10 + constant) / 10;
        return y;
    }

    public static double roundToHundredths(double number) {
        y = Math.floor(number * 100 + constant) / 100;
        return y;
    }

    public static double roundToThousandths(double number) {
        y = Math.floor(number * 1000 + constant) / 1000;
        return y;
    }
}
