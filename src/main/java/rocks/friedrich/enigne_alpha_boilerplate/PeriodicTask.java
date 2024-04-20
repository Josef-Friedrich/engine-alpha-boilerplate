package rocks.friedrich.enigne_alpha_boilerplate;

import java.util.Timer;
import java.util.TimerTask;

public class PeriodicTask
{
    public static void main(String[] args)
    {
        Timer timer = new Timer();
        TimerTask task = new TimerTask()
        {
            @Override
            public void run()
            {
                System.out.println("Do something!");
            }
        };
        timer.scheduleAtFixedRate(task, 0, 1000);
    }
}
