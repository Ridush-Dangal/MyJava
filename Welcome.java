import java.util.*;

class Welcome {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String a;
		System.out.println("What is your name?");

		a = s.nextLine();
		System.out.println("Welcome Mr/Mrs" + a);
	}
}