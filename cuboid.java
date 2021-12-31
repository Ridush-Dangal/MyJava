import java.lang.*;
import java.util.*;
class Cuboid
{
public static void main(String args[])
{
System.out.println("Enter the length,breadth,height");
float l,b,h;
double V;
Scanner s= new Scanner(System.in);
l=s.nextFloat();
b=s.nextFloat();
h=s.nextFloat();
V=l*b*h;
System.out.println("The volume of cuboid is"+V);
}
}
