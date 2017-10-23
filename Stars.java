import java.util.Scanner;
import java.util.Random;
 
public class Stars
{
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args)
    {
        bigToSmall();
          
        System.out.println("How many stars do you want in the longest row?");
        int maxNumber = scan.nextInt();
        String it = " ";
        
        smallToBig(it, maxNumber);
          //oppositeBigToSmall();
          //diamond();

        }
         public static void bigToSmall(){
        System.out.println("How many stars do you want in the longest row?");
        int maxNum = scan.nextInt();
        for (int row = maxNum; row >= 0; row--){
            for (int star = 1; star <= row; star++){
                 System.out.print("*");
                }
            System.out.println();
        }
    }
    
        public static void smallToBig(String it, int maxNumber){

        for (int rows = maxNumber; rows >0 ; rows--){
            
                 print(" ", rows );
                 print("*", (maxNumber - rows));
                
                 System.out.println();
        }
        
    }
    
    public static void print(String thing, int num) {
        for(int i = 0; i < num; i++) {
            System.out.print(thing);
        }
        
    }
}