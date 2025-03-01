import java.util.Scanner;

public class QuotientReminderCalculator {
    public static void main(String[] args) {
   
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();
        
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();
        
        int quotient = number1 / number2;
        int remainder = number1 % number2;
        
   
        System.out.println(String.format("The Quotient is %d and Reminder is %d of two number %d and %d", 
            quotient, remainder, number1, number2));

    }
}
