public class ClockTest {

    public static void main(String[] args) {


        Clock clock = new Clock(10,9,20);

        int hour_clock = clock.getHour();
        int minute_clock = clock.getMinute();
        int second_clock = clock.getSecond();



        System.out.printf("%02d:%02d:%02d",hour_clock,minute_clock,second_clock);
    }
}
