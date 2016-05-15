package Intermediate_level;

public class LuckyTickets {
	
	int count, sum, number;
	
	public LuckyTickets(){
		
	}
	
	//function that compares sum of first and last three digits of ticket and calculates amount of lucky tickets
	public void countOfTickets(){
		
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

	//function that calculate sum of  three digits
	public int checkSum(int number) {
		int sum = 0;
		while (number > 0) {
			sum += number % 10;
			number = number / 10;
		}
		return sum;
	
	}
}