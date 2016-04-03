public class Hotel extends AppartmentsForRent {
        
    
    public int stars;
	public boolean isTv;
	public boolean isDinner; 

   
    public Loft(int stars, boolean isTv) {
        super(double price, int quantityOfRooms);
        this.stars = stars;
		this.isTv = isTv;
    }   
        
   
    public void getQuantityOfStars() {
        return stars;
    }   
    public void getIsTv() {
        return isTv;
    }
}