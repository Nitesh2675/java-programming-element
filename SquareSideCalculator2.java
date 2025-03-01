import java.util.Scanner;

public class SquareSideCalculator2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
   
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();

        double side = perimeter / 4;
        
        System.out.println(String.format("The length of the side is %.2f whose perimeter is %.2f", side, perimeter));
;
    }
}
