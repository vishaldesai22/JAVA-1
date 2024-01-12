//Write a simple applet program which display three concentric circle. [S-16]
import java.awt.*;
import java.applet.*;
public class CircleDemo extends Applet
{
public void paint (Graphics g)
{
g.drawOval(100,100,190,190);
g.drawOval(115,115,160,160);
g.drawOval(130,130,130,130);
}
}