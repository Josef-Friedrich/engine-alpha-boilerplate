package rocks.friedrich.enigne_alpha_boilerplate;

import java.awt.Color;
import java.awt.GraphicsEnvironment;
import java.awt.event.KeyEvent;

import ea.Game;
import ea.Scene;
import ea.actor.Text;
import ea.event.KeyListener;

public class TextAllSystemFonts extends Scene implements KeyListener
{
  public static void main(String[] args)
  {
    Game.start(1020, 520, new TextAllSystemFonts());
    Game.setTitle("Text Example");
  }

  public TextAllSystemFonts()
  {
    Text überschrift = new Text("Alle System-Schriftarten", 2f);
    überschrift.setPosition(-12, 3);
    überschrift.setColor(new Color(0, 0, 0));
    add(überschrift);
    loadFonts();
    setBackgroundColor(new Color(255, 255, 255));
  }

  private void loadFonts()
  {
    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
    String[] systemFonts = ge.getAvailableFontFamilyNames();
    for (int i = 0; i < systemFonts.length; i++)
    {
      String fontName = systemFonts[i];
      Text text = new Text(fontName, 1, fontName);
      text.setPosition(-12, -1 * i);
      text.setColor(new Color(0, 0, 0));
      add(text);
    }
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
  }
}
