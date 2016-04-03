public class Beverages extends CustomerGoods {
        
    
    public double volume;
	public boolean isNonAlcoholic; 
	public String producer;

   
    public CustomerGoods(double volume, boolean isNonAlcoholic) {
        super(String name, Boolean isFood, Double price, Boolean delivery);
        this.volume = volume;
		this.isNonAlcoholic = isNonAlcoholic;
    }   
        
   
    public void getVolume() {
        return volume;
    }   
    public void getIsNonAlcoholic() {
        return isNonAlcoholic;
    }
}