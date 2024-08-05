public class Time {
    private int second = 0;
    private int minute = 0;
    private int hour = 0;

    public Time() {
        this.second = 0;
        this.minute = 0;
        this.hour = 0;
    }

    public Time(int second, int minute, int hour) {
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    
    public String toString() {
        return ("Hour:" + this.hour + " Minute:" + this.minute + " Second:" + this.second);
    }

    public void setTime(int second, int minute, int hour) {
        this.second = second;
        this.minute = minute;
        this.hour = hour;

    }
    
    public Time nextSecond() {
        return ();
        
    }
}