package rocks.friedrich.enigne_alpha_boilerplate;

import java.awt.event.KeyEvent;

import ea.Game;
import ea.Scene;
import ea.Vector;
import ea.actor.BodyType;
import ea.actor.Circle;
import ea.actor.Rectangle;
import ea.event.KeyListener;

public class Physics extends Scene implements KeyListener
{
  Rectangle rectangle;

  public static void main(String[] args)
  {
    Game.start(1020, 520, new Physics());
    Game.setTitle("Physics Example");
  }

  public Physics()
  {
    Circle circle = new Circle(2);
    circle.setBodyType(BodyType.DYNAMIC);
    circle.setCenter(0, 3);
    add(circle);
    rectangle = new Rectangle(5, 1);
    // Bei BodyType.STATIC fällt der Ball nicht herunter
    rectangle.setBodyType(BodyType.KINEMATIC);
    rectangle.setCenter(0, 0);
    add(rectangle);
    setGravity(new Vector(0, -9.81f));
  }

  @Override
  public void onKeyDown(KeyEvent keyEvent)
  {
    if (keyEvent.getKeyCode() == KeyEvent.VK_UP)
    {
      getCamera().moveBy(0, 5);
    }
    else if (keyEvent.getKeyCode() == KeyEvent.VK_DOWN)
    {
      getCamera().moveBy(0, -5);
    }
    else if (keyEvent.getKeyCode() == KeyEvent.VK_LEFT)
    {
      rectangle.moveBy(-1, 0);
    }
    else if (keyEvent.getKeyCode() == KeyEvent.VK_RIGHT)
    {
      rectangle.moveBy(1, 0);
    }
  }
}
