package Chapter6;

import java.security.SecureRandom;

public class RandomIntegers6_12 {
    public static void main(String[] args) {
        SecureRandom randomIntegers = new SecureRandom();

        for (int counter = 1; counter <= 10; counter++) {
            int face = 2 + randomIntegers.nextInt(6);
            System.out.printf("%d ", face);
        }
        System.out.println();

        for (int counter = 1; counter <= 10; counter++) {
            int face = 4 + randomIntegers.nextInt(50);
            System.out.printf("%d ", face);
        }
        System.out.println();

        for (int counter = 1; counter <= 10; counter++) {
            int face = randomIntegers.nextInt(7);
            System.out.printf("%d ", face);
        }
        System.out.println();

        for (int counter = 1; counter <= 10; counter++) {
            int face = 1000 + randomIntegers.nextInt(1030);
            System.out.printf("%d ", face);
        }
        System.out.println();

        for (int counter = 1; counter <= 10; counter++) {
            int face = -5 + randomIntegers.nextInt(1);
            System.out.printf("%d ", face);
        }
        System.out.println();
        for (int counter = 1; counter <= 10; counter++) {
            int face = -2 + randomIntegers.nextInt(9);
            System.out.printf("%d ", face);
        }
    }
}
