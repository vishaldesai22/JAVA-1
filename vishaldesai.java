class A extends Thread
{
public void run ()
{System.out.println(“thread a is started”)  ;
for (int i=0;i<=5;i++)
{System.out.println(“from thread A:=” +i);
}}
class B extends Thread
{ 
public void run()
{System.out.println(“thread b is stated”);
for (int j=0;j<=5;j++)
{System.out.println(“from thread b:”+j);
}}
class C extends Thread
{ 
public void run()
{System.out.println(“thread b is stated”);
for (int k=0;k<=5;k++)
{System.out.println(“from thread c:”+k);
}}
class threadpriority
{
public static void main (String args[]) 
{A a1 = new A();
B b1 = new B();
C c1 = new C();
c1.setPriority(Thread.MAX_PRIORITY);
b1.setProirity(Thread.getPriority()+1);
a1.setPriority(Thread.MIN_PRIORITY);
System.out.println(“start thread A”);
a1.start();
System.out.println(“start thread B”);
B1.start();
System.out.println(“start thread C”);
c1.start();
System.out.println(“end of thread”);
}}
