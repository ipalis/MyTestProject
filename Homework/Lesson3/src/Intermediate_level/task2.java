package Intermediate_level;

public class task2 {

	public static void main(String[] args) {
		int count = 0; 
		for (int i = 1; i <= 999; i++){
			for (int j = 0; j <= 999; j++) {
			if (checkSum(i) == checkSum(j)){
				count++;
			} 					
			}
		}
		System.out.println("Quantity of lucky tickets: " + count);
	}
	
	public static int checkSum(int number) {
		int sum = 0;
    	while (number > 0) {
    		sum += number % 10;
    		number = number / 10;
		}
    	return sum;
	}
}