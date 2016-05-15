package Pre_intermediate_level;

public class GoCinema {
	
	public boolean a, b;
	
	//function which determines sentiment couples
	private static boolean isVisitCinema(boolean a, boolean b){
		return !(a ^ b);
	}
	
	// function that shows whether the pair going or not to the movies
	public void visitCinema(){
		
		System.out.println("a = true and b = true -> " + isVisitCinema(true, true));
		System.out.println("a = true and b = false -> " + isVisitCinema(true, false));
		System.out.println("a = false and b = true -> " + isVisitCinema(false, true));
		System.out.println("a = false and b = false -> " + isVisitCinema(false, false));

	}

}
