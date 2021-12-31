import java.lang.*;
import java.util.*;
class Area2
{
public static void main(String arg[])
{
System.out.println("Enter the three number");
int a,b,c;
double A,s;
Scanner sc= new Scanner(System.in);

a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
s=(a+b+c)/2f;
A=Math.sqrt(s*(s-a)*(s-b)*(s-c));

System.out.println("The area is"+A);
}
}