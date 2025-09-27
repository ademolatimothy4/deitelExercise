package Chapter5;

public class Test5_19 {
    public static void main(String[] args) {


        int i = 2;
        int j = 3;
        int k = 2;
        int m = 2;
        System.out.println(i == 2);
        System.out.println(j == 5);
        System.out.println((i >= 0) && (j <= 3));
        System.out.println((m <= 100) & (k <= m));
        System.out.println((j >= i) || (k != m));
        System.out.println((k + i < j) | (4 - j >= k));
        System.out.println(!(k > j));
    }
}