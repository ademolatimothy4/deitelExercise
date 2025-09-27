package Chapter3.HealthProfile;
import java.util.Scanner;
public class HealthProfileTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HealthProfile healthProfile = new HealthProfile("Timothy", "Ademola", "Male", 02, 28, 2005, 5.1, 60);
        System.out.println("Enter first name: ");
        String firstName = scanner.nextLine();
        healthProfile.setFirstName(firstName);

        System.out.println("Enter last name: ");
        String lastName = scanner.nextLine();
        healthProfile.setLastName(lastName);

        System.out.println("Enter Gender: ");
        String gender = scanner.nextLine();
        healthProfile.setGender(gender);

        System.out.println("Enter month of birth: ");
        int monthOfBirth = scanner.nextInt();
        healthProfile.setMonthOfBirth(monthOfBirth);

        System.out.println("Enter day of birth: ");
        int dayOfBirth = scanner.nextInt();
        healthProfile.setDayOfBirth(dayOfBirth);

        System.out.println("Enter year of birth: ");
        int yearOfBirth = scanner.nextInt();
        healthProfile.setYearOfBirth(yearOfBirth);

        System.out.println("Enter Height: ");
        double height = scanner.nextDouble();
        healthProfile.setHeight(height);

        System.out.println("Enter Weight: ");
        double weight = scanner.nextDouble();
        healthProfile.setWeight(weight);;

        System.out.println("Name is: " + healthProfile.getFirstName() + " " + healthProfile.getLastName());

        int age = healthProfile.calculateAge();
        System.out.println("Age is: " + age + " years");


        int maxHeartRate = healthProfile.calculateMaxHeartRate();
        System.out.println("Maximum heart rate is: " + maxHeartRate + " beats per minute");

        String targetHeartRate = healthProfile.calculateTargetHeartRate();
        System.out.println("Target heart range is: " + targetHeartRate);

        double bodyMaXIndex = healthProfile.calculateBodyMaxIndex();
        System.out.println("Body max index (BMI) IS: " + bodyMaXIndex);

    }
}
