public class Skiing extends Entertainments {
        
    
    public String nameOfSkiResort;
	public boolean isRental;
	public boolean isChairLifts;

   
    public Skiing(String nameOfSkiResort, boolean isRental, boolean isChairLifts) {
        super(String speciesOfEntertainments, double price, String placeOfEntertainments,
		Time timeOfEntertainments, int duration);
        this.nameOfSkiResort = nameOfSkiResort;
		this.isRental = isRental;
    }   
        
   
    public void getNameOfSkiResort() {
        return nameOfSkiResort;
    }   
    public void getIsRental() {
        return isRental;
    }
}