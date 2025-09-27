package Chapter5;

public class DeMorgan {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int g = 3;
        int i = 4;
        int j = 5;
        int x = 6;
        int y = 7;

        boolean exp1 = !(x < 5) && !(y >= 7);
        boolean exp1Eqv = !((x < 5) || (y >= 7));

        boolean exp2 = !(a == b) || !(g != 5);
        boolean exp2Eqv = !((a == b) && !(g != 5));

        boolean exp3 = !((x <= 8) && (y > 4));
        boolean exp3Eqv =(!(x <= 8) || !(y > 4));

        boolean exp4 = !((i > 4) || (j <= 6));
        boolean exp4Eqv =(!(i > 4) && !(j <= 6));


        if (exp1 == exp1Eqv){
            System.out.println("Expression 1 is equal to its equivalent expression");
        }else {
            System.out.println("Expression 1 is not equal to its equivalent expression");
        }

        if (exp2 == exp2Eqv){
            System.out.println("Expression 2 is equal to its equivalent expression");
        }else {
            System.out.println("Expression 2 is not equal to its equivalent expression");
        }

        if (exp3 == exp3Eqv){
            System.out.println("Expression 3 is equal to its equivalent expression");
        }else {
            System.out.println("Expression 3 is not equal to its equivalent expression");
        }

        if (exp4 == exp4Eqv){
            System.out.println("Expression 4 is equal to its equivalent expression");
        }else {
            System.out.println("Expression 4 is not equal to its equivalent expression");
        }


    }
}
