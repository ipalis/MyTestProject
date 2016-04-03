public class Engineer extends WorkerOfCompany {
        
    
    public String specialization;
	public String category;
	public String typeOfEmployment;

   
    public Engineer(String specialization, public String category,
					public String typeOfEmployment) {
        super(int id, String firstName, String lastName, int age,
			   double salary, String jobName);
        this.specialization = specialization;
		this.category = category;
    }   
        
   
    public void getSpecialization() {
        return specialization;
    }   
    public void geCategory() {
        return category;
    }
}