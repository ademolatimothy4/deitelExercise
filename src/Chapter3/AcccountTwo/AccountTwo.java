package Chapter3.AcccountTwo;

public class AccountTwo {
    private String name;
    private double balance;

    public AccountTwo(String name, double balance) {
        this.name = name;

        if (balance > 0) {
            this.balance = balance;
        }
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0) {
            balance = balance + depositAmount;
        }
    }
}

