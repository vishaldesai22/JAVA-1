import java.awt.*;
import java.applet.*;
public class FontApplet extends Applet
{
public void paint(Graphics g)
{
Font a = new Font ("TimesRoman", Font.PLAIN, 10);
Font b = new Font ("TimesRoman", Font.PLAIN, 10);
// displays true since the objects have equivalent settings
g.drawString(""+a.equals(b),30,60);
}
}