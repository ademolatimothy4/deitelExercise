package Chapter5;

import java.util.Scanner;
public class TheFairTax {
    public static void main(String[] args) {
       final double rate = 0.23;
        double totalFairtax= 0;
        Scanner input = new Scanner(System.in);
        System.out.println("""
                FairTax Estimator
                Welcome! 
                This program is designed to help you estimate your FairTax based on the expenses you provide.
                Under the FairTax system, a 23% consumption tax is applied to all goods and services purchased.
                Enter each expense category along with the amount spent.
                When you are done, type 'done' to see your total estimated FairTax.
                
                """);
        System.out.print("Enter expense category: ");
        String cat = input.nextLine();


        while (!cat.equals("done")) {
            System.out.printf("Enter %s expense : ", cat);
            double number = input.nextInt();
            input.nextLine();

            double tax = rate * number;
            totalFairtax += tax;

            System.out.print("Enter expense category: ");
           cat = input.nextLine();



        }
        System.out.printf("Estimated fair tax to be paid is : $%.4f", totalFairtax);
    }
}
