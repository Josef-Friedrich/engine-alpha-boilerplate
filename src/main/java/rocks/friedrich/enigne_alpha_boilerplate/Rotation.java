package rocks.friedrich.enigne_alpha_boilerplate;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;

import ea.Game;
import ea.Scene;
import ea.Vector;
import ea.actor.Polygon;
import ea.actor.Text;
import ea.event.KeyListener;

/**
 * 90 ^ | 180 <----|---> 0 | | 270
 */
public class Rotation extends Scene implements KeyListener
{
  Polygon arrow;

  Text text;

  DecimalFormat df = new DecimalFormat("0.0");

  public static void main(String[] args)
  {
    Game.start(1020, 520, new Rotation());
    Game.setTitle("Rotation Example");
    Game.setDebug(true);
  }

  public Rotation()
  {
    arrow = new Polygon(new Vector(0, 0), new Vector(3, 0.5), new Vector(0, 1));
    arrow.setCenter(1.5f, 0.5f);
    arrow.setColor(new Color(0, 0, 0));
    add(arrow);
    text = new Text("", 1);
    text.setPosition(-5, 5);
    text.setColor(Color.BLACK);
    add(text);
    setBackgroundColor(new Color(255, 255, 255));
  }

  private void setText()
  {
    text.setContent("" + df.format(arrow.getRotation()));
  }

  private void setRotation(float degree)
  {
    arrow.setRotation(degree);
    setText();
  }

  private void rotateBy(float degree)
  {
    arrow.rotateBy(degree);
    setText();
  }

  @Override
  public void onKeyDown(KeyEvent keyEvent)
  {
    switch (keyEvent.getKeyCode())
    {
    case KeyEvent.VK_RIGHT:
      setRotation(0);
      break;

    case KeyEvent.VK_UP:
      setRotation(90);
      break;

    case KeyEvent.VK_LEFT:
      setRotation(180);
      break;

    case KeyEvent.VK_DOWN:
      setRotation(270);
      break;

    case KeyEvent.VK_L:
      setRotation(360);
      break;

    case KeyEvent.VK_K:
      setRotation(450);
      break;

    case KeyEvent.VK_H:
      setRotation(540);
      break;

    case KeyEvent.VK_J:
      setRotation(630);
      break;

    case KeyEvent.VK_PLUS:
      rotateBy(15);
      break;

    case KeyEvent.VK_MINUS:
      rotateBy(-15);
      break;
    }
  }
}
