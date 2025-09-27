package Chapter5;

public class SumOfSeries {
    public static void main(String[] args) {

        long sum = 0;

        System.out.printf("%3s%10s%n", "n", "Sum");
        for(int n = 1; n <= 100; n++) {
            sum = sum + n;

            System.out.printf("%n%-3d%10d ", n, sum);


        }
    }
}
