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
        
        System.out.println("How many stars do you want in the longest row?");
        int maxNumber2 = scan.nextInt();
        String it2 = " ";
        oppositeBigToSmall(it2, maxNumber2);
        
        
        System.out.println("How many stars do you want in the middle(longest) row?");
        int maxNumber3 = scan.nextInt();
        String it3 = " ";
        diamond(it3, maxNumber3);

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
            public static void oppositeBigToSmall(String it2, int maxNumber2){

        for (int rows = maxNumber2; rows >0 ; rows--){
            print2(" ", (maxNumber2 - rows));
            print2("*", rows);    
            
                 
                
            System.out.println();
        }
        
    }
    
    public static void print2(String thing, int num) {
        for(int i = 0; i < num; i++) {
            System.out.print(thing);
        }
        
    }
                public static void diamond(String it3, int maxNumber3){

        for (int rows = maxNumber3; rows >0 ; rows -=2){
            
            print3(" ", ((rows-1)/2));
            print3("*", (maxNumber3 - (2*(rows-1)/2)));   
            print3(" ", ((rows-1)/2));
 
            System.out.println();
        }
        for (int rows = 0; rows < maxNumber3 ; rows +=2){
            
            print3(" ", ((maxNumber3 - rows) / 2));
            print3("*", (maxNumber3 - rows));   
            print3(" ", ((maxNumber3 - rows) /2));
 
            System.out.println();
        }
        
    }
    public static void print3(String thing, int num) {
        for(int i = 0; i < num; i++) {
            System.out.print(thing);
        }
    }
}