package Chapter5;

import java.util.Scanner;

public class BarChart5_16 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        System.out.print("Enter third number: ");
        int num3 = input.nextInt();
        System.out.print("Enter fourth number: ");
        int num4 = input.nextInt();
        System.out.print("Enter fifth number: ");
        int num5 = input.nextInt();
        System.out.println("""
            
                """);

        for(int i = 1; i<=num1;i++) {
            System.out.print("*");
        }
        System.out.println();

        for(int i = 1; i<=num2;i++) {
            System.out.print("*");
        }
        System.out.println();

        for(int i = 1; i<=num3;i++) {
            System.out.print("*");
        }
        System.out.println();

        for(int i = 1; i<=num4;i++) {
            System.out.print("*");
        }
        System.out.println();

        for(int i = 1; i<=num5;i++) {
            System.out.print("*");
        }
    }
}
