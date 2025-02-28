import java.util.Scanner;

public class KilometerToMile{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter distance in kilometers: ");
        double km = input.nextDouble();
        
        double conversionFactor = 1.6;
        
        double miles = km / conversionFactor;
        
        System.out.println(String.format("The total miles is %.2f mile for the given %.2f km", miles, km));
        
        input.close();
    }
}
