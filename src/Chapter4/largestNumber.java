package Chapter4;

import java.util.Scanner;

public class largestNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 1;
        int largestNumber = 0;
        while (counter <= 10) {
            System.out.println("Enter number: ");
            int number = input.nextInt();

            if(number>largestNumber) {
                largestNumber = number;
            }
            counter = counter + 1;
        }

        System.out.println("The largest number entered is: " + largestNumber);
    }
}
