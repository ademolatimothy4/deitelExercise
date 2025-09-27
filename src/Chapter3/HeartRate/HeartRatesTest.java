package Chapter3.HeartRate;

import java.util.Scanner;
public class HeartRatesTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        HeartRates heartRates = new HeartRates("Timothy", "Ademola", 2, 28, 1990);

        System.out.println("Enter first name: ");
        String firstName = scanner.nextLine();
        heartRates.setFirstName(firstName);

        System.out.println("Enter last name: ");
        String lastName = scanner.nextLine();
        heartRates.setLastName(lastName);

        System.out.println("Enter month of birth: ");
        int monthOfBirth = scanner.nextInt();
        heartRates.setMonthOfBirth(monthOfBirth);

        System.out.println("Enter day of birth: ");
        int dayOfBirth = scanner.nextInt();
        heartRates.setDayOfBirth(dayOfBirth);

        System.out.println("Enter year of birth: ");
        int yearOfBirth = scanner.nextInt();
        heartRates.setYearOfBirth(yearOfBirth);

        System.out.println("Name is: " + heartRates.getFirstName() + " " + heartRates.getLastName());

        int age = heartRates.calculateAge();
        System.out.println("Age is: " + age + " years");

        int maxHeartRate = heartRates.calculateMaxHeartRate();
        System.out.println("Maximum heart rate is: " + maxHeartRate + " beats per minute");

        String targetHeartRate = heartRates.calculateTargetHeartRate();
        System.out.println("Target heart range is: " + targetHeartRate);

    }
}
