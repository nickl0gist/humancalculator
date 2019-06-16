import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double height = asker(sc, "What is your height in meters?");
        double weight = asker(sc, "What is your weight in kilograms?");

        BMICalculator bmi = new BMICalculator(height, weight);

        System.out.println(bmi.calculate());
        System.out.println(bmi.interpret());
        sc.close();
    }

    private static double asker(Scanner sc, String str){
        System.out.println(str);
        while(true){
           try {
               double answer = Double.parseDouble(sc.next().replace(",","."));
               if (answer > 0){
                   return answer;
               } else {
                   System.out.println("You gave wrong value! Try again. \n" + str);
               }
           } catch (NumberFormatException e){
               System.out.println("You gave wrong value! Try again. \n" + str);
           }
        }
    }
}
