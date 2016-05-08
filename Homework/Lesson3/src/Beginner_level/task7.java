package Beginner_level;

public class task7 {

	public static void main(String[] args) {
		int[] numbers = {-3, 66, 0, -45, 128, 101, 32};
		int max = numbers[0];
		for(int i = 0; i < numbers.length; i++){
		    if(max<numbers[i])
		       max = numbers[i];
		}

		System.out.println(max);

	}

}
