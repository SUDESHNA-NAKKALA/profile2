import java.util.Scanner;
import java.io.*;
class OddNum{
public static void main(String args[])
{
 int i,n;
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the value of n: ");
 n=sc.nextInt();
 for(i=1;i<n;i++)
 {
   if(i%2!=0)
   {
     System.out.print(i+" ");
     }
  }
}
}
