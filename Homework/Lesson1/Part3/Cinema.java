public class Cinema extends Entertainments {
        
    
    public String genre;
	public boolean isFullMeter;
	public boolean is3D;

   
    public Cinema(String genre, boolean isFullMeter, boolean is3D) {
        super(String speciesOfEntertainments, double price, String placeOfEntertainments,
		Time timeOfEntertainments, int duration);
        this.genre = genre;
		this.isFullMeter = isFullMeter;
		this.is3D = is3D;
    }   
        
   
    public void getGenre() {
        return genre;
    }   
    public void getIs3D() {
        return is3D;
    }
}