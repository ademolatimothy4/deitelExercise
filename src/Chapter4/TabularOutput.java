package Chapter4;

public class TabularOutput {
    public static void main(String[] args) {

        int number = 1;
        System.out.println("N  N² N³ N⁴");
        while (number <= 8) {
            number = 2 * number;
            System.out.print(number + "  ");
        }

        System.out.println("");
        int number2 = 1;
        while (number2 <= 27) {
            number2 = 3 * number2;
            System.out.print(number2 + "  ");
        }

        System.out.println("");
        int number3 = 1;
        while (number3 <= 64) {
            number3 = 4 * number3;
            System.out.print(number3 + "  ");
        }

        System.out.println("");
        int number4 = 1;
        while (number4 <= 125) {
            number4 = 5 * number4;
            System.out.print(number4 + "  ");
        }
    }
}


