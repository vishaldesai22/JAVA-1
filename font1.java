import java.awt.*;
import java.applet.*;
public class font1 extends Applet
{
Font f, f1;
String s, msg;
String fname;
String ffamily;
int size;
int style;
public void init()
{
f= new Font("times new roman",Font.ITALIC,20);
setFont(f);
msg="is interesting";
s="java programming";
fname=f.getFontName();
ffamily=f.getFamily();
size=f.getSize();
style=f.getStyle();
String f1=f.getName();
}
public void paint(Graphics g)
{
g.drawString("font name"+fname,60,44);
g.drawString("font family"+ffamily,60,77);
g.drawString("font size "+size,60,99);
g.drawString("fontstyle "+style,60,150);
g.drawString("fontname "+f1,60,190);
}
}