import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Date;


public class ParamTest {

    private EmpBusinessLogic empBusinessLogic;
    private EmployeeDetails employee;

        @BeforeMethod
        public void initialize() {
            empBusinessLogic = new EmpBusinessLogic();
            employee = new EmployeeDetails();
        }

        @DataProvider(name = "exampletest2")
        public static Object[][] expiredDates() {
            return new Object[][] {
                    {"8/7/2017", true},
                    {"15/10/2015", false},
                    {"10/02/2018", true}
            };
        }

        // This test will run 3 times
        @Test(dataProvider = "exampletest2")
        public void testCheckExpireDateId (String inputDate, boolean expectedResult) {
            Date newDate = new Date(inputDate );
            System.out.println("Input date: " + inputDate + " Expected result: " + expectedResult);
            employee.setDateExpire(newDate);
            boolean check = empBusinessLogic.checkExprireDateId(employee);
            Assert.assertEquals(check, expectedResult);
        }
    }