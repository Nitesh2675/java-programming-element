import java.util.Scanner;

public class PurchaseCalculator2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
  
        System.out.print("Enter the unit price of the item: ");
        double unitPrice = input.nextDouble();

        System.out.print("Enter the quantity: ");
        int quantity = input.nextInt();
        
        double totalPrice = unitPrice * quantity;
     
        System.out.println(String.format("The total purchase price is INR %.2f if the quantity %d and unit price is INR %.2f", 
                                           totalPrice, quantity, unitPrice));
        
    
    }
}
