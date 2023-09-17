package Chapter3;

public class Clock {
    private int hour;
    private int minutes;
    private int seconds;

    public Clock(int hour, int minutes, int seconds){
        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void sethour(int hour) {
        if (hour <= 23) {
            this.hour = hour;
        } else {
            this.hour = 0;
        }
    }

    public int getHour() {
        if(hour > 23)
        return 0;
        return hour;
    }

    public void setMinutes(int minutes) {
        if(minutes <= 59) {
        this.minutes = minutes;
        }else {this.minutes = 0;
        }
    }

    public int getMinutes() {
        if (minutes >= 59){
            this.minutes = 0;
        }return minutes;
    }

    public void setSeconds(int seconds) {
        if(seconds <= 59) {
            this.seconds = seconds;
        }else {
            this.minutes = 0;
        }
    }

    public int getSeconds() {
        return seconds;
    }
    public void displayTime(){
        System.out.printf("%d:%d:%d", hour, minutes, seconds);
    }
}
