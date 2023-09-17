package Chapter3;

public class ClockDriver {
    public static void main(String[] args) {
        Clock time = new Clock(23,59,59);
        time.displayTime();
        time.setMinutes(59);
        time.sethour(23);
        time.setSeconds(59);


    }
}
