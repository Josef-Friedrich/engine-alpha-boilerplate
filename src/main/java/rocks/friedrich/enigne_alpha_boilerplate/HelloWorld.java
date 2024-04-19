package rocks.friedrich.enigne_alpha_boilerplate;

import ea.Scene;
import ea.Game;

import ea.actor.Text;

/**
 * https://engine-alpha.org/wiki/v4.x/Hello_World
 */
public class HelloWorld extends Scene {

    public HelloWorld() {
        Text helloworld = new Text("Hello World", 2);
        helloworld.setCenter(0, 1);
        this.add(helloworld);
        Game.setDebug(true);
    }

    public static void main(String[] args) {
        Scene helloWorld = new HelloWorld();
        Game.start(400, 300, helloWorld);
    }
}
