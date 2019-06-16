public class BMICalculator implements HumanCalculator{

    public static final double BOTTOM_BORDER = 18.5;
    public static final double NORMAL_BORDER = 25.0;
    public static final double UPPER_BORDER = 30.0;

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
        if (index < BMICalculator.BOTTOM_BORDER)
            return "You are underweight.";
        if(index >= BMICalculator.BOTTOM_BORDER && index < BMICalculator.NORMAL_BORDER)
            return "Your BMI is in normal condition.";
        if(index >= BMICalculator.NORMAL_BORDER && index < BMICalculator.UPPER_BORDER)
            return "You are overweight!";
        if(index >= BMICalculator.UPPER_BORDER)
            return "You are obese!";
        return null;
    }
}
