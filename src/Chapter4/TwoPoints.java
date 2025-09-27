package Chapter4;

import java.util.Scanner;

public class TwoPoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the x coordinate for point A: ");
        int xCoorA = input.nextInt();

        System.out.print("Enter the y coordinate for point A: ");
        int yCoorA = input.nextInt();

        System.out.print("Enter the x coordinate for point B: ");
        int xCoorB = input.nextInt();

        System.out.print("Enter the y coordinate for point B: ");
        int yCoorB = input.nextInt();

        if (xCoorA == xCoorB) {
            System.out.println("Point A and B are perpendicular to the x axis");
        }

            if (yCoorA == yCoorB) {
                System.out.println("Point A and B are perpendicular to the y axis");

            }
    }
}
