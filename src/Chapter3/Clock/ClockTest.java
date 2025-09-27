package Chapter3.Clock;

public class ClockTest {

    public static void main(String[] args) {

        Clock clock = new Clock(25, 37, 61);

        clock.setSecond(50);
        clock.setMinute(37);
        clock.setHour(12);

        System.out.println("Time is:"); clock.showTime();

    }
}
