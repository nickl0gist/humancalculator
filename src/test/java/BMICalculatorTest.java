import org.junit.Assert;
import org.junit.Test;

public class BMICalculatorTest {

   /**
    * Wartość	            Co oznacza?
    * BMI < 18,5	        niedowaga
    * 18,5 ≤ BMI < 25	    waga prawidłowa
    * 25 ≤ BMI < 30	        nadwaga
    * BMI >= 30             otyłość
    */

   @Test
    public void underWeight (){
       BMICalculator bmi = new BMICalculator(1.80, 55.0);
       Assert.assertTrue(bmi.calculate().equals("Your BMI index is 16,98"));
       Assert.assertTrue(bmi.interpret().equals("You are underweight."));
   }

    @Test
    public void normalWeight (){
        BMICalculator bmi = new BMICalculator(1.80, 70.0);
        Assert.assertTrue(bmi.calculate().equals("Your BMI index is 21,60"));
        Assert.assertTrue(bmi.interpret().equals("Your BMI is in normal condition."));
    }

    @Test
    public void overWeight (){
        BMICalculator bmi = new BMICalculator(1.80, 90.0);
        Assert.assertTrue(bmi.calculate().equals("Your BMI index is 27,78"));
        Assert.assertTrue(bmi.interpret().equals("You are overweight!"));
    }

    @Test
    public void obesityWeight (){
        BMICalculator bmi = new BMICalculator(1.80, 120.0);
        System.out.println(bmi.calculate());
        Assert.assertTrue(bmi.calculate().equals("Your BMI index is 37,04"));
        Assert.assertTrue(bmi.interpret().equals("You are obese!"));

    }

}
