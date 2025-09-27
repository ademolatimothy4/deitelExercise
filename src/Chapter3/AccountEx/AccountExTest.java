package Chapter3.AccountEx;

import java.util.Scanner;
public class AccountExTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        AccountEx myAccount = new AccountEx();

        System.out.printf("Initial name is: %s%n%n", myAccount.getName());

        System.out.println("Please enter the name: ");
        String theName = input.nextLine();
        myAccount.setName(theName);

        System.out.println();

        System.out.printf("Name in object myAccount is:%n%s%n", myAccount.getName());
    }
}
