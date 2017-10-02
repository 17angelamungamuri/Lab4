import java.util.*;

public class PalindromeRun {

	public String reverseString(String s) {
		if (s.length() == 0)
			return s;

		return reverseString(s.substring(1)) + s.charAt(0);
	}

	public boolean isaPalindrome(String expr, String inverse) {
		if (expr.equals(inverse)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		String input;
		String inverse;
		PalindromeRun expression = new PalindromeRun();
		Scanner scan = new Scanner(System.in);
		System.out.println("Type a word, sentence or phrase");
		input = scan.nextLine();
		inverse = expression.reverseString(input);
		if (expression.isaPalindrome(input, inverse)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}
}
