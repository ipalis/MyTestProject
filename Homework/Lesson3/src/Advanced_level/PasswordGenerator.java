package Advanced_level;

public class PasswordGenerator {
	
		private String result, password;
		private int n, r;
	
	
	public PasswordGenerator(){
		
		this.result = makePassword();
		System.out.println("Generated password is: " + result);
	}
	
	//function that makes pasword
	public String makePassword() {
		
		this.password = "";
		for (int i = 0; i < 15 - 1; i++) {
			password = password + randomCharacter("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ");		
		}
		
		String randomDigit = randomCharacter("0123456789");
		password = insertAtRandom(password, randomDigit);
		return password;
	}
	
	// function that selects random characters
	public String randomCharacter(String characters) {
		
		this.n = characters.length();
		this.r = (int)(n * Math.random());
		return characters.substring(r, r + 1);
	}
	
	// function that puts the characters randomly
	public String insertAtRandom(String str, String toInsert) {
		
		this.n = str.length();
		this.r = (int)((n + 1) * Math.random());
		return str.substring(0, r) + toInsert + str.substring(r);

	}
}