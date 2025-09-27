package Chapter4;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalMile = 0;
        int totalGallon = 0;

        System.out.print("Enter Trip mile: ");
        int mile = input.nextInt();

        System.out.print("Enter Gallon used: ");
        int gallon = input.nextInt();

        System.out.print("Mile per gallon is: " + (double) mile / gallon + " milepergallon");


        while (mile != -5 && gallon != -5) {
            totalMile = totalMile + mile;
            totalGallon = totalGallon + gallon;

            System.out.print("Enter trip mile ");
            mile = input.nextInt();

            System.out.print("Enter gallon used: ");
            gallon = input.nextInt();

            System.out.print("Mile per gallon is: " + (double) mile / gallon + " milepergallon");
        }

        System.out.print("Total mile covered is: " + totalMile);
        System.out.print("Total gallon used is: " + totalGallon);
        System.out.print("Total mile per gallon is: " + (double) totalMile / totalGallon);
    }
}
