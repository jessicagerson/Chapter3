import java.util.Scanner;
import java.util.Random;
 
public class Stars
{
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args)
    {
          bigToSmall();
          //smallToBig();
          //oppositeBigToSmall();
          //diamond();

        }
         public static void bigToSmall(){
        System.out.println("How many stars do you want in the longest row?");
        int maxNum = scan.nextInt();
        int i;
            for (i = 0; i <= maxNum; i++){
            for (i = 0; i<=maxNum; i++){
                System.out.print("*");
            }
        }
    }
}