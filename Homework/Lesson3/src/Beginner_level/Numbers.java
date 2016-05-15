package Beginner_level;

public class Numbers {

	
	//function that prints even numbers ranging from 0 to 50, variant 1
	public void printNumb1() {
			
	System.out.println("Варіант 1:");
	
	int count = 0;
	for (int i = 0; i < 25; i++) {
		count = count + 2;
		  System.out.println(count);
		}
	}
	
	//function that prints even numbers ranging from 0 to 50, variant 2
	public void printNumb2() {
		
	System.out.println("Варіант 2:");
	
	for (int i = 1; i <= 25; i++) {
		  System.out.println(i*2);
		}
	}
	
	//function that prints even numbers ranging from 0 to 50, variant 3
	public void printNumb3() {
		
	System.out.println("Варіант 3:");
	
	for (int i = 1; i <= 50; i++) {
		if (i % 2 == 0) {
			System.out.println(i);
		}
	}
	}
}
