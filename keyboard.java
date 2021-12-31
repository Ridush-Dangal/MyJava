import java.util.*;

class keyboard {
    public static void main(String arg[]) {

        Scanner s = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter the two numbers");
        a = s.nextInt();
        b = s.nextInt();
        c = a + b;
        System.out.println("the sum of two number is" + c);
    }
}
