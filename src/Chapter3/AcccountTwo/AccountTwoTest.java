package Chapter3.AcccountTwo;

public class AccountTwoTest {

    public static void main(String[] args) {
        AccountTwo account1 = new AccountTwo("TIMOTHY", 30.00 );
        AccountTwo account2 = new AccountTwo("AYOMIDE", 300.00);

        account1.getBalance();
        displayAccount(account1);
        account2.getBalance();
        displayAccount(account2);

        System.out.printf("%nAdding $500.00 to account1 balance%n");
        account1.deposit(500.00);
        displayAccount(account1);
        account2.getBalance();
        displayAccount(account2);

        System.out.printf("%nAdding $50.00 to account2 balance%n");
        account1.getBalance();
        displayAccount(account1);
        account2.deposit(50.00);
        displayAccount(account2);

    }

    public static void displayAccount(AccountTwo accountToDisplay) {
        System.out.printf("%s'S balance is: $%.2f%n", accountToDisplay.getName(), accountToDisplay.getBalance());
    }
}
