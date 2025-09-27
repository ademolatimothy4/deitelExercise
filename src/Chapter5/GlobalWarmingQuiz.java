package Chapter5;

import java.util.Scanner;

public class GlobalWarmingQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int correct = 0;
        int wrong = 0;
        System.out.println("""
                Question 1
                According to Al Gore, what incorrect assumption leads many people to believe that humans cannot affect the environment?
                
                1. The Earth constantly repairs itself.
                2. The Earth is too big to be harmed by human activities.
                3. The environment has natural protective layers.
                4. Scientists exaggerate environmental issues.
                
                """);
        System.out.print("Your answer here: ");
        int answer1 = input.nextInt();
        switch (answer1) {
            case 1:
                wrong++;
                break;
            case 2:
                correct++;
                break;
            case 3:
                wrong++;
                break;
            case 4:
                wrong++;
                break;
        }
        System.out.println();

        System.out.println("""
                Question 2
                In "An Inconvenient Truth", how does Al Gore describe global warming?
                
                1. A purely scientific issue
                2. A political debate
                3. A moral issue
                4. An inevitable natural process
                
                """);
        System.out.print("Your answer here: ");
        int answer2 = input.nextInt();
        switch (answer2) {
            case 1:
                wrong++;
                break;
            case 2:
                wrong++;
                break;
            case 3:
               correct++;
                break;
            case 4:
                wrong++;
                break;
        }
        System.out.println();

        System.out.println("""
                Question 3
                Which example does Gore use to demonstrate that global warming is real and significant?
                
                1. Expansion of deserts worldwide
                2. Retreat of glaciers in several regions
                3. Increased volcanic activity
                4. Faster continental drift
                
                """);
        System.out.print("Your answer here: ");
        int answer3 = input.nextInt();
        switch (answer3) {
            case 1:
                wrong++;
                break;
            case 2:
                correct++;
                break;
            case 3:
                wrong++;
                break;
            case 4:
                wrong++;
                break;
        }
        System.out.println();

        System.out.println("""
                Question 4
                What could be the consequence of a major ice sheet collapse in Greenland or West Antarctica, according to the film?
                
                1. Increased rainfall across continents
                2. A rise in global sea levels by about 20 feet
                3. The extinction of all polar species
                4. Global cooling in coastal regions
                
                """);
        System.out.print("Your answer here: ");
        int answer4 = input.nextInt();
        switch (answer4) {
            case 1:
                wrong++;
                break;
            case 2:
                correct++;
                break;
            case 3:
                wrong++;
                break;
            case 4:
                wrong++;
                break;
        }
        System.out.println();

        System.out.println("""
                Question 5
                What solution does Gore emphasize at the end of the documentary?
                
                1. Relying solely on government policies
                2. Relocating populations away from coastal areas
                3. Reducing CO₂ emissions and planting more vegetation
                4. Waiting for natural environmental recovery
                
                """);
        System.out.print("Your answer here: ");
        int answer5 = input.nextInt();
        switch (answer5) {
            case 1:
                wrong++;
                break;
            case 2:
                wrong++;
                break;
            case 3:
                correct++;
                break;
            case 4:
                wrong++;
                break;
        }
        System.out.println();

        System.out.printf("You had %d correct answers %n",correct);
        System.out.printf("You had %d incorrect answers %n", wrong);

        if (correct == 5) {
            System.out.println("Excellent");
        }

        if (correct == 4) {
            System.out.println("Very good");
        }

        if (correct <= 3) {
            System.out.println(""" 
                            Time to brush up on your knowledge of global warming
                            You can use this site https://en.wikipedia.org/wiki/An_Inconvenient_Truth
                            """
            );
        }
    }
}
