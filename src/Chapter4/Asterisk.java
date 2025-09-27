package Chapter4;

public class Asterisk {
    public static void main(String[] args) {
        int a = 1;
        while (a <= 4) {
            int b= 1;
            while (b <= 8) {
                System.out.print("* ");
                b++;
            }
            System.out.println();
            System.out.print(" ");

            int c = 1;
            while (c <= 8) {
                System.out.print("* ");
                c++;
            }
            System.out.println();
            a++;
        }
    }
}
