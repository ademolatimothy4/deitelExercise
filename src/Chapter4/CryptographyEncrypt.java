package Chapter4;

import java.util.Scanner;

public class CryptographyEncrypt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter code: ");
        int code = input.nextInt();

        int lastNumber = code % 10;
        int thirdNumber = (code / 10) % 10;
        int secondNumber = (code / 100) % 10;
        int firstNumber = (code / 1000) % 10;

        int addLastNumber = lastNumber + 7;
        int addThirdNumber = thirdNumber + 7;
        int addSecondNumber = secondNumber + 7;
        int addFirstNumber = firstNumber + 7;

        int remainderLast = addLastNumber % 10;
        int remainderThird = addThirdNumber % 10;
        int remainderSecond = addSecondNumber % 10;
        int remainderFirst = addFirstNumber % 10;

        System.out.print("Your new encrypted code is: ");
        System.out.print(remainderThird);
        System.out.print(remainderLast);
        System.out.print(remainderFirst);
        System.out.print(remainderSecond);
    }
}