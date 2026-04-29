public interface PasswordPolicy {
	boolean isCompliant(String password);
	int score(String password);
}