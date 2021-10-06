import java.util.Scanner;

public class DwityaStack {
	public static void main(String[] args) {
	
		DwityaStackGeneric<String> stack = new DwityaStackGeneric<>(25)
		String input = "f(x)=(2x+y)-(3+(2x-x)+20)";
		Scanner input = new Scanner(System.input);
		
		input.useDelimiter("");
		
		for (int i = 0; i < 25; i++) {
			String karakter = input.next();
			if (karakter.equals("(")) {
				stack.push("(");	
			} else if (karakter.equals(")")) {
				stack.pop();
			}
		}
		
		if (stack.isEmpty()) {
			System.out.println("valid");
		} else {
			System.out.println("tidak valid");
		}
	}
}