import java.util.Scanner;

public class CaloriesBurned {
   public static void main(String[] args) {

      Scanner scnr = new Scanner(System.in);
      double age;
      double weight;
      double heartRate;
      double time;
      double womenCalories;
      double menCalories;
      age = scnr.nextDouble();
      weight = scnr.nextDouble();
      heartRate =  scnr.nextDouble();
      time =  scnr.nextDouble();

      womenCalories = age * 0.074;
      womenCalories -= weight * 0.05741;
      womenCalories += heartRate * 0.4472;
      womenCalories -= 20.4022;
      womenCalories *= time;
      womenCalories /= 4.184;
      System.out.printf("Women: %.2f calories\n", womenCalories);

      menCalories = age * 0.2017;
      menCalories += weight * 0.09036;
      menCalories += heartRate * 0.6309;
      menCalories -= 55.0969;
      menCalories *= time;
      menCalories /= 4.184;
      System.out.printf("Men: %.2f calories\n", menCalories);

   }
}