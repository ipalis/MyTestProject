package myApplication;

import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;

import static org.hamcrest.core.StringStartsWith.startsWith;
import static org.junit.Assert.*;

public class EmployeeOfCompanyTest1 {

    private EmployeeOfCompany employee;
    private static int count = 0;

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Count before Test Suite 1 is : " + count);
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("Count after Test Suite 1 is : " + count);
    }

    @Before
    public void createObject() {

        employee = new EmployeeOfCompany();
    }

    @After
    public void tearDown() {
        employee = null;
    }

    @Test
    public void testCalculateSalary() {
        count++;
        assertEquals("Calculate Salary doesn't work", 850, employee.calculateSalary(500, (float) 1.5, 100));
    }

    @Test
    public void testOneHourCost() {

        count++;
        assertEquals("One Hour Cost doesn't work", 30, employee.oneHourCost(1200, 40));
    }

    @Test
    public void testDecrSalary() {

        count++;
        assertEquals("Decrease Salary doesn't work", 900, employee.decrSalary(100));
    }

    @Test(timeout = 1000)
    public void testLimitTimeout() {

        count++;
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Ignore("Get Salary will be tests later")
    @Test

    public void testGetSalary() {
        count++;
        assertEquals(1000, employee.getSalary(1000));
    }

    @Rule
    public TestRule globalTimeout;

    {
        globalTimeout = new Timeout(1000);
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void throwsNothing() {
        count++;
    }

    @Test
    public void throwsNullPointerException() {

        count++;
        thrown.expect(NullPointerException.class);
        throw new NullPointerException();
    }

    @Test
    public void throwsNullPointerExceptionWithMessage() {

        count++;
        thrown.expect(NullPointerException.class);
        thrown.expectMessage("happened?");
        thrown.expectMessage(startsWith("What"));
        throw new NullPointerException("What happened?");
    }

    @Test
    public void testGetworkingHoursQuantity() {

        count++;
        assertEquals("Does not work!", 40, employee.getWorkingHoursQuantity(40));
    }

    @Test
    public void testCalculateSalaryUp() {

        count++;
        assertEquals(1100, employee.calculateSalaryUp(1.1), 0);
    }

    @Test
    public void testCalculateYearlySalary(){

        count++;
        assertEquals("Calculate doesn't work!", 12000, employee.calculateYearlySalary(1000));
    }

}
