package rocks.friedrich.enigne_alpha_boilerplate;

import java.awt.Color;
import java.awt.event.KeyEvent;

import ea.Game;
import ea.Scene;
import ea.actor.Rectangle;
import ea.event.KeyListener;

/**
 * @see https://engine-alpha.org/wiki/v4.x/User_Input
 */
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
