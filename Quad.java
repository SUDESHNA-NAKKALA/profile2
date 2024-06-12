import java.util.Scanner;
class QuadraticRoots
{
 public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter a:");
  Double a= sc.nextDouble();
  System.out.print("Enter b:");
  Double b= sc.nextDouble();
  System.out.print("Enter c:");
  Double c= sc.nextDouble();
  Double d= b*c - (4.0*a*c);
  if (d>0.0)
  {
   double r1 = (-b-Math.pow(d,0.5))/(2.0*a);
   double r2 = (-b+Math.pow(d,0.5))/(2.0*a);
   System.out.print("The roots are" +r1 +"and"+r2);
   }
  else if(d==0)
  {
   double r1 =(-b/(2.0*a));
   System.out.print("The root is"+r1);
   }
  else
  {
   System.out.print("Roots are not real");
   }
   }
   }
   
  
