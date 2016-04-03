public class Tester extends WorkerOfCompany {
        
    
    public String nameOfConpany;
	public boolean knowsAutomation;
	public String level;

   
    public Tester (tString nameOfConpany, boolean knowsAutomation, String level) {
        super(int id, String firstName, String lastName, int age,
			   double salary, String jobName);
        this.nameOfConpany = nameOfConpany;
		this.knowsAutomation = knowsAutomation;
		this.level = level;
    }   
        
   
    public void getKnowsAutomation() {
        return knowsAutomation;
    }   
    public void getNameOfConpany() {
        return nameOfConpany;
    }
}