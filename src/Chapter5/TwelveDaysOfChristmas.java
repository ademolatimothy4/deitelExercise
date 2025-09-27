package Chapter5;

public class TwelveDaysOfChristmas {
    public static void main(String[] args) {

        for (int day = 1; day <= 12; day++) {
            System.out.print("On the ");
            switch (day) {
                case 1:
                    System.out.print("First");
                    break;
                case 2:
                    System.out.print("Second");
                    break;
                case 3:
                    System.out.print("Third");
                    break;
                case 4:
                    System.out.print("Fourth");
                    break;
                case 5:
                    System.out.print("Fifth");
                    break;
                case 6:
                    System.out.print("Sixth");
                    break;
                case 7:
                    System.out.print("Seventh");
                    break;
                case 8:
                    System.out.print("Eighth");
                    break;
                case 9:
                    System.out.print("Ninth");
                    break;
                case 10:
                    System.out.print("Tenth");
                    break;
                case 11:
                    System.out.print("Eleventh");
                    break;
                case 12:
                    System.out.print("Twelfth");
                    break;
            }

            System.out.println(" day of christmas, my true love sent to me ");

            for (int gift = day; gift >= 1; gift--) {
                switch (gift) {
                    case 1:
                        System.out.println("A partridge in a pear tree");
                        break;
                    case 2:
                        System.out.println("Two turtle doves");
                        break;
                    case 3:
                        System.out.println("Three French hens");
                        break;
                    case 4:
                        System.out.println("four calling birds");
                        break;
                    case 5:
                        System.out.println("five gold rings");
                        break;
                    case 6:
                        System.out.println("six geese a-laying");
                        break;
                    case 7:
                        System.out.println("seven swans a-swimming");
                        break;
                    case 8:
                        System.out.println("eight maids a-milking");
                        break;
                    case 9:
                        System.out.println("nine ladies dancing");
                        break;
                    case 10:
                        System.out.println("ten lords a-leaping");
                        break;
                    case 11:
                        System.out.println("eleven pipers piping");
                        break;
                    case 12:
                        System.out.println("twelve drummers drumming");
                        break;

                }
            }
            System.out.println();
        }
    }
}
