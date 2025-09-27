package Chapter5;

public class CompoundInterestModified {
    public static void main(String[] args) {
        double principal = 1000.00;
        int number = 5;
        double rate = (double) number / 100;

        while (number <= 10) {
            rate = (double) number / 100;
            System.out.println("Rate is: " + rate);
            System.out.printf("%s%20s%n", "Year", "Amount on deposit");

            for (int year = 1; year <= 10; year++) {
                double amount = principal * Math.pow(1.0 + rate, year);

                System.out.printf("%4d%,20.2f%n", year, amount);
            }

            number++;
        }
    }
}
