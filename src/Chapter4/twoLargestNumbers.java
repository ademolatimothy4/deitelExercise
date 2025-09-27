package Chapter4;

import java.util.Scanner;

public class twoLargestNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int firstLargest = 0;
        int secondLargest = 0;
        int counter = 1;
        while (counter <= 10) {
            System.out.println("Enter number: ");
            int number = input.nextInt();

            if (number > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = number;

            }

            counter = counter + 1;
        }

        System.out.println("The First largest number is: " + firstLargest);
        System.out.println("The Second largest number is: " + secondLargest);
    }
}
