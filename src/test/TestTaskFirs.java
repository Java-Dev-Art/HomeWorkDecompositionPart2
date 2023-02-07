import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestTaskFirs {
    private final boolean expected;
    private final int firstNumber;
    private final int secondNumber;
    private final int thirdNumber;


    public TestTaskFirs(boolean expected, int firstNumber, int secondNumber, int thirdNumber) {
        this.expected = expected;
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.thirdNumber = thirdNumber;

    }

    @Parameterized.Parameters
    public static Collection<Object[]> setParameters() {
        return Arrays.asList(new Object[][]{
                {true, 7, 11, 13},
                {true, 331, 463, 733},
                {true, 23, 29, 31},
                {true, 2, 3, 5},
                {false, 2, 4, 5},
                {true, 983, 991, 997}
        });
    }

    @Test
    public void testMethod() {
        TaskFirst taskFirst = new TaskFirst();
        Assert.assertEquals(expected, taskFirst.compareNumbers(firstNumber, secondNumber, thirdNumber));
    }
}
