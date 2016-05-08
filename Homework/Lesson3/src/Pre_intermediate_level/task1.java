package Pre_intermediate_level;

public class task1 {
	private static boolean visitCinema(boolean a, boolean b){
		return !(a ^ b);
	}
	public static void main(String[] args) {
		System.out.println("a=true b=true->" + visitCinema(true, true));
		System.out.println("a=true b=false->" + visitCinema(true, false));
		System.out.println("a=false b=true->" + visitCinema(false, true));
		System.out.println("a=false b=false->" + visitCinema(false, false));


	}

}
