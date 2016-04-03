public class Toy extends Entertainments {
        
    
    public String nameOfToy;
	public boolean isInteractive;
	public boolean isSoftToy;

   
    public Toys(String nameOfToy, public boolean isInteractive) {
        super(String speciesOfEntertainments, double price, String placeOfEntertainments,
		Time timeOfEntertainments, int duration);
        this.nameOfToy = nameOfToy;
		this.isInteractive = isInteractive;
    }   
        
   
    public void getNameOfToy() {
        return nameOfToy;
    }   
    public void getIsInteractive() {
        return isInteractive;
    }
}