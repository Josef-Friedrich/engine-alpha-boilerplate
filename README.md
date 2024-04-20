# engine-alpha-boilerplate

## Links

* [Engine Alpha](https://engine-alpha.org)
* [Offical Repository](https://github.com/engine-alpha/engine-alpha)
* [My fork](https://github.com/Josef-Friedrich/engine-alpha)

## Hello World

```java
import ea.Game;
import ea.Scene;
import ea.actor.Text;

public class HelloWorld extends Scene
{
    public HelloWorld()
    {
        Text helloworld = new Text("Hello World", 2);
        helloworld.setCenter(0, 1);
        add(helloworld);
    }

    public static void main(String[] args)
    {
        Scene helloWorld = new HelloWorld();
        Game.start(400, 300, helloWorld);
    }
}
```

## Periodische Aufgaben

```java
import java.util.TimerTask;
import java.util.Timer;

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
```
