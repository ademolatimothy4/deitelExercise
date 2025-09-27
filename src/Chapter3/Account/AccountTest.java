package Chapter3.Account;

    import java.util.Scanner;

    public class AccountTest {

        public static void main(String[] args) {
            Account account1 = new Account("Timothy", 200.00);
            System.out.printf("%s's balance: $%.2f%n",
                    account1.getName(), account1.getBalance());


            Scanner input = new Scanner(System.in);

            System.out.println("Enter withdrawal amount for account1:");
            double withdrawalAmount = input.nextDouble();
            System.out.printf("%n deducting %.2f from account1 balance%n%n ", withdrawalAmount);
            account1.withdraw(withdrawalAmount);
            System.out.printf("%s's balance $%.2f%n%n",
                    account1.getName(),account1.getBalance());

        }
    }


