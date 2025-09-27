package Chapter6;

import java.util.Scanner;

public class MinimumFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter four numbers separated by a blank space: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        double num4 = input.nextDouble();

        double minimum = minimum(num1, num2, num3, num4);
        System.out.println("Minimum value is " + minimum);
    }

    public static double minimum (double x, double y, double z, double a) {
        double minimumVal = x;

        if (y < minimumVal){
            minimumVal = y;
        }

        if (z < minimumVal){
            minimumVal = z;
        }

        if (a < minimumVal){
            minimumVal = a;
        }

return minimumVal;


    }
}
