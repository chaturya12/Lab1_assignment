
import java.util.Scanner;
public class powerOfTwo {
public static boolean checkNumber(int n)
{
   while(n!=1)
    {
      if(n%2!=0)
       {
         return false;
       }
       n=n/2;
    }
    return true;
}
   public static void main(String args[]) {
   int number;
   Scanner sc=new Scanner(System.in);
    number=sc.nextInt();
   
   System.out.println( checkNumber(number));
  }
}