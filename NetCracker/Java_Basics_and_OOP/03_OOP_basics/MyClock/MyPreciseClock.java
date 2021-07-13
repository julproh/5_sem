class MyClock {
    public int hours;
    public int minutes;
    public void nextMinute() {
        minutes++;
        if (minutes >= 60) {
            minutes = 0;
            hours++;
            if (hours >= 24) {
                hours = 0;
            }
        }
    }
    public String toString() {
        return "MyClock [" + hours + ":" +  minutes + "]";
    }

}

public class MyPreciseClock extends MyClock {
    private int seconds;
    public int getSecond() {
        return seconds;
    }
    public void nextSecond() {
        seconds++;
        if (seconds >= 60) {
            seconds = 0;
            nextMinute();
            }
        }
        public String toString() {
            return "MyPreciseClock [" + hours + ":" +  minutes + ":" + seconds+ "]";
        }
public static void main(String[] args)
 {    MyClock mc = new MyClock();
    MyPreciseClock mpc = new MyPreciseClock();
    MyClock mpc2 = new MyPreciseClock();
    System.out.println(mc instanceof MyClock);
    System.out.println(mc instanceof MyPreciseClock);
    System.out.println(mpc instanceof MyClock);
    System.out.println(mpc instanceof MyPreciseClock);
    System.out.println(mc.toString());
    System.out.println(mpc.toString());
    System.out.println(mpc2.toString());

 }
}
