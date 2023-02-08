import java.util.Scanner;

public class reverse
{
 public static void main(String args[])
 {
  String str;
  char ch;
  Scanner scan=new Scanner(System.in);
  System.out.println("enter a string");
  str=sc.nextLine();
  System.out.println("reverse of a string'"+str+"'is:);
  for(int j=str.length();j>0;--j)
  {
   System.out.println(str.charAt(j-1));
  }
 }
}
   