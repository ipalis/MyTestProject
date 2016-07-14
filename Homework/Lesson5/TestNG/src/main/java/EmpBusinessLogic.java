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

}