package Pre_intermediate_level;

public class Superpower {
    
	public int sum, number;
    
	// a function that counts the amount of numbers
    public boolean isSuperPower(int number, int amount) {
		sum = 0;
    	while (number > 0) {
    		sum += number % 10;
    		number = number / 10;
		}
    	return amount == sum;
    }
    
    // function that checks superpower
    public void checkSuperPower(){
    	
    	System.out.println("Number: " + 12345 + " " + "Amount: " + 15);
        System.out.println("Check superpower: " + isSuperPower(12345, 15));
        System.out.println("Number: " + 12345 + " " + "Amount: " + 17);
        System.out.println("Check superpower: " + isSuperPower(12345, 17));
    }
}