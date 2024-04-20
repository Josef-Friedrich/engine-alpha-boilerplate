package rocks.friedrich.enigne_alpha_boilerplate;

import ea.Game;
import ea.Scene;
import ea.actor.Text;

/**
 * Quelle <a href="https://engine-alpha.org/wiki/v4.x/Hello_World">Engine-Alpha-Wiki</a>
 */
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
