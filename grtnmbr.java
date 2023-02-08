import java.util.*;
class grtnmbr
{
 public static void main(String args[])
 {
  int num1,num2;
  Scanner scan=new Scanner(System.in);
  System.out.println("enter any two numbers");
  num1= scan.nextInt();
  num2= scan.nextInt();
   if(num1>num2)
    {
     System.out.println("number1 is greater than number2");
    }
   else if(num2>num1)
    {
     System.out.println("number2 is greater than number1");
    }
   else 
    {
     System.out.println("both are same");
    }
  }
}