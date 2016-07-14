package myApplication;

import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;

import static org.hamcrest.core.StringStartsWith.startsWith;
import static org.junit.Assert.*;

public class EmployeeOfCompanyTest {

    private EmployeeOfCompany employee;

    @BeforeClass
    public static void init() {

        System.out.println("Perform before test class");
    }

    @AfterClass
    public static void finish() {

        System.out.println("Perform after test class");
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
        assertEquals("Calculate Salary doesn't work", 850, employee.calculateSalary(500, (float) 1.5, 100));
    }

    @Test
    public void testOneHourCost() {
        assertEquals("One Hour Cost doesn't work", 30, employee.oneHourCost(1200, 40));
    }

    @Test
    public void testDecrSalary() {
        assertEquals("Decrease Salary doesn't work", 900, employee.decrSalary(100));
    }

    @Test
    public void testIsValidEmployee() {
        assertTrue(String.valueOf(true), employee.isValidEmployee(1035, "Jim", "White"));
    }

    @Test
    public void testIsHasDriversLicense() {

        assertTrue(String.valueOf(true), employee.isHasDriversLicense(true));
    }

    @Test(timeout = 1000)
    public void testLimitTimeout() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Ignore("Get Salary will be tests later")
    @Test
    public void testGetSalary() {
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

    }

    @Test
    public void throwsNullPointerException() {
        thrown.expect(NullPointerException.class);
        throw new NullPointerException();
    }

    @Test
    public void throwsNullPointerExceptionWithMessage() {
        thrown.expect(NullPointerException.class);
        thrown.expectMessage("happened?");
        thrown.expectMessage(startsWith("What"));
        throw new NullPointerException("What happened?");
    }

    @Test
    public void testGetName() {
        assertEquals("Get name doesn't work!", "John Smith", employee.getName("John ", "Smith"));
    }

    @Test
    public void testGetworkingHoursQuantity() {

        assertEquals("Does not work!", 40, employee.getWorkingHoursQuantity(40));
    }

    @Test
    public void testCalculateSalaryUp() {

        assertEquals(1100, employee.calculateSalaryUp(1.1), 0);
    }

    @Test
    public void testCalculateYearlySalary(){
        assertEquals("Calculate doesn't work!", 12000, employee.calculateYearlySalary(1000));
    }
}