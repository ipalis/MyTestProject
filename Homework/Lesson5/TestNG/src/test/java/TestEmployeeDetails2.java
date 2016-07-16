import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.xml.dom.Tag;

public class TestEmployeeDetails2 {
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
    public void testCalculateVacation(){

        employee.setWorkingMonth(6);

        int vacationsDay = empBusinessLogic.calculateVacation(employee);
        Assert.assertEquals(12, 12);
    }

    @Test (groups = {"functest"}, dependsOnMethods = "testCalculateVacation")
    public void testCalculateSalaryOnVacation (){

        employee.setWorkingMonth(6);
        employee.setWorkingDay(20);
        employee.setMonthlySalary(1000);

        double vacationSalary = empBusinessLogic.calculateSalaryOnVacation(employee);
        Assert.assertEquals(vacationSalary, 600, 0.0);
    }

    @Test(groups = {"functest"})
    public  void testCalculateTaxAmount() {

        employee.setMonthlySalary(1000);

        double testTax = empBusinessLogic.calculateTaxAmount(employee);
        Assert.assertEquals(testTax, 1680, 0.0);
    }

    @Test (groups = {"functest"})
    public  void testCalculateDailySalary() {

        employee.setMonthlySalary(1000);
        employee.setWorkingDay(21);

        double testDailySalary = empBusinessLogic.calculateDailySalary(employee);
        Assert.assertEquals(testDailySalary, 47.61904761904762, 0.0);
    }

    @Test (groups = {"functest"})
    public void timeTestOne() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Time test method one");
    }

    @Test(groups = {"functest"})
    public void timeTestTwo() throws InterruptedException {
        Thread.sleep(400);
        System.out.println("Time test method two");
    }
}