package Chapter4;

import java.util.Scanner;

public class CryptographyDecrypt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter encrypted code: ");
        int code = input.nextInt();

        int lastNumber = code % 10;
        int thirdNumber = (code / 10) % 10;
        int secondNumber = (code / 100) % 10;
        int firstNumber = (code / 1000) % 10;

        int newFirstNumber = thirdNumber;
        int newSecondNumber = lastNumber;
        int newThirdNumber = firstNumber;
        int newLastNumber = secondNumber;

        int realFirstNum = newFirstNumber - 7;
        int realSecondNum = newSecondNumber - 7;
        int realThirdNum = newThirdNumber - 7;
        int realLastNum = newLastNumber - 7;

        if (realFirstNum < 0) {
            realFirstNum += 10;
        }

        if (realSecondNum < 0) {
            realSecondNum += 10;
        }

        if(realThirdNum < 0) {
            realThirdNum +=10;
        }

        if(realLastNum < 0) {
            realLastNum +=10;
        }

        System.out.print("Your original code was: ");
        System.out.print(realFirstNum);
        System.out.print(realSecondNum);
        System.out.print(realThirdNum);
        System.out.print(realLastNum);
    }
}
