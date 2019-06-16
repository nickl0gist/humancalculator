import org.junit.Assert;
import org.junit.Test;

public class BMICalculatorTest {


   /**
    * Wartość	            Co oznacza?
    * BMI < 18,5	        niedowaga
    * 18,5 ≤ BMI < 25	    waga prawidłowa
    * 25 ≤ BMI < 30	    nadwaga
    * BMI >= 30              otyłość
    */

   @Test
    public void underWeight (){
       BMICalculator bmi = new BMICalculator(1.80, 55.0);
       Assert.assertTrue(bmi.calculate() < BMICalculator.BOTTOM_BORDER);
   }

    @Test
    public void normalWeight (){
        BMICalculator bmi = new BMICalculator(1.80, 70.0);
        Assert.assertTrue(bmi.calculate() >= BMICalculator.BOTTOM_BORDER && bmi.calculate() < BMICalculator.NORMAL_BORDER);
    }

    @Test
    public void overWeight (){
        BMICalculator bmi = new BMICalculator(1.80, 90.0);
        Assert.assertTrue(bmi.calculate() >= BMICalculator.NORMAL_BORDER && bmi.calculate() < BMICalculator.UPPER_BORDER);
    }

    @Test
    public void obesityWeight (){
        BMICalculator bmi = new BMICalculator(1.80, 120.0);
        Assert.assertTrue(bmi.calculate() >= BMICalculator.UPPER_BORDER);
    }

}
