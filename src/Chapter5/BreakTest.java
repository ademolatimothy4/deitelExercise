package Chapter5;

public class BreakTest {

    public static void main(String[] args) {
        int count;

        for (count = 1; count <= 10 && count!=5; count++) {

            System.out.printf("%d ", count);
        }

        System.out.printf("%nBroke out of loop at count = %d%n", count);
    }
}

