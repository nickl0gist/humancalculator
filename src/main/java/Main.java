import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your height?");
        double height = sc.nextDouble();
        System.out.println("What is your weight?");
        double weight = sc.nextDouble();

        BMICalculator bmi = new BMICalculator(height, weight);

        System.out.println(bmi.calculate());
        System.out.println(bmi.interpret());
        sc.close();
    }
}
