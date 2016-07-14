package myApplication;

import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class EmployeeOfCompanyTest2 {

    private EmployeeOfCompany employee;
    private static int count = 0;

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Count before Test Suite 2 is : " + count);
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("Count after Test Suite 2 is : " + count);
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
    public void testIsValidEmployee() {
        count++;
        assertTrue(String.valueOf(true), employee.isValidEmployee(1035, "Jim", "White"));
    }

    @Test
    public void testIsHasDriversLicense() {

        count++;
        assertTrue(String.valueOf(true), employee.isHasDriversLicense(true));
    }

    @Test
    public void testGetName() {

        count++;
        assertEquals("Get name doesn't work!", "John Smith", employee.getName("John ", "Smith"));
    }

    @Test
    public void testGetworkingHoursQuantity() {

        count++;
        assertEquals("Does not work!", 40, employee.getWorkingHoursQuantity(40));
    }
}
