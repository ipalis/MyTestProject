package Advanced_level;

public class Metrics {
	
	private double result1, result2;
	//private int p, f, i, h, bc;
	
	
	public Metrics() {
		
	}
	
	public double passedToFailed(int p, int f) {
		result1 = (f * 100 ) / p;
		
		return result1;
	}
	
	public double completeToBlocked(int i, int bc) {
		result2 = (bc *100) / i;
		
		return result2;
	}
	
}