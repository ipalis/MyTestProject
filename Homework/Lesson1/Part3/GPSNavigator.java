public class GPSNavigator extends TouchScreenDevices {
        
    
    public String producer;
	public String model;
	public boolean isMapInComplete;
   
    public GPSNavigator(String producer, String model, boolean isMapInComplete) {
        super(String type, double price, double screenSize,
			  int internalMemory, boolean isCamera, Boolean isSim,
			  boolean isWiFi);
        this.producer = producer;
		this.model = model;
		this.isMapInComplete = isMapInComplete;
    }   
        
   
    public void getProducer() {
        return producer;
    }   
    public void getIsMapInComplete() {
        return isMapInComplete;
    }
}