public class HouseholdGoods extends CustomerGoods {
        
    
    public boolean isForHome ;
	public boolean isForBuilding; 
	public String producer;

   
    public HouseholdGoods(boolean isForHome, boolean isForBuilding) {
        super(String name, Boolean isFood, Double price, Boolean delivery);
        this.isForHome = isForHome;
		this.isForBuilding = isForBuilding;
    }   
        
   
    public void getIsForHome() {
        return isForHome;
    }   
    public void getIsForBuilding() {
        return isForBuilding;
    }
}