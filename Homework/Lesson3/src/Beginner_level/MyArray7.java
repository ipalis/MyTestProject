package Beginner_level;

public class MyArray7 {

	private int[] numbers = {-3, 66, 0, -45, 128, 101, 32};
	private int max = numbers[0];
	
	//function which finds and prints the max element of the array
	public void findMaxElement(){
		
		for(int i = 0; i < numbers.length; i++){
		    if(max<numbers[i])
		       max = numbers[i];
		}
		System.out.println(max);
	}
}
