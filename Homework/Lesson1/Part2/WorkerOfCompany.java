
public class WorkerOfCompany {
	private int id;
	private String firstName;
	private String lastName;
	private int age;
	private double salary;
	private int workingHoursQuantity;
	private boolean hasDriversLicense;
	private String jobName;
	private int experience;
	private String maritalStatus;
	
				
	public WorkerOfCompany(int id, String firstName, String lastName, int age, double salary, String jobName) {
					this.id = id;
					this.firstName = firstName;
					this.lastName = lastName;
					this.age = age;
					this.salary = salary;
					this.jobName = jobName;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public int getWorkingHoursQuantity() {
        return workingHoursQuantity;
    }
    public void setWorkingHoursQuantity(int workingHoursQuantity) {
        this.workingHoursQuantity = workingHoursQuantity;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public boolean isHasDriversLicense() {
        return hasDriversLicense;
    }
    public void setHasDriversLicense(boolean hasDriversLicense) {
        this.hasDriversLicense = hasDriversLicense;
    }
      
    public boolean isValid() {
    	if ((this.id>0)&(!this.firstName.isEmpty())&(!this.lastName.isEmpty())) {
    	return true;
    	} else
    		return false;
    }
    
	public double oneHourCost() {
		double h = salary / workingHoursQuantity;
		return h;
	}
	public String toString(){//overriding the toString() method  
		 return "Cost of one hour of work = "+oneHourCost()+ " Id = "+ id+" First Name = "+firstName+" Last Name = "+lastName; 
		  }
	
	public void decrSalary(double decrement) {
        salary -= decrement;
    }
        
    public void incrSalary(double increment) {
        salary += increment;
    }
		
}