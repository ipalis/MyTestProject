package Pre_intermediate_level;


public class task12{
	
    public static void main(String[] args){
    System.out.println("Number: " + 12345 + " " + "Amount: " + 15);
    System.out.println("Check superpower: " + checkSuperPower(12345, 15));
    System.out.println("Number: " + 12345 + " " + "Amount: " + 17);
    System.out.println("Check superpower: " + checkSuperPower(12345, 17));
    }
    
    public static boolean checkSuperPower(int number, int amount) {
		int sum = 0;
    	while (number > 0) {
    		sum += number % 10;
    		number = number / 10;
		}
    	return amount == sum;
	}
}