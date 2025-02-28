import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your height in centimeters: ");
        double heightCm = input.nextDouble();
        
        double cmToInches = 2.54;
        double inchesToFeet = 12;
        
        double totalInches = heightCm / cmToInches;

        int feet = (int) (totalInches / inchesToFeet);
        double inches = totalInches % inchesToFeet;
        
        System.out.println(String.format("Your Height in cm is %.2f while in feet is %d and inches is %.2f", heightCm, feet, inches));
        
        input.close();
    }
}
