package Chapter5;

public class TrianglePrintingProgram5_15 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            for (int j = 10; j >= i; j--) {
                System.out.print("*");
            }

            System.out.println();
        }
        System.out.println();

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= (i - 1); j++) {
                System.out.print("-");
            }
            System.out.println();

            System.out.print("..");
        }
    }
}
