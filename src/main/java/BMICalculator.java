import java.util.Arrays;

public class BMICalculator implements HumanCalculator{

    double[] limitValues = {15.0,16.0,18.5,25,30,35,40,45,50,60,1000};
    String[] labels = {"very severely underweight",
            "severely underweight",
            "underweight",
            "normal",
            "overweight",
            "moderate obese",
            "severely obese",
            "very severely obese",
            "morbidly obese",
            "super obese",
            "hyper obese"};

    private double height;
    private double weight;
    private double index;

    public BMICalculator(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String calculate() {
        index = weight / (height * height);
        return String.format("Your BMI index is %.2f", index);
    }


    /**
     * @return String of interpreted BMI
     *
     * Wartość	            Co oznacza?
     * BMI < 18,5	        niedowaga
     * 18,5 ≤ BMI < 25	    waga prawidłowa
     * 25 ≤ BMI < 30	    nadwaga
     * BMI >= 30            otyłość
     */
    @Override
    public String interpret() {
        int search = -Arrays.binarySearch(limitValues, index)-1;
        return "You are " + labels[search] + ".";
    }
}
