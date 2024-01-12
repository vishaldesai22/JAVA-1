import java.applet.*;
import java.awt.*;
public class DrawGraphics extends Applet
{
public void paint(Graphics g)
{
int x[ ] = {10, 170, 80};
int y[ ] = {20, 40, 140};
int n = 3;
g.drawPolygon(x, y, n);
g.drawRect(10, 150,100, 80);
g.drawOval(10, 250, 100, 80);
g.fillOval(10, 350, 100, 80);
}
}