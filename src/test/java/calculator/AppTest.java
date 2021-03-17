package calculator;

import static org.junit.Assert.assertTrue;
import calculator.App;

import org.junit.Test; 
import org.junit.Assert; 
import org.junit.Before;

public class AppTest 
{
    private App CalcAppUnderTest;

    @Before
    public void setUp() 
    {
        // Arrange
        CalcAppUnderTest = new App();
    }


    // 1. Legal Arguments
    // 1.1 True Cases

    @Test
    public void testTrueSquareRoot() 
    { 
        double a = 25; 
        double expectedResult = 5.0;
        //Act 
        double result = CalcAppUnderTest.sqroot(a);
        //Assert
        Assert.assertEquals(expectedResult, result, 0.0f);
    }

    @Test
    public void testTrueFact() 
    { 
        double a = 5; 
        double expectedResult = 120.0;
        //Act 
        double result = CalcAppUnderTest.fact(a);
        //Assert
        Assert.assertEquals(expectedResult, result, 0.0f);
    }
    
    @Test
    public void testTrueNatlog() 
    { 
        double a = 5; 
        double expectedResult = 1.60;
        //Act 
        double result = CalcAppUnderTest.natlog(a);
        //Assert
        Assert.assertEquals(expectedResult, result, 0.02f);
    }
    
    @Test
    public void testTruePowerf() 
    { 
        double b = 5; 
        double e = 3;
        double expectedResult = 125.0;
        //Act 
        double result = CalcAppUnderTest.powerf(b, e);
        //Assert
        Assert.assertEquals(expectedResult, result, 0.0f);
    }

    // 1.2 False Cases

    @Test
    public void testFalseSquareRoot() 
    { 
        double a = 5; 
        double notexpectedResult = 4.0;
        //Act 
        double result = CalcAppUnderTest.sqroot(a);
        //Assert
        Assert.assertNotEquals(notexpectedResult, result, 0.0f);
    }

    @Test
    public void testFalseFact() 
    { 
        double a = 25; 
        double notexpectedResult = 720.0;
        //Act 
        double result = CalcAppUnderTest.fact(a);
        //Assert
        Assert.assertNotEquals(notexpectedResult, result, 0.0f);
    }
    
    @Test
    public void testFalseNatlog() 
    { 
        double a = 3; 
        double notexpectedResult = 0.60;
        //Act 
        double result = CalcAppUnderTest.natlog(a);
        //Assert
        Assert.assertNotEquals(notexpectedResult, result, 0.02f);
    }
    
    @Test
    public void testFalsePowerf() 
    { 
        double b = 4; 
        double e = 3;
        double notexpectedResult = 25.0;
        //Act 
        double result = CalcAppUnderTest.powerf(b, e);
        //Assert
        Assert.assertNotEquals(notexpectedResult, result, 0.0f);
    }

    // 2. Illegal Arguments
    @Test(expected = IllegalArgumentException.class)
    public void testNegativeArgumentsSqroot() 
    { 
        double a = -15; 
        CalcAppUnderTest.sqroot(a);
    } 

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeArgumentsFact() 
    { 
        double a = -15; 
        CalcAppUnderTest.fact(a);
    } 

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeArgumentsNatlog() 
    { 
        double a = -15; 
        CalcAppUnderTest.natlog(a);
    } 

    @Test(expected = IllegalArgumentException.class)
    public void testZeroArgumentsNatlog() 
    { 
        double a = 0; 
        CalcAppUnderTest.natlog(a);
    } 

    @Test(expected = IllegalArgumentException.class)
    public void testZeroNegativeArgumentsPowerf() 
    { 
        double b = 0;
        double e = -2; 
        CalcAppUnderTest.powerf(b, e);
    } 

    @Test(expected = IllegalArgumentException.class)
    public void testZeroZeroArgumentsPower() 
    { 
        double b = 0;
        double e = 0; 
        CalcAppUnderTest.powerf(b, e);
    } 
}
