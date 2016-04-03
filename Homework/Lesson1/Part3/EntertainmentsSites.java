public class EntertainmentSites extends Entertainments {
        
    
    public String webAddress;
	public String typeOfContent;
	public boolean isPaidContent;

   
    public EntertainmentSites(String webAddress, String typeOfContent) {
        super(String speciesOfEntertainments, double price, String placeOfEntertainments,
		Time timeOfEntertainments, int duration);
        this.webAddress = webAddress;
		this.typeOfContent = typeOfContent;
    }   
        
   
    public void getTypeOfContent() {
        return typeOfContent;
    }   
    public void getWebAddress() {
        return webAddress;
    }
}