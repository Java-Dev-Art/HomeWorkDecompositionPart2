import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
@RunWith(Parameterized.class)
public class TestTaskArmstrongNumber {
    private final boolean expected;
    private final int number;

    public TestTaskArmstrongNumber(boolean expected, int number) {
        this.expected = expected;
        this.number = number;
    }
    @Parameterized.Parameters
    public static Collection<Object[]> setParameter(){
        return Arrays.asList(new Object[][]{
                {true,1},
                {true,2},
                {true,153},
                {false,152},
                {false,100},
                {true,370},
                {true,8208},
                {false,1200},
                {true,1_741_725},
        });
    }
    @Test
    public void setTest(){
        TaskArmstrongNumber armstrongNumber = new TaskArmstrongNumber();
        Assert.assertEquals(expected,armstrongNumber.isArmstrong(number));
    }
}
