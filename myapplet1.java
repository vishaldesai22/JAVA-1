//Write a program to design an applet to display three circles filled with three
//different colors on screen. [ W-14, W-15 ]

import java.awt.*;
import java.applet.*;
public class myapplet1 extends Applet
{
public void paint(Graphics g)
{
g.setColor(Color.red);
g.fillOval(50,50,100,100);
g.setColor(Color.green);
g.fillOval(50,150,100,100);
g.setColor(Color.yellow);
g.fillOval(50,250,100,100);
}
}