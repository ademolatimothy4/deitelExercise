package Chapter6;

import java.util.Scanner;

public class ParkingCharges {
    public static double fee = 0.0;
    public static double totalReceipt = 0.0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter customer's name: ");
        String name = input.nextLine();

        while (!name.equals("end")) {
            System.out.print("Enter parking hour: ");
            double hour = input.nextDouble();
            input.nextLine();

            System.out.printf("Good day MR/MRS %s you are to pay  $%.2f as your parking charge.%n", name, calculateCharges(hour));
            totalReceipt += fee;

            System.out.print("Enter customer's name: ");
            name = input.nextLine();

        }
        System.out.printf("The total parking charge for today is $%.2f: " , totalReceipt );
    }

    public static double calculateCharges(double hour) {
        if (hour <= 3) {
            fee = 2.00;
        }
        if (hour > 3) {
            int roundUpHour = (int) Math.ceil(hour);
            int extraHour = (roundUpHour - 3);
            fee = 2.00 + (extraHour * 0.5);
        }
        if (fee > 10.0) {
            fee = 10.0;
        }
        return fee;
    }
}
