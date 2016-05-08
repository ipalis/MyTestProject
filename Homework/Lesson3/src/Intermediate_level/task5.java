package Intermediate_level;

public class task5 {

	public static void main(String[] args) {
		Temperature temp1 = new Temperature(0.0, true);
		Temperature temp2 = new Temperature(0.0, false);
        System.out.println("Temperature: " + temp1.getCelsius() + " Celsius");
        System.out.println("Temperature: " + temp1.getKelvin() + " Kelvin");
        System.out.println("Temperature: " + temp2.getCelsius() + " Celsius");
        System.out.println("Temperature: " + temp2.getKelvin() + " Kelvin");
	}

}