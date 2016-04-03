public class Loft extends AppartmentsForRent {
        
    
    public boolean isKithchen;
	public double ceilingHeight; 
	public boolean isShower;

   
    public Loft(boolean isKitchen, double ceilingHeight) {
        super(double price, int quantityOfRooms, int livingSquare);
        this.isKitchen = isKitchen;
		this.ceilingHeight = ceilingHeight;
    }   
        
   
    public void rentLoftWithKitchen() {
        isKitchen = true;
    }   
    public void getCeilingHeight() {
        return ceilingHeight;
    }
}