package Chapter5;

public class PiCalculation {
    public static void main(String[] args) {
        double pi = 0.0;
        int denominator = 1;
        int sign = 1;
        int totalTerms = 200_000;
        System.out.printf("%-10s%-20s%n", "Term", "Pi Approximation");
        for (int term = 1; term <= totalTerms; term++) {
            double approximation = sign * (4.0 / denominator);
            pi += approximation;

            System.out.printf("%-10s%-20.10s%n", term, pi);
            sign = sign * -1;

            denominator = denominator + 2;

        }

    }
}
