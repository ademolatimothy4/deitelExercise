package Chapter5;

public class DivisibleByThree {
    public static void main(String[] args) {
        int total = 0;
        System.out.println("Integers between 1 and 30 that are divisible by three are: ");
        for (int i = 3; i <= 30; i += 3) {
            System.out.print(i + " ");
            total = total + i;

        }
        System.out.println();
        System.out.println("The total of all integers is: " + total);
    }
}