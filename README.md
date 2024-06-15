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

# Tastatureingaben

```java
import java.awt.Color;
import java.awt.event.KeyEvent;

import ea.Game;
import ea.Scene;
import ea.actor.Rectangle;
import ea.event.KeyListener;

public class KeyboardInput extends Scene implements KeyListener
{
    Rectangle rectangle;

    public KeyboardInput()
    {
        rectangle = new Rectangle(2, 2);
        rectangle.setColor(Color.BLUE);
        add(rectangle);
    }

    @Override
    public void onKeyDown(KeyEvent keyEvent)
    {
        switch (keyEvent.getKeyCode())
        {
        case KeyEvent.VK_LEFT:
            rectangle.moveBy(-1, 0);
            break;

        case KeyEvent.VK_RIGHT:
            rectangle.moveBy(1, 0);
            break;
        }
    }

    public static void main(String[] args)
    {
        Game.start(600, 400, new KeyboardInput());
    }
}
```
