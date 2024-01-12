class A extends Thread
{
public void run()
{
for(int i=1;i<=5; i++)
{
System.out.println("From thread A: i=" +i);
}
System.out.println("Exit from A");
}
}
class B extends Thread
{
public void run()
{
for(int j=1; j<=5; j++)
{
System.out.println("From thread B: j=" +j);
}
System.out.println("Exit from B");
}
}
class ThreadDemo
{
public static void main(String args[])
{

A a1=new A();
B b1=new B();
a1.start();
b1.start();

}
}