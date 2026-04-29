public class PasswordChecker implements PasswordPolicy {
	public boolean isCompliant(String password) {
		if (password == null) return false;
		int length = password.length();
		if (length < 8) {
			System.out.println("Password too short (minimum 8 characters)");
			return false;
		}
		boolean hasUpper = false;
		boolean hasLower = false;
		boolean hasDigit = false;
		boolean hasSymbol = false;
		for (int i = 0; i < length; i++) {
			char c = password.charAt(i);
			if (Character.isUpperCase(c)) hasUpper = true;
			else if (Character.isLowerCase(c)) hasLower = true;
			else if (Character.isDigit(c)) hasDigit = true;
			else hasSymbol = true;
		}
		if (!hasUpper) 
			System.out.println("Please include at least one uppercase letter");
		if (!hasLower) 
			System.out.println("Please include at least one lowercase letter");
		if (!hasDigit) 
			System.out.println("Please include at least one digit");
		if (!hasSymbol) 
			System.out.println("Please include at least one special character");

		return hasUpper && hasLower && hasDigit && hasSymbol;
	}
	public int score(String password) {
		if (password == null) 
			return 0;
		int points = 0;
		int length = password.length();
		if (length >= 8) 
			points += 1;
		if (length >= 12) 
			points += 1;
		boolean hasUpper = false, hasLower = false, hasDigit = false, hasSymbol = false;
		for (char ch : password.toCharArray()) {
			if (Character.isUpperCase(ch)) 
				hasUpper = true;
			else if (Character.isLowerCase(ch)) 
				hasLower = true;
			else if (Character.isDigit(ch)) 
				hasDigit = true;
			else 
				hasSymbol = true;
		}
		if (hasUpper) points += 1;
		if (hasLower) points += 1;
		if (hasDigit) points += 1;
		if (hasSymbol) points += 1;
		return points;
	}
}
