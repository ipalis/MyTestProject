/*package myApplication;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class ParameterizedTest {

    public int baseRate;
    public float experienceRatio;
    public int bonus;
    public int expectedResult;

    public ParameterizedTest(int baseRate, float experienceRatio, int bonus,  int expectedResult) {
        this.baseRate = baseRate;
        this.experienceRatio = experienceRatio;
        this.bonus = bonus;
        this.expectedResult = expectedResult;
    }

    @Test
    public void testCalculateSalary() {
        EmployeeOfCompany empl = new EmployeeOfCompany();
        int result = empl.calculateSalary();
        Assert.assertEquals("Результат(" + result + ") не равен " + expectedResult, result == expectedResult);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getTestData() {
        return Arrays.asList(new Object[][]{
                {500, 1.5, 100, 850},
                {600, 1.5, 100, 1000}
        });
    }

}*/