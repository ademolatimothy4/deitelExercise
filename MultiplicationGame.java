package SpringBoot;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;

public class MultiplicationGame {
    public static int firstNumber;
    public static int secondNumber;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> answerArray = new ArrayList<>();
        ArrayList<String> questionArray = new ArrayList<String>();
        System.out.println("""
                Welcome to the Multiplication Game!
                Type 0 anytime to end the game.
                """);
        int answer;
        do {
            String question = question();
            questionArray.add(question);
            System.out.println();
            System.out.print("Answer: ");
            answer = input.nextInt();
            answerArray.add(answer);
        } while (answer != 0);

        System.out.println("""
                -----------------------
                HERE ARE YOUR RESPONSES
                -----------------------
                """);
        for (int index = 0; index < questionArray.toArray().length -1; index++) {
            System.out.print(questionArray.get(index) + " " + answerArray.get(index));
            System.out.println();
        }
        System.out.println("Thank you for playing");
    }

    public static String question() {
        SecureRandom randomNumber = new SecureRandom();
        firstNumber = randomNumber.nextInt(1, 9);
        secondNumber = randomNumber.nextInt(1, 9);
        String question = "What is " + firstNumber + " * " + secondNumber + " ?";
        System.out.print(question);
        return question;
    }
}