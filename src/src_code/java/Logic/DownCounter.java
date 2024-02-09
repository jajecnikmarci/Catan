package Logic;

import java.util.Timer;
import java.util.TimerTask;

public class DownCounter {

    static int interval;
    static Timer timer;

    public void countDown(int countdownForSeconds) {
        int delay = 1000;
        int period = 1000;
        timer = new Timer();
        interval = countdownForSeconds; //Ide kell a visszaszámolandó idő
        timer.scheduleAtFixedRate(new TimerTask() {

            public void run() {
                System.out.println(setInterval()); //Ez hajtódik végre a számláló belsejében

            }
        }, delay, period);
    }

    private int setInterval() {
        if (interval == 1)
            timer.cancel(); //Ez állítja le a számlálót
        return --interval;
    }

}
