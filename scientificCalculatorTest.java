

import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class scientificCalculatorTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class scientificCalculatorTest
{
    /**
     * Default constructor for test class scientificCalculatorTest
     */
    public scientificCalculatorTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }
    
    @Test
    public void testSin() {
        // : Given
        double expected = 1.0;
        double input1 = 90;

        // : When
        double actual = scientificCalculator.sin(input1);

        // : Then
        Assert.assertEquals(expected, actual, 0.01);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
