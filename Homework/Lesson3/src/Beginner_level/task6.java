package Beginner_level;


public class task6 {
	public static void main(String[] args) {
		
		System.out.println("Варіант 1:");
		
		int count = 0;
		for (int i = 0; i < 25; i++) {
			count = count + 2;
			  System.out.println(count);
			}
		
		System.out.println("Варіант 2:");
		
		for (int i = 1; i <= 25; i++) {
			
			  System.out.println(i*2);
			}
		
		System.out.println("Варіант 3:");
		
		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

}
