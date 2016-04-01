
public class MusicInstruments {
			private String type;
			private double price;
			private String model;
			private boolean isCarryingCase;
			private boolean isString;
			private boolean isElectric;
			private boolean isCustom;
			private String material;
			private String color;
			private double weight;
				
	
public MusicInstruments (String type, double price, String model, boolean isCase){
		this.type = type;
		this.price = price;
		this.model = model;
		this.isCarryingCase = isCarryingCase;
		}

public String getType() {
		return type;
}
public void setType(String type){
		this.type = type;
}
public double getPrice() {
				return price;
}
public void setPrice(double Price){
		this.price = price;
}
public void  putInCarryingCase(){
		isCarryingCase = true;
}
public void ReplaceStrings() {
	isString = true;	
}
private void ConnectedToAmplifier() {
	isElectric = true;
}
public String getMaterial() {
	return material;
}
public void setMaterial(double Price){
		this.material = material;
}
public void changeColor() {
		this.color = color;
}
}

public class MusicInstruments {
		
} 