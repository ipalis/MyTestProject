package Pre_intermediate_level;

public class Fibonacci {
		
		
	public Fibonacci(){
			
		}
	
	// function of fibonacci sequence
	public int fibonacci(int n) {
			
			int a = 0;
			int b = 1;
			
			for (int i = 0; i < n; i++) {
			    int temp = a;
			    a = b;
			    b = temp + b;
			}
			return a;
	}
	// function that calculates sum of 100 odd elements
	public long sum(){
			int i = 0;
			int oddNumber = 0;
			long result = 0;
			while (oddNumber <= 100) {
				i++;
				int x = fibonacci(i); 
				if (x % 2 ==0){
					result += x;
					oddNumber++;
				}
			}
			return result;
	}
	
	//function that prints result
	public void printResult(){
		System.out.println("Sum of first 100 odd elements of Fibonacci sequence: " + sum());
	}
}
