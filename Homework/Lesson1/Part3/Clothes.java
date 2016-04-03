public class Clothes extends CustomerGoods {
        
    
    public boolean isSportswear ;
	public boolean isTravelClothing; 
	public color;

   
    public Clothes(boolean isSportswear, boolean isTravelClothing) {
        super(String name, Boolean isFood, Double price, Boolean delivery);
        this.isSportswear = isSportswear;
		this.isTravelClothing = isTravelClothing;
    }   
        
   
    public void getIsSportswear() {
        return isSportswear; 
    }   
    public void getIsTracelClothing() {
        return isTravelClothing;
    }
}