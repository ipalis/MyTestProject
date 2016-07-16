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

    @Test (groups = {"datatest"})
    public void testCalculateVacation(){

        employee.setWorkingMonth(6);

        int vacationsDay = empBusinessLogic.calculateVacation(employee);
        Assert.assertEquals(12, 12);
    }
}