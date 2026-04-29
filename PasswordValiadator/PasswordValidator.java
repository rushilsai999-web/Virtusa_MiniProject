import java.util.Scanner;

public class PasswordValidator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PasswordChecker checker = new PasswordChecker();
		int tries = 0;
		final int MAX = 5;

		while (tries < MAX) {
			System.out.print("Enter password: ");
			String pwd = scanner.nextLine();
			System.out.println("You entered: " + PasswordUtils.obfuscatePassword(pwd));

			if (checker.isCompliant(pwd)) {
				int s = checker.score(pwd);
				System.out.println("Password accepted.");
				System.out.println("Strength: " + PasswordUtils.strengthCategory(s));
				break;
			}

			tries++;
			System.out.println("Remaining attempts: " + (MAX - tries));
		}

		if (tries == MAX) System.out.println("No attempts left. Exiting.");
		scanner.close();
	}
}