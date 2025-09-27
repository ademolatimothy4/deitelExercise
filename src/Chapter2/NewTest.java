package Chapter2;

import java.util.Scanner;

public class NewTest {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int balance = 500;
        System.out.println("Enter amount to withdraw: ");
        int withdraw = input.nextInt();

        if(balance < withdraw) {
            System.out.println("Insufficient");
        }else{
            balance -= withdraw;
            System.out.println("WITHDRAWED" +withdraw);
            System.out.println("Balance is" + balance);
        }
    }

}
