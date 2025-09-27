package Chapter3.Account;

public class Account {

        private String name;
        private double balance;
        public Account(String name, double balance) {
            this.name = name;

            if (balance > 0.0) {
                this.balance = balance;
            }
        }
        public void withdraw(double withdrawalAmount) {

            if (withdrawalAmount > balance) {
                System.out.println("withdrawal amount exceeded account balance");
            }else
            if (withdrawalAmount > 0.0) {
                balance = balance - withdrawalAmount;
            }

        }

        public double getBalance() {

            return balance;
        }

        public void setName(String name) {

            this.name = name;
        }

        public String getName() {

            return name;
        }
    }


