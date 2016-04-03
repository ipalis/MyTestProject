public class Kondomynyum extends AppartmentsForRent {
        
    
    public boolean isTerrace;
	public boolean isUtilityRoom;
	public String address;

   
    public Loft(boolean isTerrace, boolean isUtilityRoom) {
        super(double price, int quantityOfRooms, int livingSquare);
        this.isTerrace = isTerrace;
		this.isUtilityRoom = isUtilityRoom;
    }   
        
   
    public void openUtilityRoom() {
        isUtilityRoom = true;
    }   
    public void goOutToTerrace() {
        isTerrace = true;
    }
}