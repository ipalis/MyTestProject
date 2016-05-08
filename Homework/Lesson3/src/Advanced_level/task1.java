package Advanced_level;

public class task1 {

	public static void main(String[] args) {
		String result = makePassword(15);
		System.out.println("Generated password is: " + result);
	}
	public static String makePassword(int length) {
		String password = "";
		
		for (int i = 0; i < length - 1; i++) {
			password = password + randomCharacter("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ");		
		}
		
		String randomDigit = randomCharacter("0123456789");
		password = insertAtRandom(password, randomDigit);
		return password;
	}
	
	public static String randomCharacter(String characters) {
		int n = characters.length();
		int r = (int)(n * Math.random());
		return characters.substring(r, r + 1);
	}
	public static String insertAtRandom(String str, String toInsert) {
		int n = str.length();
		int r = (int)((n + 1) * Math.random());
		return str.substring(0, r) + toInsert + str.substring(r);
		
	}
}
