import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class BMICalculatorTest {
    /**
     * "very severely underweight"  -> 15.0
     * "severely underweight",      -> 16.0
     * "underweight",               -> 18.5
     * "normal",                    -> 25
     * "overweight",                -> 30
     * "moderate obese",            -> 35
     * "severely obese",            -> 40
     * "very severely obese",       -> 45
     * "morbidly obese",            -> 50
     * "super obese",               -> 60
     * "hyper obese"                -> 1000
     */
   @Test
    public void very_severely_underweight(){
       BMICalculator bmi = new BMICalculator(1.80, 35.0);
       assertTrue(bmi.calculate().equals("Your BMI index is 10,80"));
       assertTrue(bmi.interpret().equals("You are very severely underweight."));
   }

    @Test
    public void severely_underweight(){
        BMICalculator bmi = new BMICalculator(1.80, 50.0);
        Assert.assertTrue(bmi.calculate().equals("Your BMI index is 15,43"));
        Assert.assertTrue(bmi.interpret().equals("You are severely underweight."));
    }

    @Test
    public void underweight(){
        BMICalculator bmi = new BMICalculator(1.80, 55.0);
        Assert.assertTrue(bmi.calculate().equals("Your BMI index is 16,98"));
        Assert.assertTrue(bmi.interpret().equals("You are underweight."));
    }

    @Test
    public void normalWeight(){
        BMICalculator bmi = new BMICalculator(1.80, 65.0);
        Assert.assertTrue(bmi.calculate().equals("Your BMI index is 20,06"));
        Assert.assertTrue(bmi.interpret().equals("You are normal."));
    }

    @Test
    public void moderate_obese(){
        BMICalculator bmi = new BMICalculator(1.80, 105.0);
        Assert.assertTrue(bmi.calculate().equals("Your BMI index is 32,41"));
        Assert.assertTrue(bmi.interpret().equals("You are moderate obese."));
    }

    @Test
    public void severely_obese(){
        BMICalculator bmi = new BMICalculator(1.80, 115.0);
        Assert.assertTrue(bmi.calculate().equals("Your BMI index is 35,49"));
        Assert.assertTrue(bmi.interpret().equals("You are severely obese."));
    }

    @Test
    public void very_severely_obese(){
        BMICalculator bmi = new BMICalculator(1.80, 135.0);
        Assert.assertTrue(bmi.calculate().equals("Your BMI index is 41,67"));
        Assert.assertTrue(bmi.interpret().equals("You are very severely obese."));
    }

    @Test
    public void morbidly_obese(){
        BMICalculator bmi = new BMICalculator(1.80, 150.0);
        Assert.assertTrue(bmi.calculate().equals("Your BMI index is 46,30"));
        Assert.assertTrue(bmi.interpret().equals("You are morbidly obese."));
    }

    @Test
    public void super_obese(){
        BMICalculator bmi = new BMICalculator(1.80, 165.0);
        Assert.assertTrue(bmi.calculate().equals("Your BMI index is 50,93"));
        Assert.assertTrue(bmi.interpret().equals("You are super obese."));
    }

    @Test
    public void hyper_obese(){
        BMICalculator bmi = new BMICalculator(1.80, 220.0);
        Assert.assertTrue(bmi.calculate().equals("Your BMI index is 67,90"));
        Assert.assertTrue(bmi.interpret().equals("You are hyper obese."));
    }
}
