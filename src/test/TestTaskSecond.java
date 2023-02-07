import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestTaskSecond {
    private final String expected;
    private final int firstNumber;
    private final int secondNumber;

    public TestTaskSecond(String expected, int firstNumber, int secondNumber) {
        this.expected = expected;
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }
   @Parameterized.Parameters
    public static Collection<Object[]> setParam(){
        return Arrays.asList(new Object[][]{
                {"1234",12,34},
                {"56578",565,78},
                {"1000",100, 0},
                {"456798",4567,98},
        });
    }
    @Test
    public void testTask(){
        TaskSecond taskSecond =new TaskSecond();
        Assert.assertEquals(expected,taskSecond.setPass(firstNumber,secondNumber));
    }
}
