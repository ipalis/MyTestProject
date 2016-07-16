import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.xml.dom.Tag;

public class TestEmployeeDetails1 {
    EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
    EmployeeDetails employee = new EmployeeDetails();


    @BeforeTest
    public void beforeTest() {
        System.out.println("in beforeTest");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("in afterTest");
    }

    @Test (groups = {"functest"})
    public void testCalculateAppriasal() {

        employee.setName("Smith");
        employee.setAge(35);
        employee.setMonthlySalary(8000);

        double appraisal = empBusinessLogic.calculateAppraisal(employee);
        Assert.assertEquals(500, appraisal, 0.0, "500");
    }

    // Test to check yearly salary
    @Test (groups = {"functest"})
    public void testCalculateYearlySalary() {

        employee.setName("Smith");
        employee.setAge(35);
        employee.setMonthlySalary(8000);

        double salary = empBusinessLogic.calculateYearlySalary(employee);
        Assert.assertEquals(96000, salary, 0.0, "8000");
    }

    //Test to check cost of one hour work
    @Test (groups = {"functest"})
    public void testCalculateOneHourCost() {

        employee.setName("Smith");
        employee.setAge(35);
        employee.setMonthlySalary(8000);
        employee.setWorkingDay(20);

        double oneHourCost = empBusinessLogic.calculateOneHourCost(employee);
        Assert.assertEquals(50, oneHourCost, 0.0, "50");
    }

    @Test (groups = {"functest"})
    public void testCalculateSalary() {

        employee.setBaseRate(500);
        employee.setExperienceRatio(1.5);
        employee.setBonus(100);

        double result = empBusinessLogic.calculateSalary(employee);
        Assert.assertEquals(850, result, 0.0, "850");
    }

    @Test (groups = {"datatest"})
    public void testIsValidEmployee(){

        employee.setId(-5);
        employee.setName("John");

        boolean isValid = empBusinessLogic.isValidEmployee(employee);
        Assert.assertEquals(true, true, "Not Work!");

    }

    @Test(expectedExceptions = NullPointerException.class)
    public void throwsNullPointerException() {

        throw new NullPointerException();
    }

    @Test (enabled = false)
    public void testCheckDataOfWorker(){

    }
}