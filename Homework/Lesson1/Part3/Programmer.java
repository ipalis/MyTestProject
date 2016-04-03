public class Programmer extends WorkerOfCompany {
        
    
    public String nameOfConpany;
	public String programmingLanguage;
	public String level;

   
    public Programmer(tring nameOfConpany, String programmingLanguage, String level) {
        super(int id, String firstName, String lastName, int age,
			   double salary, String jobName);
        this.nameOfConpany = nameOfConpany;
		this.programmingLanguage = programmingLanguage;
		this.level = level;
    }   
        
   
    public void getProgrammingLanguage() {
        return programmingLanguage;
    }   
    public void getLevel() {
        return level;
    }
}