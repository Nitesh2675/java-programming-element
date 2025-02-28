public class ProfitLossCalculator {
    public static void main(String[] args) {
 
        double costPrice = 129;
        double sellingPrice = 191;
        
 
        double profit = sellingPrice - costPrice;
   
        double profitPercentage = (profit / costPrice) * 100;
        

        System.out.println(String.format("The Cost Price is INR %.2f and Selling Price is INR %.2f\n"
                          + "The Profit is INR %.2f and the Profit Percentage is %.2f", 
                          costPrice, sellingPrice, profit, profitPercentage));
    }
}
