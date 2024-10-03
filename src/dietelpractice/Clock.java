package dietelpractice;

public class Clock {
    private int hour;
    private int minute;
    private int second;
    public Clock(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }
    public int setHour(int hour) {
        if(hour >= 0 && hour <= 23) {
            this.hour = hour;
        }else{
            this.hour = 0;
        }
        return hour;
    }
    public int setMinute(int minute) {
        if(minute >= 0 && minute <= 59) {
            this.minute = minute;
        }else{
            this.minute = 0;
        }
        return minute;
    }
    public int setSecond(int second) {
        if (second >= 0 && second <= 59) {
            this.second = second;
        } else {
            this.second = 0;
        }
        return second;
    }
}
