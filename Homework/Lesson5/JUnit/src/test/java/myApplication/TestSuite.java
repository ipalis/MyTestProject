package myApplication;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Suite;
@RunWith(Suite.class)
@Suite.SuiteClasses({
        EmployeeOfCompanyTest1.class,
        EmployeeOfCompanyTest2.class,
        ParameterizedTest.class
})
public class TestSuite {
}