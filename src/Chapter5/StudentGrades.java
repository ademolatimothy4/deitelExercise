package Chapter5;

import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int noOfStudent = 1;
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;

        while (noOfStudent <= 5) {
            System.out.print("Input Student Name: ");
            String studentName = input.nextLine();

            System.out.print("Input Letter Grade: ");
            String letterGrade = input.nextLine();
            noOfStudent++;

            switch (letterGrade) {
                case "A":
                    aCount++;
                    break;

                case "B":
                    bCount++;
                    break;

                case "C":
                    cCount++;
                    break;

                case "D":
                    dCount++;
                    break;

            }
        }

        System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n",
                "Number of students who received each grade:",
                "A: ", aCount,
                "B: ", bCount,
                "C: ", cCount,
                "D: ", dCount);

    }
}
