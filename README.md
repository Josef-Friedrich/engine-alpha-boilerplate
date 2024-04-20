# engine-alpha-boilerplate

## Links

* [Engine Alpha](https://engine-alpha.org)
* [Offical Repository](https://github.com/engine-alpha/engine-alpha)
* [My fork](https://github.com/Josef-Friedrich/engine-alpha)

# Hello World

```java
import ea.Scene;
import ea.Game;

import ea.actor.Text;

public class HelloWorld_v1
        extends Scene{

    public HelloWorld_v1() {
        Text helloworld = new Text("Hello World", 2);
        helloworld.setCenter(0,1);
        this.add(helloworld);
        //Game.setDebug(true);
    }

    public static void main(String[] args) {
        Scene helloWorld = new HelloWorld_v1();
        Game.start(400, 300, helloWorld);
    }
}
```


# Periodische Aufgaben

```java
Timer timer = new Timer();
TimerTask task = new TimerTask() {
    @Override
    public void run() {
        System.out.println("Do something!");
    }
};
timer.scheduleAtFixedRate(task, 0, 1000);
```
