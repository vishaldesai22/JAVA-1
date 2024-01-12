public class for_eachArray
{
  public static void main(String args[])
{ 
  int[] element={1,9,27,28,48}; 
  System.out.println("iterating over an array using for loop in Java:");

  for(int i=0;i<element.length;i++)
{
  System.out.println(element[i]);
}

 System.out.println("iterating over an array using forEach()loop in java:");
 
 for(int var : element)
{ 
 System.out.println(var);
}
}
}
