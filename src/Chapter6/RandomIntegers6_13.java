package Chapter6;

import java.security.SecureRandom;

public class RandomIntegers6_13 {
    public static void main(String[] args) {
        SecureRandom randomValue = new SecureRandom();

        int randomNum = 3 * randomValue.nextInt(5);
        System.out.printf("%d ", randomNum);

        System.out.println();
        int diff = 1;

        int randomNum2 = 1 + (diff*2) * randomValue.nextInt(6);
        System.out.printf("%d ", randomNum2);


        System.out.println();

        int randomNum3 = 10 + 10 * randomValue.nextInt(4);
        System.out.printf("%d ", randomNum3);

    }
}
