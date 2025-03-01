import java.util.Scanner;

public class BasicCalculator2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double number1 = input.nextDouble();
        
        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();

        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;
 
        System.out.println(String.format("The addition, subtraction, multiplication, and division of %.2f and %.2f are %.2f, %.2f, %.2f, and %.2f", 
            number1, number2, addition, subtraction, multiplication, division));
        
    }
}
