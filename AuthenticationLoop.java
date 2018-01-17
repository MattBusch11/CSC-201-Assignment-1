import java.util.Scanner;
public class AuthenticationLoop {
	public static void main (String [] args) {
		String username = "mbb23738";
		String password = "mbb23738";
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your username");
		String usernameIn = keyboard.nextLine();
		System.out.println("Enter your password");
		String passwordIn = keyboard.nextLine();
		if (usernameIn.equals(username) && passwordIn.equals(password)) {
			System.out.println("Welcome mbb23738");
		}else {
			System.out.println("invalid username or password");
		}
	}
}

