package myApplication;


public class EmployeeOfCompany {

    private int id;
    private int workingHoursQuantity;
    private String firstName;
    private String lastName;
    private boolean hasDriversLicense;

    public EmployeeOfCompany() {
    }


    public int calculateSalary(int baseRate, float experienceRatio, int bonus) {
        int salary;
        salary = (int) ((baseRate * experienceRatio) + bonus);
        return (int) salary;
    }

    public int oneHourCost(int salary, int workingHoursQuantity) {
        float h;
        h = salary / workingHoursQuantity;
        return (int) h;
    }

    public int decrSalary(int decrement) {
        int salary = 1000;
        return salary -= decrement;
    }

    public boolean isValidEmployee(int id, String firstName, String lastName) {
        if ((id > 0) & (!firstName.isEmpty()) & (!lastName.isEmpty())) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isHasDriversLicense(boolean hasDriversLicense) {

        return hasDriversLicense;
    }

    public int getSalary(int salary) {
        return salary;
    }

    public String getFirstName(String firstName) {
        if (!firstName.isEmpty()) {
            return firstName;
        } else {
            System.out.println("First name field is empty");
        }
        return firstName;
    }

    public int getWorkingHoursQuantity(int workingHoursQuantity) {
        
        return workingHoursQuantity;
    }

    public double calculateSalaryUp(double experienceCoefficient) {
        double salary = 1000.0;
        return salary * experienceCoefficient;
    }
    
}