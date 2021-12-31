import java.util.*;

public class Addition {
    public static void main(String args[]) {
        System.out.println("Enter two numbers");

        Scanner s = new Scanner(System.in);
        int a, b, c, d;
        a = s.nextInt();
        b = s.nextInt();
        c = a + b;
        d = a % b;
        System.out.println("Sum of two number is" + c);
        System.out.println("%of two number is" + d);
    }
}
