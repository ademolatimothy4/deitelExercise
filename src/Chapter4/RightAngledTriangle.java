package Chapter4;

import java.util.Scanner;

public class RightAngledTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base length number between 1 and 10: ");
        int base = input.nextInt();

        if (base < 1 || base > 10) {
            System.out.println(" Try again.");
        }

        int row = 1;
        while (row <= base) {
            int column = 1;
            while (column <= row) {
                System.out.print("*");
                column = column + 1;
            }
            System.out.println();
            row = row + 1;
        }
    }
}
