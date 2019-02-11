

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

/**
 * The test class MainApplicationTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MainApplicationTest
{
    private MainApplication mainApplication;
    
    @Before
    public void setUp()
    {MainApplication mainApplication = new MainApplication();
    }
    
    @Test
    public void sumTest()
    { double expected = 31.0;
        double a = 15.0;
        double b = 16.0;
       
      double actual = CoreFeatures.sum(a, b);
        Assert.assertEquals("Values should be equal", expected, actual, 0.0);
    
        
    }
    
    @Test
    public void differenceTest()
    { double expected = 11.0;
        double a = 22.0;
        double b = 11.0;
       
      double actual = CoreFeatures.difference(a, b);
        Assert.assertEquals("Values should be equal", expected, actual, 0.0);
    
        
    }
    
    @Test
    public void productTest()
    { double expected = 30.0;
        double a = 5.0;
        double b = 6.0;
       
      double actual = CoreFeatures.product(a, b);
        Assert.assertEquals("Values should be equal", expected, actual, 0.0);
    
        
    }
    
    @Test
    public void division_1Test()
    { double expected = 4.0;
        double a = 28.0;
        double b = 7.0;
       
      double actual = CoreFeatures.division(a, b);
        Assert.assertEquals("Values should be equal", expected, actual, 0.0);
    
        
    }
    
    @Test
    public void division_2Test(){
        
        double expected = Double.POSITIVE_INFINITY;
        double a = 28.0;
        double b = 0.0;
        double actual = CoreFeatures.division(a,b); 
        Assert.assertEquals("Values should be equal", expected, actual, 0.0);
        
  } 
      
    
    @Test
    public void squareTest()
    { double expected = 49.0;
        double a = 7.0;
      double actual = CoreFeatures.square(a);
        Assert.assertEquals("Values should be equal", expected, actual, 0.0);    
    }
    
    @Test
    public void squarerootTest()
    { double expected = 9.0;
        double a = 81.0;
      double actual = CoreFeatures.squareroot(a);
        Assert.assertEquals("Values should be equal", expected, actual, 0.0);
    
        
    }
    
    @Test
    public void exponentialTest()
    { double expected = 343.0;
        double a = 7.0;
        double b = 3.0;
      double actual = CoreFeatures.exponential(a, b);
        Assert.assertEquals("Values should be equal", expected, actual, 0.0);
    
        
    }
    
    @Test
    public void inverseOfNumber()
    { double expected = 1/52.0;
        double a = 52.0;
      double actual = CoreFeatures.inverseOfNumber(a);
        Assert.assertEquals("Values should be equal", expected, actual, 0.0);
    }
    
    
     @Test
    public void positiveOrNegative()
    { double expected = -18.0;
        double a = 18.0;
      double actual = CoreFeatures.positiveOrNegative(a);
        Assert.assertEquals("Values should be equal", expected, actual, 0.0);
        
    }
    
    // Scientific Calculator
    
     @Test
    public void sinTest()
    { double expected = 0.5;
        double a = 30;
      double actual = scientificCalculator.sin(a);
        Assert.assertEquals("Values should be equal", expected, actual, 0.01);
    }
    
     @Test
    public void cosTest()
    { double expected = 0.5;
        double a = 60;
      double actual = scientificCalculator.cos(a);
        Assert.assertEquals("Values should be equal", expected, actual, 0.01);
    }
    
     @Test
    public void tanTest()
    { double expected = 1;
        double a = 45;
      double actual = scientificCalculator.tan(a);
        Assert.assertEquals("Values should be equal", expected, actual, 0.01);
    }
    
     @Test
    public void arcsinTest()
    { double expected = 90;
        double a = 1;
      double actual = scientificCalculator.arcsin(a);
        Assert.assertEquals("Values should be equal", expected, actual, 0.01);
    }
    
     @Test
    public void arccosTest()
    { double expected = 90;
        double a = 0;
      double actual = scientificCalculator.arccos(a);
        Assert.assertEquals("Values should be equal", expected, actual, 0.01);
    }
    
     @Test
    public void arctanTest()
    { double expected = 45;
        double a = 1;
      double actual = scientificCalculator.tan(a);
        Assert.assertEquals("Values should be equal", expected, actual, 0.01);
    }

    @After
    public void tearDown()
    {
    }
}
