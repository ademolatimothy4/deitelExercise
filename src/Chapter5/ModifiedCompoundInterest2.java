package Chapter5;

public class ModifiedCompoundInterest2 {
    public static void main(String[] args) {

        int principalPennies = 100000;
        int rate = 5;
        System.out.printf("%s%20s%n", "Year", "Amount on deposit");

        for (int year = 1; year <= 10; year++) {

            double amount = principalPennies * Math.pow(1.0 + rate / 100.0, year);


            int amountPennies = (int) Math.round(amount);


            int dollars = amountPennies / 100;
            int cents = amountPennies % 100;


            System.out.printf("%4d%,17d.%02d%n", year, dollars, cents);
        }
    }
}
