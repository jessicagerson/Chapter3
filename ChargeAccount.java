
 
import java.util.Scanner;
import java.text.NumberFormat;
 
public class ChargeAccount
{
   public static void main (String[] args)
   {
           double previousbalance;  
           double additionalcharges;             
           double newbalance;
           double minimum;
                      
 
           Scanner scan = new Scanner(System.in);
 
           System.out.print ("Enter the previous balance: ");
           previousbalance = scan.nextDouble();
           System.out.print ("Enter the additional charges: ");
           additionalcharges = scan.nextDouble();
 
           newbalance = ((previousbalance + additionalcharges)*0.02)+(previousbalance + additionalcharges);
           
           if (newbalance < 50){
               minimum = newbalance;
            }
           else if (newbalance >= 50 && newbalance <= 300){
               minimum = 50.00;
            }
           else{
               minimum = (0.2 * newbalance);
            }

           
 
           // Print the results
           NumberFormat money = NumberFormat.getCurrencyInstance();
           System.out.println();
           System.out.println( "CS CARD International Statement");
           System.out.println( "================================");
           System.out.println("Prevoius Balance:           " + money.format(previousbalance));
           System.out.println("Additional Charges:         " + money.format(additionalcharges));
           System.out.println("New Balance:                " + money.format(newbalance));
           System.out.println("Minimum Payment:            " + money.format(minimum));
           System.out.println();
        }
}

