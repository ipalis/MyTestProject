package Intermediate_level;

public class Temperature {
	private double C;
	private double K;
	
	public Temperature(double degress, boolean isCelsius) {
			if (isCelsius) {
				this.C = degress;
				this.K = celsiusToKelvin(degress);
			}
			else {
				this.K = degress;
				this.C = kelvinToCelsius(degress);
			}
	}
	
	public static double celsiusToKelvin(double degress){
		return degress - 273.15;
	}
	
	public static double kelvinToCelsius(double degress){
		return degress + 273.15;
	}
	
	public double getCelsius() {
		return C;
	}
	
	public double getKelvin() {
		return K;
	}

}
