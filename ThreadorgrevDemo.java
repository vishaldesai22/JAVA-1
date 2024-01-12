
class original extends Thread
{
public void run()
{
for(int i=1; i<=50;i++)
{
System.out.println(" First Thread="+i);
}
}
}
class reverse extends Thread
{
public void run()
{
for(int j=50; j >=1; j--)
{
System.out.println(" Second Thread="+j);
}
}
}
class ThreadorgrevDemo
{
public static void main(String args[])
{
System.out.println("first thread printing 1 to 50 in ascending order");
original o=new original();
reverse r=new reverse();
o.start();
System.out.println("second thread printing 50 to 1 in reveres order");
r.start();
System.out.println("Exit from Main");
}
}