package Chapter5;

import java.util.Scanner;

public class Extremes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maximum = 0;
        int minimum = 22_222_222_2;
        int counter = 1;
        System.out.println("Input number of values to ask: ");
        int noOfVal = input.nextInt();

        while (counter <= noOfVal) {
            System.out.print("Input number: ");
          int number = input.nextInt();

            if (number > maximum) {
               maximum = number;
            }

            if (number < minimum) {
                minimum = number;
            }

            counter += 1;
        }
        int sumOfExtremes = maximum + minimum;
        System.out.println("The maximum number is: " +maximum);
        System.out.println("The minimum number is: " +minimum);
        System.out.println("Sum of two extremes is: " + sumOfExtremes);

    }
}
