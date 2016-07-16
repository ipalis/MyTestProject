import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EmpBusinessLogic {


    // Calculate the yearly salary of employee
    public double calculateYearlySalary(EmployeeDetails employeeDetails){

        double yearlySalary = 0;
        yearlySalary = employeeDetails.getMonthlySalary() * 12;
        return yearlySalary;
    }

    // Calculate the appraisal amount of employee
    public double calculateAppraisal(EmployeeDetails employeeDetails){

        double appraisal = 0;

        if(employeeDetails.getMonthlySalary() < 10000){
            appraisal = 500;

        }else{
            appraisal = 1000;
        }

        return appraisal;
    }

    //Calculate how cost one hour of work
    public double calculateOneHourCost(EmployeeDetails employeeDetails){

        double oneHourCost = 0;
        oneHourCost = ((employeeDetails.getMonthlySalary() / employeeDetails.getWorkingDay()) / 8 );
        return oneHourCost;
    }

    // Calculate salary
    public double calculateSalary(EmployeeDetails employeeDetails) {

        double salary = 0;
        salary = (employeeDetails.getBaseRate() * employeeDetails.getExperienceRatio() + employeeDetails.getBonus());
        return salary;
    }

    //Shows whether all data on worker
    public boolean isValidEmployee(EmployeeDetails employeeDetails) {

        if (!((employeeDetails.getId() > 0) & employeeDetails.getName().isEmpty())) {
            return false;
        } else {
            return true;
        }
    }

    // Check expire date of Id
    public boolean checkExprireDateId(EmployeeDetails employeeDetails) {

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date data = new Date();
        System.out.println("Current time: " + data + " Actual result: " + data.before(employeeDetails.getDateExpire()));
        return data.before(employeeDetails.getDateExpire());
    }

    //
    public void checkDataOfWorker(EmployeeDetails employeeDetails){

    }

    //Vacation calculated based on hours worked 2 days a month
    public int calculateVacation(EmployeeDetails employeeDetails){

        int vacationDay = 0;
        vacationDay = employeeDetails.getWorkingMonth() * 2;
        return vacationDay;
    }

    //
    public double calculateSalaryOnVacation(EmployeeDetails employeeDetails) {

        double salaryOnVacation = 0;
        salaryOnVacation = (employeeDetails.getWorkingMonth() * 2) * (employeeDetails.getMonthlySalary()/employeeDetails.getWorkingDay());
        return salaryOnVacation;
    }

    //calculate the amount of yearly tax(14%)
    public  double calculateTaxAmount(EmployeeDetails employeeDetails){

        double tax = 0;
        tax = ((employeeDetails.getMonthlySalary() * 12) / 100) * 14;
        return tax;
    }

    //Calculate daily salary
    public  double calculateDailySalary(EmployeeDetails employeeDetails) {

        double dailySalary = 0;
        dailySalary = employeeDetails.getMonthlySalary()/employeeDetails.getWorkingDay();
        return  dailySalary;
    }

}