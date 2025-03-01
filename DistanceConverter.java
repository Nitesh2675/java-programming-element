import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
   
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = input.nextDouble();

        double feetToYards = 1.0 / 3.0;
        double yardsToMiles = 1.0 / 1760.0;
        

        double distanceInYards = distanceInFeet * feetToYards;
        double distanceInMiles = distanceInYards * yardsToMiles;
        

        System.out.println(String.format("The distance in yards is %.2f and in miles is %.2f", distanceInYards, distanceInMiles));
        
    }
}
