import java.util.Scanner;

public class TriangleAreaCalculator2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the base of the triangle in cm: ");
        double base = input.nextDouble();
        
        System.out.print("Enter the height of the triangle in cm: ");
        double height = input.nextDouble();
        
        double areaSqCm = 0.5 * base * height;

        double areaSqIn = areaSqCm / 6.4516;

        System.out.println(String.format("The Area of the triangle in sq in is %.2f and sq cm is %.2f", areaSqIn, areaSqCm));

    }
}
