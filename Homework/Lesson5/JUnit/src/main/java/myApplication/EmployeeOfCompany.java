package myApplication;


public class EmployeeOfCompany {

    private int id;
    private int workingHoursQuantity;
    private String firstName;
    private String lastName;
    private boolean hasDriversLicense;


    public EmployeeOfCompany() {
    }

    //calculates and return salary with base rate, bonus and experience
    public int calculateSalary(int baseRate, float experienceRatio, int bonus) {
        int salary=0;
        salary = (int) ((baseRate * experienceRatio) + bonus);
        return (int) salary;
    }

    //calculates cost of one hour of work
    public int oneHourCost(int salary, int workingHoursQuantity) {
        float h;
        h = salary / workingHoursQuantity;
        return (int) h;
    }
    // calculates the reduction of salaries at a given value
    public int decrSalary(int decrement) {
        int salary = 1000;
        return salary -= decrement;
    }

    //shows whether all data on worker
    public boolean isValidEmployee(int id, String firstName, String lastName) {
        if ((id > 0) & (!firstName.isEmpty()) & (!lastName.isEmpty())) {
            return true;
        } else {
            return false;
        }
    }

    //shows driver license
    public boolean isHasDriversLicense(boolean hasDriversLicense) {

        return hasDriversLicense;
    }

    // return salary
    public int getSalary(int salary) {

        return salary;
    }

    //return name of employee
    public String getName(String firstName, String lastName) {
        if (!firstName.isEmpty() || (!lastName.isEmpty())) {
        } else {
            System.out.println("Name field is empty");
        }
        return firstName + lastName;
    }
    //returns quantity of working hours
    public int getWorkingHoursQuantity(int workingHoursQuantity) {
        
        return workingHoursQuantity;
    }
    //calculates salary with experience coefficient
    public double calculateSalaryUp(double experienceCoefficient) {
        double salary = 1000;
        return salary * experienceCoefficient;
    }
    //calculates early salary
    public int calculateYearlySalary(int salary){
        int yearlySalary;
        yearlySalary = salary * 12;
        return yearlySalary;
    }
}