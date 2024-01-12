import java.util.*;
class VectorDemo
{
public static void main(String[] args)
{
Vector v1= new Vector(7);
v1.addElement(10);
v1. addElement(30);
v1. addElement(50);
v1. addElement(20);
v1. addElement(40);
v1. addElement(10);
v1. addElement(20);
System.out.println("The elements in the vector are:"+v1);
System.out.println("The orignal size of vector : "+v1.size());
System.out.println("Removing the Third Element ");
v1.remove(2); //3rd element
System.out.println("Removing the Fouth Element ");
v1.remove(3); //4th element
System.out.println("Now The elements in the vector are:"+v1);
System.out.println("Inserting element 100 at 3rd position:");
v1.insertElementAt(100, 2); //inserting 100 at 3rd position
System.out.println("Now The elements in the vector are:"+v1);
System.out.println("The current size of vector : "+v1.size());
}
}