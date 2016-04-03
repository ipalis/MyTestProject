public class Piano extends MusicInstrument {
        
    
    public boolean isElectronic;
	public String hullMaterial; 
	public String producer;

   
    public Piano(boolean isElectronic, String hullMaterial) {
        super(String type, double price, String model, boolean isCase);
        this.isElectronic = isElectronic;
		this.hullMaterial = hullMaterial;
    }   
        
   
    public void setHullMaterial(String hullMaterial) {
        this.hullMaterial = hullMaterial;
    }   
    ublic void getIsElectronic() {
        return isElectronic;
    }
}