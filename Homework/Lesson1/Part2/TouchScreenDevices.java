public class TouchScreenDevices {
			private String type;
			private double price;
			private double screenSize;
			private int internalMemory;
			private boolean isCamera;
			private boolean isFrontCamera;
			private boolean isFlash;
			private boolean isSim;
			private boolean is3mmJackOut;
			private boolean isWiFi;
			
			
public TouchScreenDevices(String type, double price, double screenSize, int internalMemory, boolean isCamera,
						  Boolean isSim, Boolean isWiFi) {
				this.type = type;
				this.price = price;
				this.screenSize = screenSize;
				this.internalMemory = internalMemory;
				this.isCamera = isCamera;
				this.isSim =isSim;
				this.isWiFi = isWiFi;		
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

public int getInternalMemory() {
	return internalMemory;
}
public void setInternalMemory(int internalMemory){
	this.internalMemory = internalMemory;
}

private void turnOnWiFi(){
	isWiFi = true;
}

private void turnFlash(){
	isFlash = true;
}
private void takePhoto(){
	isCamera = true;
}
private void insertSim(){
	isSim = true;
}
}