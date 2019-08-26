package calculate.tip.paula.adams;
import java.util.Scanner; // Importing the Scanner
public class CalculateTipPaulaAdams
{
    public static void main(String[] args)
    {
        // Create a scanner to read bill and gratuity rate
        Scanner input = new Scanner(System.in);
        double bill;
        double gratuityRate;
        double gratuity;
        double totalBill;
      
        //Prompt user to input bill
        System.out.print("Enter Bill: $");
        bill = input.nextDouble();
        
        //Prompt user to input gratuity rate
        System.out.print("Enter Gratuity Rate: ");
        gratuityRate = input.nextDouble() * .01;
        
        // Calculate gratuity 
        gratuity = bill * gratuityRate;
        //Display gratuity 
        System.out.println(String.format("Gratuity: $%.2f", gratuity));
        // Calculate bill and gratuity combined 
        totalBill = gratuity + bill;
        System.out.print(String.format("Total Bill: $%.2f", totalBill));
        
 
    }
    
}
