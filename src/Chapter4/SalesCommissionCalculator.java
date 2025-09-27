package Chapter4;

import java.util.Scanner;
public class SalesCommissionCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       double item1 = 239.99;
       double item2 = 129.75;
       double item3 = 99.95;
       double item4 = 350.89;

        System.out.println("Enter number of Item 1 sold");
        int noOfItem1 = input.nextInt();

        System.out.println("Enter number of Item 2 sold");
        int noOfItem2 = input.nextInt();

        System.out.println("Enter number of Item 3 sold");
        int noOfItem3 = input.nextInt();

        System.out.println("Enter number of Item 4 sold");
        int noOfItem4 = input.nextInt();

       double grossSales =  (item1 * noOfItem1) + (item2 * noOfItem2) + (item3 * noOfItem3) + (item4 * noOfItem4);
       double ninePercent = 0.09 * grossSales;

        System.out.println("Earning for the week is: " + "$" + (200 + ninePercent));
    }
}
