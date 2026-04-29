public class PasswordUtils {
	public static String obfuscatePassword(String password) {
		if (password == null) return "";
		StringBuilder sb = new StringBuilder(password.length());
		for (int i = 0; i < password.length(); i++) sb.append('*');
		return sb.toString();
	}

	public static String strengthCategory(int score) {
		if (score <= 2) return "Weak";
		if (score <= 4) return "Moderate";
		return "Strong";
	}
}