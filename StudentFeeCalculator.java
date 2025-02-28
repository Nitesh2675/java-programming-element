import java.util.Scanner;

public class StudentFeeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Student Fee: ");
        double fee = input.nextDouble();
        
        System.out.print("Enter University Discount Percentage: ");
        double discountPercent = input.nextDouble();
        
        double discountAmount = (discountPercent / 100) * fee;
        
        double discountedFee = fee - discountAmount;
		
        System.out.println(String.format("The discount amount is INR %.2f and final discounted fee is INR %.2f", discountAmount, discountedFee));
       
        input.close();
    }
}
