public class Manager extends WorkerOfCompany {
        
    
    public double isOwner;
	public String direction;
	public int quantityOfSubordinates;

   
    public Manager(double isOwner, String direction, int quantityOfSubordinates) {
        super(int id, String firstName, String lastName, int age,
			   double salary, String jobName);
        this.isOwner = =isOwner;
		this.direction = direction;
		this.quantityOfSubordinates = quantityOfSubordinates;
    }   
        
   
    public void getIsOwner() {
        return isOwner;
    }   
    public void getDirection() {
        return direction;
    }
}