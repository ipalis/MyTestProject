package Beginner_level;

public class myArray {
	
	private int[] myFirstArray = {5, 48, 95, 4, 1};
	
	// multiplieng each elements by 3
	public void multiplyElements() {
		
		for (int x : myFirstArray) {

			System.out.println(x * 3);
		}
	}

}
