package Chapter4;

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter account number: ");
        int accountNumber = input.nextInt();

        System.out.println("Enter balance at the beginning of the month: ");
        int beginningBalance = input.nextInt();

        System.out.println("Enter total charges for the month: ");
        int totalCharges = input.nextInt();

        System.out.println("Enter total credit for the month: ");
        int totalCredit = input.nextInt();

        System.out.println("Enter allowed credit limit: ");
        int creditLimit = input.nextInt();


        int newBalance = beginningBalance + totalCharges - totalCredit;
        System.out.println("The new balance is: " + newBalance);

        if (newBalance > creditLimit) {

            System.out.println("Credit limit exceeded");
        }
    }
}
