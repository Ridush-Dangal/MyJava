import java.util.*;

class Area {
    public static void main(String args[]) {
        System.out.println("Enter the base and height");
        float b, h, A;
        Scanner s = new Scanner(System.in);
        b = s.nextFloat();
        h = s.nextFloat();
        A = b * h / 2;
        System.out.println("Area of triangle is" + A);
    }
}